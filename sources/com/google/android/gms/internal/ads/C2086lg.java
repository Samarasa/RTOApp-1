package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c.b.a.a;

/* renamed from: com.google.android.gms.internal.ads.lg  reason: case insensitive filesystem */
final class C2086lg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ a f11213a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2015kg f11214b;

    C2086lg(C2015kg kgVar, a aVar) {
        this.f11214b = kgVar;
        this.f11213a = aVar;
    }

    public final void run() {
        try {
            this.f11214b.f11086a.a(C2370pg.a(this.f11213a));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }
}
