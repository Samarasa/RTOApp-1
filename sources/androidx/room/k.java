package androidx.room;

import android.os.RemoteException;
import android.util.Log;

class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f1569a;

    k(o oVar) {
        this.f1569a = oVar;
    }

    public void run() {
        try {
            d dVar = this.f1569a.f1578f;
            if (dVar != null) {
                this.f1569a.f1575c = dVar.a(this.f1569a.f1580h, this.f1569a.f1574b);
                this.f1569a.f1576d.a(this.f1569a.f1577e);
            }
        } catch (RemoteException e2) {
            Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
        }
    }
}
