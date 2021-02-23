package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.app.z;

class B extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z.f f130a;

    B(z.f fVar) {
        this.f130a = fVar;
    }

    public void onReceive(Context context, Intent intent) {
        this.f130a.d();
    }
}
