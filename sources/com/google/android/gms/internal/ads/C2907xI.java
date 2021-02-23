package com.google.android.gms.internal.ads;

import android.content.Context;
import c.b.b.b.c.b;

/* renamed from: com.google.android.gms.internal.ads.xI  reason: case insensitive filesystem */
final class C2907xI implements C0876Ly {

    /* renamed from: a  reason: collision with root package name */
    private final C2988yS f12737a;

    /* renamed from: b  reason: collision with root package name */
    private final C0624Cg f12738b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12739c;

    /* renamed from: d  reason: collision with root package name */
    private C0846Ku f12740d = null;

    C2907xI(C2988yS ySVar, C0624Cg cg, boolean z) {
        this.f12737a = ySVar;
        this.f12738b = cg;
        this.f12739c = z;
    }

    public final void a(C0846Ku ku) {
        this.f12740d = ku;
    }

    public final void a(boolean z, Context context) {
        try {
            if (!(this.f12739c ? this.f12738b.L(b.a(context)) : this.f12738b.p(b.a(context)))) {
                throw new C0954Oy("Adapter failed to show.");
            } else if (this.f12740d != null) {
                if (!((Boolean) Qqa.e().a(F.pb)).booleanValue() && this.f12737a.S == 2) {
                    this.f12740d.I();
                }
            }
        } catch (Throwable th) {
            throw new C0954Oy(th);
        }
    }
}
