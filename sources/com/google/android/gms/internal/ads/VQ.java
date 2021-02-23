package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

final class VQ<R> implements C1785hU {

    /* renamed from: a  reason: collision with root package name */
    public final C2420qR<R> f9041a;

    /* renamed from: b  reason: collision with root package name */
    public final C2349pR f9042b;

    /* renamed from: c  reason: collision with root package name */
    public final C2249nqa f9043c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9044d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f9045e;

    /* renamed from: f  reason: collision with root package name */
    public final C3100zqa f9046f;

    /* renamed from: g  reason: collision with root package name */
    private final WT f9047g;

    public VQ(C2420qR<R> qRVar, C2349pR pRVar, C2249nqa nqa, String str, Executor executor, C3100zqa zqa, WT wt) {
        this.f9041a = qRVar;
        this.f9042b = pRVar;
        this.f9043c = nqa;
        this.f9044d = str;
        this.f9045e = executor;
        this.f9046f = zqa;
        this.f9047g = wt;
    }

    public final C1785hU a() {
        return new VQ(this.f9041a, this.f9042b, this.f9043c, this.f9044d, this.f9045e, this.f9046f, this.f9047g);
    }

    public final Executor b() {
        return this.f9045e;
    }

    public final WT c() {
        return this.f9047g;
    }
}
