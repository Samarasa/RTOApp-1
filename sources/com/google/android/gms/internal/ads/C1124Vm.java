package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Vm  reason: case insensitive filesystem */
final class C1124Vm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f9082a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f9083b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f9084c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C0994Qm f9085d;

    C1124Vm(C0994Qm qm, String str, String str2, int i) {
        this.f9085d = qm;
        this.f9082a = str;
        this.f9083b = str2;
        this.f9084c = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f9082a);
        hashMap.put("cachedSrc", this.f9083b);
        hashMap.put("totalBytes", Integer.toString(this.f9084c));
        this.f9085d.a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
