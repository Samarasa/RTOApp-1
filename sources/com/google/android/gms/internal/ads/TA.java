package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C0518y;
import com.google.android.gms.common.util.e;
import java.util.concurrent.Executor;

public final class TA implements Xga<RA> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0518y> f8727a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<e> f8728b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Executor> f8729c;

    public TA(C1876iha<C0518y> iha, C1876iha<e> iha2, C1876iha<Executor> iha3) {
        this.f8727a = iha;
        this.f8728b = iha2;
        this.f8729c = iha3;
    }

    public final /* synthetic */ Object get() {
        return new RA(this.f8727a.get(), this.f8728b.get(), this.f8729c.get());
    }
}
