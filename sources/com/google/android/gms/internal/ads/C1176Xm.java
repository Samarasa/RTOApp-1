package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Xm  reason: case insensitive filesystem */
final class C1176Xm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f9285a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f9286b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f9287c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f9288d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C0994Qm f9289e;

    C1176Xm(C0994Qm qm, String str, String str2, String str3, String str4) {
        this.f9289e = qm;
        this.f9285a = str;
        this.f9286b = str2;
        this.f9287c = str3;
        this.f9288d = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f9285a);
        if (!TextUtils.isEmpty(this.f9286b)) {
            hashMap.put("cachedSrc", this.f9286b);
        }
        hashMap.put("type", C0994Qm.c(this.f9287c));
        hashMap.put("reason", this.f9287c);
        if (!TextUtils.isEmpty(this.f9288d)) {
            hashMap.put("message", this.f9288d);
        }
        this.f9289e.a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
