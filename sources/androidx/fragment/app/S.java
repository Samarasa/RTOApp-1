package androidx.fragment.app;

import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.m;

class S implements k {

    /* renamed from: a  reason: collision with root package name */
    private m f1095a = null;

    S() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f1095a == null) {
            this.f1095a = new m(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(g.a aVar) {
        this.f1095a.b(aVar);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f1095a != null;
    }

    public g getLifecycle() {
        a();
        return this.f1095a;
    }
}
