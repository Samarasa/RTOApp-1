package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mp  reason: case insensitive filesystem */
public final class C0893Mp implements Xga<C0651Dh> {

    /* renamed from: a  reason: collision with root package name */
    private final C0737Gp f7906a;

    public C0893Mp(C0737Gp gp) {
        this.f7906a = gp;
    }

    public final /* synthetic */ Object get() {
        C0651Dh b2 = this.f7906a.b();
        C1452cha.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
