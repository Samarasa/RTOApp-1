package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Pq  reason: case insensitive filesystem */
final /* synthetic */ class C0972Pq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0894Mq f8276a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f8277b;

    C0972Pq(C0894Mq mq, JSONObject jSONObject) {
        this.f8276a = mq;
        this.f8277b = jSONObject;
    }

    public final void run() {
        this.f8276a.a(this.f8277b);
    }
}
