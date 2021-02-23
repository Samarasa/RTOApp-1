package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.C2885wpa;
import java.util.ArrayList;

final class WG implements AY<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f9117a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ XG f9118b;

    WG(XG xg, boolean z) {
        this.f9118b = xg;
        this.f9117a = z;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        ArrayList a2 = XG.c(bundle);
        C2885wpa.c b2 = XG.b(bundle);
        this.f9118b.f9214f.a(new ZG(this, this.f9117a, a2, this.f9118b.a(bundle), b2));
    }

    public final void a(Throwable th) {
        C1018Rk.b("Failed to get signals bundle");
    }
}
