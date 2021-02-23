package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.dE  reason: case insensitive filesystem */
public final class C1486dE {

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, String> f10113a;

    /* renamed from: b  reason: collision with root package name */
    private final C0732Gk f10114b;

    public C1486dE(C1981kE kEVar, C0732Gk gk) {
        this.f10113a = new ConcurrentHashMap<>(kEVar.f11427b);
        this.f10114b = gk;
    }

    public final Map<String, String> a() {
        return this.f10113a;
    }

    public final void a(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f10113a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f10113a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final void a(OS os) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str;
        if (os.f8088b.f7843a.size() > 0) {
            switch (os.f8088b.f7843a.get(0).f12915b) {
                case 1:
                    concurrentHashMap = this.f10113a;
                    str = "banner";
                    break;
                case 2:
                    concurrentHashMap = this.f10113a;
                    str = "interstitial";
                    break;
                case 3:
                    concurrentHashMap = this.f10113a;
                    str = "native_express";
                    break;
                case 4:
                    concurrentHashMap = this.f10113a;
                    str = "native_advanced";
                    break;
                case 5:
                    concurrentHashMap = this.f10113a;
                    str = "rewarded";
                    break;
                case 6:
                    this.f10113a.put("ad_format", "app_open_ad");
                    this.f10113a.put("as", this.f10114b.c() ? "1" : "0");
                    break;
                default:
                    concurrentHashMap = this.f10113a;
                    str = "unknown";
                    break;
            }
            concurrentHashMap.put("ad_format", str);
        }
        if (!TextUtils.isEmpty(os.f8088b.f7844b.f6547b)) {
            this.f10113a.put("gqi", os.f8088b.f7844b.f6547b);
        }
    }
}
