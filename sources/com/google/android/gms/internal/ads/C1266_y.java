package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads._y  reason: case insensitive filesystem */
public final class C1266_y implements Xga<C1059Sz> {

    /* renamed from: a  reason: collision with root package name */
    private final C1136Vy f9751a;

    private C1266_y(C1136Vy vy) {
        this.f9751a = vy;
    }

    public static C1266_y a(C1136Vy vy) {
        return new C1266_y(vy);
    }

    public static C1059Sz b(C1136Vy vy) {
        C1059Sz a2 = vy.a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f9751a);
    }
}
