package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Sm  reason: case insensitive filesystem */
final class C1046Sm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f8673a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f8674b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f8675c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f8676d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f8677e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ long f8678f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ long f8679g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ boolean f8680h;
    private final /* synthetic */ int i;
    private final /* synthetic */ int j;
    private final /* synthetic */ C0994Qm k;

    C1046Sm(C0994Qm qm, String str, String str2, long j2, long j3, long j4, long j5, long j6, boolean z, int i2, int i3) {
        this.k = qm;
        this.f8673a = str;
        this.f8674b = str2;
        this.f8675c = j2;
        this.f8676d = j3;
        this.f8677e = j4;
        this.f8678f = j5;
        this.f8679g = j6;
        this.f8680h = z;
        this.i = i2;
        this.j = i3;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f8673a);
        hashMap.put("cachedSrc", this.f8674b);
        hashMap.put("bufferedDuration", Long.toString(this.f8675c));
        hashMap.put("totalDuration", Long.toString(this.f8676d));
        if (((Boolean) Qqa.e().a(F.vb)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f8677e));
            hashMap.put("qoeCachedBytes", Long.toString(this.f8678f));
            hashMap.put("totalBytes", Long.toString(this.f8679g));
            hashMap.put("reportTime", Long.toString(p.j().a()));
        }
        hashMap.put("cacheReady", this.f8680h ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.i));
        hashMap.put("playerPreparedCount", Integer.toString(this.j));
        this.k.a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
