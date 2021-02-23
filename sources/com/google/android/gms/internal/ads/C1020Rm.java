package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Rm  reason: case insensitive filesystem */
final class C1020Rm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f8531a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f8532b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f8533c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f8534d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f8535e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ long f8536f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f8537g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ int f8538h;
    private final /* synthetic */ int i;
    private final /* synthetic */ C0994Qm j;

    C1020Rm(C0994Qm qm, String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        this.j = qm;
        this.f8531a = str;
        this.f8532b = str2;
        this.f8533c = i2;
        this.f8534d = i3;
        this.f8535e = j2;
        this.f8536f = j3;
        this.f8537g = z;
        this.f8538h = i4;
        this.i = i5;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f8531a);
        hashMap.put("cachedSrc", this.f8532b);
        hashMap.put("bytesLoaded", Integer.toString(this.f8533c));
        hashMap.put("totalBytes", Integer.toString(this.f8534d));
        hashMap.put("bufferedDuration", Long.toString(this.f8535e));
        hashMap.put("totalDuration", Long.toString(this.f8536f));
        hashMap.put("cacheReady", this.f8537g ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f8538h));
        hashMap.put("playerPreparedCount", Integer.toString(this.i));
        this.j.a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
