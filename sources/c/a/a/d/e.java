package c.a.a.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

class e extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f3512a;

    e(f fVar) {
        this.f3512a = fVar;
    }

    public void onReceive(Context context, Intent intent) {
        f fVar = this.f3512a;
        boolean z = fVar.f3515c;
        fVar.f3515c = fVar.a(context);
        if (z != this.f3512a.f3515c) {
            if (Log.isLoggable("ConnectivityMonitor", 3)) {
                Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.f3512a.f3515c);
            }
            f fVar2 = this.f3512a;
            fVar2.f3514b.a(fVar2.f3515c);
        }
    }
}
