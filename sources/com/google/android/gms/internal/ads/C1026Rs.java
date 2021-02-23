package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Rs  reason: case insensitive filesystem */
public final class C1026Rs implements Xga<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C0974Ps f8554a;

    private C1026Rs(C0974Ps ps) {
        this.f8554a = ps;
    }

    public static C1026Rs a(C0974Ps ps) {
        return new C1026Rs(ps);
    }

    public static String b(C0974Ps ps) {
        String d2 = ps.d();
        C1452cha.a(d2, "Cannot return null from a non-@Nullable @Provides method");
        return d2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f8554a);
    }
}
