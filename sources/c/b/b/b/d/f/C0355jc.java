package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;

/* renamed from: c.b.b.b.d.f.jc  reason: case insensitive filesystem */
final class C0355jc implements Mc {

    /* renamed from: a  reason: collision with root package name */
    private static final C0424tc f4484a = new C0376mc();

    /* renamed from: b  reason: collision with root package name */
    private final C0424tc f4485b;

    public C0355jc() {
        this(new C0369lc(Mb.a(), a()));
    }

    private C0355jc(C0424tc tcVar) {
        Nb.a(tcVar, "messageInfoFactory");
        this.f4485b = tcVar;
    }

    private static C0424tc a() {
        try {
            return (C0424tc) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f4484a;
        }
    }

    private static boolean a(C0431uc ucVar) {
        return ucVar.a() == Lb.e.i;
    }

    public final <T> Kc<T> b(Class<T> cls) {
        Lc.a((Class<?>) cls);
        C0431uc a2 = this.f4485b.a(cls);
        if (a2.b()) {
            return Lb.class.isAssignableFrom(cls) ? Ac.a(Lc.c(), Bb.a(), a2.l()) : Ac.a(Lc.a(), Bb.b(), a2.l());
        }
        if (Lb.class.isAssignableFrom(cls)) {
            if (a(a2)) {
                return C0465zc.a(cls, a2, Ec.b(), C0328fc.b(), Lc.c(), Bb.a(), C0410rc.b());
            }
            return C0465zc.a(cls, a2, Ec.b(), C0328fc.b(), Lc.c(), (Ab<?>) null, C0410rc.b());
        } else if (a(a2)) {
            return C0465zc.a(cls, a2, Ec.a(), C0328fc.a(), Lc.a(), Bb.b(), C0410rc.a());
        } else {
            return C0465zc.a(cls, a2, Ec.a(), C0328fc.a(), Lc.b(), (Ab<?>) null, C0410rc.a());
        }
    }
}
