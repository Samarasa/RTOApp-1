package b.c.a;

import android.os.Bundle;

class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f2161a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Bundle f2162b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g f2163c;

    b(g gVar, int i, Bundle bundle) {
        this.f2163c = gVar;
        this.f2161a = i;
        this.f2162b = bundle;
    }

    public void run() {
        this.f2163c.f2178b.a(this.f2161a, this.f2162b);
        throw null;
    }
}
