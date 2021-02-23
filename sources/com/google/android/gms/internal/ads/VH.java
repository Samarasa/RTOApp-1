package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C0502h;
import java.util.concurrent.Executor;

public final class VH implements Xga<PH> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C1181Xr> f9017a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f9018b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f9019c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<DC> f9020d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<SS> f9021e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<UW<C2988yS, C0502h>> f9022f;

    public VH(C1876iha<C1181Xr> iha, C1876iha<Context> iha2, C1876iha<Executor> iha3, C1876iha<DC> iha4, C1876iha<SS> iha5, C1876iha<UW<C2988yS, C0502h>> iha6) {
        this.f9017a = iha;
        this.f9018b = iha2;
        this.f9019c = iha3;
        this.f9020d = iha4;
        this.f9021e = iha5;
        this.f9022f = iha6;
    }

    public final /* synthetic */ Object get() {
        return new PH(this.f9017a.get(), this.f9018b.get(), this.f9019c.get(), this.f9020d.get(), this.f9021e.get(), this.f9022f.get());
    }
}
