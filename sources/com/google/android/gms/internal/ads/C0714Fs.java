package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Fs  reason: case insensitive filesystem */
public final class C0714Fs {

    /* renamed from: a  reason: collision with root package name */
    public final List<? extends LY<? extends C3103zs>> f6963a;

    public C0714Fs(C3103zs zsVar) {
        this.f6963a = Collections.singletonList(DY.a(zsVar));
    }

    public C0714Fs(List<? extends LY<? extends C3103zs>> list) {
        this.f6963a = list;
    }

    public static C2480rH<C0714Fs> a(II<? extends C3103zs> ii) {
        return new C2764vH(ii, C0688Es.f6781a);
    }

    public static C2480rH<C0714Fs> a(C2480rH<? extends C3103zs> rHVar) {
        return new C2764vH(rHVar, C0766Hs.f7226a);
    }
}
