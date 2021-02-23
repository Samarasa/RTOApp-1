package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ou  reason: case insensitive filesystem */
public final class C2325ou implements Xga<C0835Kj> {

    /* renamed from: a  reason: collision with root package name */
    private final C2396pu f11651a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f11652b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1200Yk> f11653c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2988yS> f11654d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C0887Mj> f11655e;

    private C2325ou(C2396pu puVar, C1876iha<Context> iha, C1876iha<C1200Yk> iha2, C1876iha<C2988yS> iha3, C1876iha<C0887Mj> iha4) {
        this.f11651a = puVar;
        this.f11652b = iha;
        this.f11653c = iha2;
        this.f11654d = iha3;
        this.f11655e = iha4;
    }

    public static C2325ou a(C2396pu puVar, C1876iha<Context> iha, C1876iha<C1200Yk> iha2, C1876iha<C2988yS> iha3, C1876iha<C0887Mj> iha4) {
        return new C2325ou(puVar, iha, iha2, iha3, iha4);
    }

    public final /* synthetic */ Object get() {
        Context context = this.f11652b.get();
        C1200Yk yk = this.f11653c.get();
        C2988yS ySVar = this.f11654d.get();
        C0887Mj mj = this.f11655e.get();
        C0809Jj jj = ySVar.z;
        if (jj != null) {
            return new C0601Bj(context, yk, jj, ySVar.r.f7021b, mj);
        }
        return null;
    }
}
