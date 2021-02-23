package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.q;

/* renamed from: com.google.android.gms.internal.ads.Ug  reason: case insensitive filesystem */
final class C1092Ug implements q {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaqe f8915a;

    C1092Ug(zzaqe zzaqe) {
        this.f8915a = zzaqe;
    }

    public final void J() {
    }

    public final void Tb() {
        C1018Rk.a("Opening AdMobCustomTabsAdapter overlay.");
        this.f8915a.f13144b.e(this.f8915a);
    }

    public final void a(m mVar) {
        C1018Rk.a("AdMobCustomTabsAdapter overlay is closed.");
        this.f8915a.f13144b.d(this.f8915a);
    }

    public final void onPause() {
        C1018Rk.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void onResume() {
        C1018Rk.a("AdMobCustomTabsAdapter overlay is resumed.");
    }
}
