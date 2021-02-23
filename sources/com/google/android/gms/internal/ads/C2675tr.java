package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import c.b.b.b.c.a;
import c.b.b.b.c.b;

/* renamed from: com.google.android.gms.internal.ads.tr  reason: case insensitive filesystem */
public final class C2675tr extends C1961joa {

    /* renamed from: a  reason: collision with root package name */
    private final C2463qr f12274a;

    /* renamed from: b  reason: collision with root package name */
    private final C1755gra f12275b;

    /* renamed from: c  reason: collision with root package name */
    private final C2631tQ f12276c;

    public C2675tr(C2463qr qrVar, C1755gra gra, C2631tQ tQVar) {
        this.f12274a = qrVar;
        this.f12275b = gra;
        this.f12276c = tQVar;
    }

    public final Nra A() {
        if (!((Boolean) Qqa.e().a(F._e)).booleanValue()) {
            return null;
        }
        return this.f12274a.d();
    }

    public final void a(a aVar, C2387poa poa) {
        try {
            this.f12276c.a(poa);
            this.f12274a.a((Activity) b.Q(aVar), poa);
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(C2174moa moa) {
    }

    public final C1755gra gb() {
        return this.f12275b;
    }
}
