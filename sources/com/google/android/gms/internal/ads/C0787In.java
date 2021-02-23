package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.In  reason: case insensitive filesystem */
final /* synthetic */ class C0787In implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0813Jn f7344a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f7345b;

    C0787In(C0813Jn jn, Map map) {
        this.f7344a = jn;
        this.f7345b = map;
    }

    public final void run() {
        this.f7344a.a(this.f7345b);
    }
}
