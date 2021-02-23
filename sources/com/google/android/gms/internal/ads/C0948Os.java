package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Os  reason: case insensitive filesystem */
public final class C0948Os implements Xga<C2988yS> {

    /* renamed from: a  reason: collision with root package name */
    private final C0974Ps f8166a;

    private C0948Os(C0974Ps ps) {
        this.f8166a = ps;
    }

    public static C0948Os a(C0974Ps ps) {
        return new C0948Os(ps);
    }

    public static C2988yS b(C0974Ps ps) {
        C2988yS b2 = ps.b();
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    public final /* synthetic */ Object get() {
        return b(this.f8166a);
    }
}
