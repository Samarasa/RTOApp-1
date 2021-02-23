package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import androidx.room.g;
import java.util.Set;

class n extends g.b {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o f1572b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n(o oVar, String[] strArr) {
        super(strArr);
        this.f1572b = oVar;
    }

    public void a(Set<String> set) {
        if (!this.f1572b.i.get()) {
            try {
                this.f1572b.f1578f.a(this.f1572b.f1575c, (String[]) set.toArray(new String[0]));
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot broadcast invalidation", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return true;
    }
}
