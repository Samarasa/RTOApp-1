package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.vH  reason: case insensitive filesystem */
public final class C2764vH<DelegateT, AdapterT> implements C2480rH<AdapterT> {

    /* renamed from: a  reason: collision with root package name */
    private final C2480rH<DelegateT> f12474a;

    /* renamed from: b  reason: collision with root package name */
    private final UW<DelegateT, AdapterT> f12475b;

    public C2764vH(C2480rH<DelegateT> rHVar, UW<DelegateT, AdapterT> uw) {
        this.f12474a = rHVar;
        this.f12475b = uw;
    }

    public final boolean a(OS os, C2988yS ySVar) {
        return this.f12474a.a(os, ySVar);
    }

    public final LY<AdapterT> b(OS os, C2988yS ySVar) {
        return DY.a(this.f12474a.b(os, ySVar), this.f12475b, (Executor) C1252_k.f9699a);
    }
}
