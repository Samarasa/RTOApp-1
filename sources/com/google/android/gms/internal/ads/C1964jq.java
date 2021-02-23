package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.ha;

/* renamed from: com.google.android.gms.internal.ads.jq  reason: case insensitive filesystem */
public final class C1964jq implements Xga<C2035kq> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<ha> f11013a;

    private C1964jq(C1876iha<ha> iha) {
        this.f11013a = iha;
    }

    public static C1964jq a(C1876iha<ha> iha) {
        return new C1964jq(iha);
    }

    public final /* synthetic */ Object get() {
        return new C2035kq(this.f11013a.get());
    }
}
