package b.a.d;

import android.view.View;
import b.h.j.F;
import b.h.j.G;

class h extends G {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2127a = false;

    /* renamed from: b  reason: collision with root package name */
    private int f2128b = 0;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ i f2129c;

    h(i iVar) {
        this.f2129c = iVar;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.f2128b = 0;
        this.f2127a = false;
        this.f2129c.b();
    }

    public void b(View view) {
        int i = this.f2128b + 1;
        this.f2128b = i;
        if (i == this.f2129c.f2130a.size()) {
            F f2 = this.f2129c.f2133d;
            if (f2 != null) {
                f2.b((View) null);
            }
            a();
        }
    }

    public void c(View view) {
        if (!this.f2127a) {
            this.f2127a = true;
            F f2 = this.f2129c.f2133d;
            if (f2 != null) {
                f2.c((View) null);
            }
        }
    }
}
