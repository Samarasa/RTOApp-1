package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class MG implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final HG f7811a;

    private MG(HG hg) {
        this.f7811a = hg;
    }

    static Callable a(HG hg) {
        return new MG(hg);
    }

    public final Object call() {
        return this.f7811a.getWritableDatabase();
    }
}
