package androidx.work.impl.b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class c extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f1763a;

    c(d dVar) {
        this.f1763a = dVar;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            this.f1763a.a(context, intent);
        }
    }
}
