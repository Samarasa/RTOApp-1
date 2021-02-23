package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Um  reason: case insensitive filesystem */
final class C1098Um implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f8948a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f8949b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f8950c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C0994Qm f8951d;

    C1098Um(C0994Qm qm, String str, String str2, long j) {
        this.f8951d = qm;
        this.f8948a = str;
        this.f8949b = str2;
        this.f8950c = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f8948a);
        hashMap.put("cachedSrc", this.f8949b);
        hashMap.put("totalDuration", Long.toString(this.f8950c));
        this.f8951d.a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
