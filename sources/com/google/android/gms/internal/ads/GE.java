package com.google.android.gms.internal.ads;

public final class GE implements Xga<DE> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2477rE> f6986a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C0710Fo> f6987b;

    private GE(C1876iha<C2477rE> iha, C1876iha<C0710Fo> iha2) {
        this.f6986a = iha;
        this.f6987b = iha2;
    }

    public static GE a(C1876iha<C2477rE> iha, C1876iha<C0710Fo> iha2) {
        return new GE(iha, iha2);
    }

    public final /* synthetic */ Object get() {
        return new DE(this.f6986a.get(), this.f6987b.get());
    }
}
