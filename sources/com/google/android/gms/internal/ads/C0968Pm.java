package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Pm  reason: case insensitive filesystem */
final class C0968Pm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f8255a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f8256b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f8257c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ int f8258d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f8259e = false;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C0994Qm f8260f;

    C0968Pm(C0994Qm qm, String str, String str2, int i, int i2, boolean z) {
        this.f8260f = qm;
        this.f8255a = str;
        this.f8256b = str2;
        this.f8257c = i;
        this.f8258d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f8255a);
        hashMap.put("cachedSrc", this.f8256b);
        hashMap.put("bytesLoaded", Integer.toString(this.f8257c));
        hashMap.put("totalBytes", Integer.toString(this.f8258d));
        hashMap.put("cacheReady", "0");
        this.f8260f.a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
