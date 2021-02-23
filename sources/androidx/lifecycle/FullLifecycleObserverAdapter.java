package androidx.lifecycle;

import androidx.lifecycle.g;

class FullLifecycleObserverAdapter implements i {

    /* renamed from: a  reason: collision with root package name */
    private final C0172c f1194a;

    /* renamed from: b  reason: collision with root package name */
    private final i f1195b;

    FullLifecycleObserverAdapter(C0172c cVar, i iVar) {
        this.f1194a = cVar;
        this.f1195b = iVar;
    }

    public void a(k kVar, g.a aVar) {
        switch (C0173d.f1221a[aVar.ordinal()]) {
            case 1:
                this.f1194a.b(kVar);
                break;
            case 2:
                this.f1194a.f(kVar);
                break;
            case 3:
                this.f1194a.a(kVar);
                break;
            case 4:
                this.f1194a.c(kVar);
                break;
            case 5:
                this.f1194a.d(kVar);
                break;
            case 6:
                this.f1194a.e(kVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        i iVar = this.f1195b;
        if (iVar != null) {
            iVar.a(kVar, aVar);
        }
    }
}
