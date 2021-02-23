package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ts  reason: case insensitive filesystem */
public final class C1078Ts implements Xga<OS> {

    /* renamed from: a  reason: collision with root package name */
    private final C0974Ps f8837a;

    private C1078Ts(C0974Ps ps) {
        this.f8837a = ps;
    }

    public static C1078Ts a(C0974Ps ps) {
        return new C1078Ts(ps);
    }

    public static OS b(C0974Ps ps) {
        OS a2 = ps.a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f8837a);
    }
}
