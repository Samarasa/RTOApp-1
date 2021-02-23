package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jp  reason: case insensitive filesystem */
public final class C0815Jp implements Xga<C2651tf> {

    /* renamed from: a  reason: collision with root package name */
    private final C0737Gp f7500a;

    public C0815Jp(C0737Gp gp) {
        this.f7500a = gp;
    }

    public static C2651tf a(C0737Gp gp) {
        C2651tf c2 = gp.c();
        C1452cha.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    public final /* synthetic */ Object get() {
        return a(this.f7500a);
    }
}
