package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Qs  reason: case insensitive filesystem */
public final class C1000Qs implements Xga<DS> {

    /* renamed from: a  reason: collision with root package name */
    private final C0974Ps f8410a;

    private C1000Qs(C0974Ps ps) {
        this.f8410a = ps;
    }

    public static C1000Qs a(C0974Ps ps) {
        return new C1000Qs(ps);
    }

    public final /* synthetic */ Object get() {
        DS c2 = this.f8410a.c();
        C1452cha.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }
}
