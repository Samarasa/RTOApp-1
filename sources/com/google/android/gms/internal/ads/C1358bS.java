package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bS  reason: case insensitive filesystem */
public final class C1358bS implements Xga<JR> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<GT> f9904a;

    private C1358bS(C1876iha<GT> iha) {
        this.f9904a = iha;
    }

    public static C1358bS a(C1876iha<GT> iha) {
        return new C1358bS(iha);
    }

    public final /* synthetic */ Object get() {
        return new JR(this.f9904a.get());
    }
}
