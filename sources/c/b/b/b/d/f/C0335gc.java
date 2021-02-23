package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.gc  reason: case insensitive filesystem */
final class C0335gc extends C0328fc {
    private C0335gc() {
        super();
    }

    private static <E> Tb<E> b(Object obj, long j) {
        return (Tb) C0336gd.f(obj, j);
    }

    /* access modifiers changed from: package-private */
    public final void a(Object obj, long j) {
        b(obj, j).m();
    }

    /* access modifiers changed from: package-private */
    public final <E> void a(Object obj, Object obj2, long j) {
        Tb b2 = b(obj, j);
        Tb b3 = b(obj2, j);
        int size = b2.size();
        int size2 = b3.size();
        if (size > 0 && size2 > 0) {
            if (!b2.a()) {
                b2 = b2.a(size2 + size);
            }
            b2.addAll(b3);
        }
        if (size > 0) {
            b3 = b2;
        }
        C0336gd.a(obj, j, (Object) b3);
    }
}
