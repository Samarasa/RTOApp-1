package c.b.b.a.a.c.a;

import d.a.b;
import d.a.d;

/* renamed from: c.b.b.a.a.c.a.h  reason: case insensitive filesystem */
public final class C0252h implements b<C0249e> {

    /* renamed from: a  reason: collision with root package name */
    private static final C0252h f3756a = new C0252h();

    public static C0252h a() {
        return f3756a;
    }

    public static C0249e b() {
        C0249e b2 = C0250f.b();
        d.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public C0249e get() {
        return b();
    }
}
