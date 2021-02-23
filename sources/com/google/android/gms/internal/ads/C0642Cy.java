package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cy  reason: case insensitive filesystem */
public final class C0642Cy implements Xga<C3109zy> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2468qv> f6491a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C2824vx> f6492b;

    private C0642Cy(C1876iha<C2468qv> iha, C1876iha<C2824vx> iha2) {
        this.f6491a = iha;
        this.f6492b = iha2;
    }

    public static C0642Cy a(C1876iha<C2468qv> iha, C1876iha<C2824vx> iha2) {
        return new C0642Cy(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new C3109zy(this.f6491a.get(), this.f6492b.get());
    }
}
