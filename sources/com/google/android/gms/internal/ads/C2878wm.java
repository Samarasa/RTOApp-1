package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wm  reason: case insensitive filesystem */
final /* synthetic */ class C2878wm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1175Xl f12679a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f12680b;

    C2878wm(C1175Xl xl, Map map) {
        this.f12679a = xl;
        this.f12680b = map;
    }

    public final void run() {
        this.f12679a.a("onGcacheInfoEvent", (Map<String, ?>) this.f12680b);
    }
}
