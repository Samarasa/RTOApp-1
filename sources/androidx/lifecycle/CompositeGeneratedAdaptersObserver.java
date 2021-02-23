package androidx.lifecycle;

import androidx.lifecycle.g;

class CompositeGeneratedAdaptersObserver implements i {

    /* renamed from: a  reason: collision with root package name */
    private final C0174e[] f1192a;

    CompositeGeneratedAdaptersObserver(C0174e[] eVarArr) {
        this.f1192a = eVarArr;
    }

    public void a(k kVar, g.a aVar) {
        r rVar = new r();
        for (C0174e a2 : this.f1192a) {
            a2.a(kVar, aVar, false, rVar);
        }
        for (C0174e a3 : this.f1192a) {
            a3.a(kVar, aVar, true, rVar);
        }
    }
}
