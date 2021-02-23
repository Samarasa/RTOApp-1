package androidx.room;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.room.d;

class j implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f1568a;

    j(o oVar) {
        this.f1568a = oVar;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1568a.f1578f = d.a.a(iBinder);
        o oVar = this.f1568a;
        oVar.f1579g.execute(oVar.k);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        o oVar = this.f1568a;
        oVar.f1579g.execute(oVar.l);
        o oVar2 = this.f1568a;
        oVar2.f1578f = null;
        oVar2.f1573a = null;
    }
}
