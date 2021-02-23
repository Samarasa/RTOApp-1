package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.lc  reason: case insensitive filesystem */
final class C0369lc implements C0424tc {

    /* renamed from: a  reason: collision with root package name */
    private C0424tc[] f4504a;

    C0369lc(C0424tc... tcVarArr) {
        this.f4504a = tcVarArr;
    }

    public final C0431uc a(Class<?> cls) {
        for (C0424tc tcVar : this.f4504a) {
            if (tcVar.b(cls)) {
                return tcVar.a(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    public final boolean b(Class<?> cls) {
        for (C0424tc b2 : this.f4504a) {
            if (b2.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
