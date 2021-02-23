package androidx.core.app;

import android.app.Application;
import androidx.core.app.h;

class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Application f859a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h.a f860b;

    f(Application application, h.a aVar) {
        this.f859a = application;
        this.f860b = aVar;
    }

    public void run() {
        this.f859a.unregisterActivityLifecycleCallbacks(this.f860b);
    }
}
