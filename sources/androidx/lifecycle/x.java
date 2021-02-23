package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;

class x extends C0171b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y f1248a;

    x(y yVar) {
        this.f1248a = yVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        z.a(activity).a(this.f1248a.i);
    }

    public void onActivityPaused(Activity activity) {
        this.f1248a.a();
    }

    public void onActivityStopped(Activity activity) {
        this.f1248a.d();
    }
}
