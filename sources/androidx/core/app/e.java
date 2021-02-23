package androidx.core.app;

import androidx.core.app.h;

class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h.a f857a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f858b;

    e(h.a aVar, Object obj) {
        this.f857a = aVar;
        this.f858b = obj;
    }

    public void run() {
        this.f857a.f870a = this.f858b;
    }
}
