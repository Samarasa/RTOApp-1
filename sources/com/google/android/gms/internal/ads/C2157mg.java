package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c.b.a.a;

/* renamed from: com.google.android.gms.internal.ads.mg  reason: case insensitive filesystem */
final class C2157mg implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ a f11345a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2015kg f11346b;

    C2157mg(C2015kg kgVar, a aVar) {
        this.f11346b = kgVar;
        this.f11345a = aVar;
    }

    public final void run() {
        try {
            this.f11346b.f11086a.a(C2370pg.a(this.f11345a));
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }
}
