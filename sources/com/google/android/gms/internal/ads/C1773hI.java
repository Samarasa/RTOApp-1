package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.p;

/* renamed from: com.google.android.gms.internal.ads.hI  reason: case insensitive filesystem */
final /* synthetic */ class C1773hI implements C0876Ly {

    /* renamed from: a  reason: collision with root package name */
    private final C1742gl f10655a;

    C1773hI(C1742gl glVar) {
        this.f10655a = glVar;
    }

    public final void a(boolean z, Context context) {
        C1742gl glVar = this.f10655a;
        try {
            p.b();
            com.google.android.gms.ads.internal.overlay.p.a(context, (AdOverlayInfoParcel) glVar.get(), true);
        } catch (Exception unused) {
        }
    }
}
