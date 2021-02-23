package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.p;

/* renamed from: com.google.android.gms.internal.ads.Tg  reason: case insensitive filesystem */
final class C1066Tg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AdOverlayInfoParcel f8807a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzaqe f8808b;

    C1066Tg(zzaqe zzaqe, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f8808b = zzaqe;
        this.f8807a = adOverlayInfoParcel;
    }

    public final void run() {
        p.b();
        com.google.android.gms.ads.internal.overlay.p.a(this.f8808b.f13143a, this.f8807a, true);
    }
}
