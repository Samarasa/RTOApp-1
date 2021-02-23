package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Vs  reason: case insensitive filesystem */
public final class C1130Vs implements Xga<C1052Ss> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1080Tu> f9093a;

    private C1130Vs(C1876iha<C1080Tu> iha) {
        this.f9093a = iha;
    }

    public static C1130Vs a(C1876iha<C1080Tu> iha) {
        return new C1130Vs(iha);
    }

    public final /* synthetic */ Object get() {
        return new C1052Ss(this.f9093a.get());
    }
}
