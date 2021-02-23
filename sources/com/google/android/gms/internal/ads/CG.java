package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class CG implements Xga<C2054lG> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f6394a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f6395b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C0678Ei> f6396c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C1681fq> f6397d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C0704Fi> f6398e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<HashMap<String, C2905xG>> f6399f;

    private CG(C1876iha<Context> iha, C1876iha<Executor> iha2, C1876iha<C0678Ei> iha3, C1876iha<C1681fq> iha4, C1876iha<C0704Fi> iha5, C1876iha<HashMap<String, C2905xG>> iha6) {
        this.f6394a = iha;
        this.f6395b = iha2;
        this.f6396c = iha3;
        this.f6397d = iha4;
        this.f6398e = iha5;
        this.f6399f = iha6;
    }

    public static CG a(C1876iha<Context> iha, C1876iha<Executor> iha2, C1876iha<C0678Ei> iha3, C1876iha<C1681fq> iha4, C1876iha<C0704Fi> iha5, C1876iha<HashMap<String, C2905xG>> iha6) {
        return new CG(iha, iha2, iha3, iha4, iha5, iha6);
    }

    public final /* synthetic */ Object get() {
        return new C2054lG(this.f6394a.get(), this.f6395b.get(), this.f6396c.get(), this.f6397d.get(), this.f6398e.get(), this.f6399f.get());
    }
}
