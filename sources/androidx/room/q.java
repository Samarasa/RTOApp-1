package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import androidx.room.d;

class q extends d.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MultiInstanceInvalidationService f1582a;

    q(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f1582a = multiInstanceInvalidationService;
    }

    public int a(c cVar, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.f1582a.f1508c) {
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f1582a;
            int i = multiInstanceInvalidationService.f1506a + 1;
            multiInstanceInvalidationService.f1506a = i;
            if (this.f1582a.f1508c.register(cVar, Integer.valueOf(i))) {
                this.f1582a.f1507b.a(i, str);
                return i;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f1582a;
            multiInstanceInvalidationService2.f1506a--;
            return 0;
        }
    }

    public void a(int i, String[] strArr) {
        synchronized (this.f1582a.f1508c) {
            String a2 = this.f1582a.f1507b.a(i);
            if (a2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = this.f1582a.f1508c.beginBroadcast();
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                try {
                    int intValue = ((Integer) this.f1582a.f1508c.getBroadcastCookie(i2)).intValue();
                    String a3 = this.f1582a.f1507b.a(intValue);
                    if (i != intValue && a2.equals(a3)) {
                        this.f1582a.f1508c.getBroadcastItem(i2).a(strArr);
                    }
                } catch (RemoteException e2) {
                    Log.w("ROOM", "Error invoking a remote callback", e2);
                } catch (Throwable th) {
                    this.f1582a.f1508c.finishBroadcast();
                    throw th;
                }
            }
            this.f1582a.f1508c.finishBroadcast();
        }
    }

    public void a(c cVar, int i) {
        synchronized (this.f1582a.f1508c) {
            this.f1582a.f1508c.unregister(cVar);
            this.f1582a.f1507b.d(i);
        }
    }
}
