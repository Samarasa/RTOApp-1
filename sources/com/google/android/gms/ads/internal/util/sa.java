package com.google.android.gms.ads.internal.util;

import android.content.Context;

final class sa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f5648a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ oa f5649b;

    sa(oa oaVar, Context context) {
        this.f5649b = oaVar;
        this.f5648a = context;
    }

    public final void run() {
        synchronized (this.f5649b.f5632e) {
            String unused = this.f5649b.f5633f = oa.c(this.f5648a);
            this.f5649b.f5632e.notifyAll();
        }
    }
}
