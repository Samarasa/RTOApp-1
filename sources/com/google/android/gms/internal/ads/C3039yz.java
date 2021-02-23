package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yz  reason: case insensitive filesystem */
public final class C3039yz implements Xga<C0894Mq> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2526rna> f13008a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f13009b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Context> f13010c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<e> f13011d;

    public C3039yz(C1876iha<C2526rna> iha, C1876iha<Executor> iha2, C1876iha<Context> iha3, C1876iha<e> iha4) {
        this.f13008a = iha;
        this.f13009b = iha2;
        this.f13010c = iha3;
        this.f13011d = iha4;
    }

    public final /* synthetic */ Object get() {
        C0894Mq mq = new C0894Mq(this.f13009b.get(), new C0608Bq(this.f13010c.get(), this.f13008a.get()), this.f13011d.get());
        C1452cha.a(mq, "Cannot return null from a non-@Nullable @Provides method");
        return mq;
    }
}
