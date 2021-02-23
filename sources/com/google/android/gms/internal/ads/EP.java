package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class EP implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final FP f6694a;

    EP(FP fp) {
        this.f6694a = fp;
    }

    public final Object call() {
        FP fp = this.f6694a;
        return new CP(fp.f6838a.a(fp.f6840c));
    }
}
