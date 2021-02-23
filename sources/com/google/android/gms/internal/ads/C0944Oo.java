package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oo  reason: case insensitive filesystem */
public final class C0944Oo implements Xga<C1681fq> {

    /* renamed from: a  reason: collision with root package name */
    private final C0684Eo f8149a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0710Fo> f8150b;

    public C0944Oo(C0684Eo eo, C1876iha<C0710Fo> iha) {
        this.f8149a = eo;
        this.f8150b = iha;
    }

    public final /* synthetic */ Object get() {
        C0710Fo fo = this.f8150b.get();
        C1452cha.a(fo, "Cannot return null from a non-@Nullable @Provides method");
        return fo;
    }
}
