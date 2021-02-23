package androidx.room;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;

class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f1571a;

    m(o oVar) {
        this.f1571a = oVar;
    }

    public void run() {
        o oVar = this.f1571a;
        oVar.f1576d.b(oVar.f1577e);
        try {
            d dVar = this.f1571a.f1578f;
            if (dVar != null) {
                dVar.a(this.f1571a.f1580h, this.f1571a.f1575c);
            }
        } catch (RemoteException e2) {
            Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e2);
        }
        o oVar2 = this.f1571a;
        Context context = oVar2.f1573a;
        if (context != null) {
            context.unbindService(oVar2.j);
            this.f1571a.f1573a = null;
        }
    }
}
