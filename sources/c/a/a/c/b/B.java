package c.a.a.c.b;

import c.a.a.c.h;
import java.util.HashMap;
import java.util.Map;

final class B {

    /* renamed from: a  reason: collision with root package name */
    private final Map<h, u<?>> f2994a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<h, u<?>> f2995b = new HashMap();

    B() {
    }

    private Map<h, u<?>> a(boolean z) {
        return z ? this.f2995b : this.f2994a;
    }

    /* access modifiers changed from: package-private */
    public u<?> a(h hVar, boolean z) {
        return a(z).get(hVar);
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar, u<?> uVar) {
        a(uVar.f()).put(hVar, uVar);
    }

    /* access modifiers changed from: package-private */
    public void b(h hVar, u<?> uVar) {
        Map<h, u<?>> a2 = a(uVar.f());
        if (uVar.equals(a2.get(hVar))) {
            a2.remove(hVar);
        }
    }
}
