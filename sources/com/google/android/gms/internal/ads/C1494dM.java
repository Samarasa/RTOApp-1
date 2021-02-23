package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dM  reason: case insensitive filesystem */
public final class C1494dM implements Xga<C1281aM> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<SS> f10139a;

    private C1494dM(C1876iha<SS> iha) {
        this.f10139a = iha;
    }

    public static C1494dM a(C1876iha<SS> iha) {
        return new C1494dM(iha);
    }

    public final /* synthetic */ Object get() {
        return new C1281aM(this.f10139a.get());
    }
}
