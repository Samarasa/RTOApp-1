package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Cq  reason: case insensitive filesystem */
final /* synthetic */ class C0634Cq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C2313on f6477a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f6478b;

    C0634Cq(C2313on onVar, JSONObject jSONObject) {
        this.f6477a = onVar;
        this.f6478b = jSONObject;
    }

    public final void run() {
        this.f6477a.b("AFMA_updateActiveView", this.f6478b);
    }
}
