package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.c;

/* renamed from: com.google.android.gms.internal.ads.jqa  reason: case insensitive filesystem */
public final class C1965jqa extends Wqa {

    /* renamed from: a  reason: collision with root package name */
    private final c f11014a;

    public C1965jqa(c cVar) {
        this.f11014a = cVar;
    }

    public final void H() {
        this.f11014a.onAdLoaded();
    }

    public final void I() {
        this.f11014a.onAdImpression();
    }

    public final void M() {
        this.f11014a.onAdOpened();
    }

    public final void N() {
        this.f11014a.onAdLeftApplication();
    }

    public final void O() {
        this.f11014a.onAdClosed();
    }

    public final void a(int i) {
        this.f11014a.onAdFailedToLoad(i);
    }

    public final void b(C1824hqa hqa) {
        this.f11014a.onAdFailedToLoad(hqa.h());
    }

    public final void onAdClicked() {
        this.f11014a.onAdClicked();
    }
}
