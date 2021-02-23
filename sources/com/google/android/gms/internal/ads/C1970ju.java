package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ju  reason: case insensitive filesystem */
public final class C1970ju implements Xga<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C1616eu f11016a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2111lt> f11017b;

    private C1970ju(C1616eu euVar, C1876iha<C2111lt> iha) {
        this.f11016a = euVar;
        this.f11017b = iha;
    }

    public static C1970ju a(C1616eu euVar, C1876iha<C2111lt> iha) {
        return new C1970ju(euVar, iha);
    }

    public static String a(C1616eu euVar, C2111lt ltVar) {
        String J = ltVar.J();
        C1452cha.a(J, "Cannot return null from a non-@Nullable @Provides method");
        return J;
    }

    public final /* synthetic */ Object get() {
        return a(this.f11016a, this.f11017b.get());
    }
}
