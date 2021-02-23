package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

public final class J {

    /* renamed from: a  reason: collision with root package name */
    private String f7373a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f7374b;

    /* renamed from: c  reason: collision with root package name */
    private Context f7375c = null;

    /* renamed from: d  reason: collision with root package name */
    private String f7376d = null;

    public J(Context context, String str) {
        this.f7375c = context;
        this.f7376d = str;
        this.f7373a = C2854wa.f12635b.a();
        this.f7374b = new LinkedHashMap();
        this.f7374b.put("s", "gmob_sdk");
        this.f7374b.put("v", "3");
        this.f7374b.put("os", Build.VERSION.RELEASE);
        this.f7374b.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f7374b;
        p.c();
        map.put("device", oa.b());
        this.f7374b.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.f7374b;
        p.c();
        map2.put("is_lite_sdk", oa.j(context) ? "1" : "0");
        Future<C2870wi> a2 = p.n().a(this.f7375c);
        try {
            this.f7374b.put("network_coarse", Integer.toString(a2.get().o));
            this.f7374b.put("network_fine", Integer.toString(a2.get().p));
        } catch (Exception e2) {
            p.g().a((Throwable) e2, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f7375c;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        return this.f7376d;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return this.f7373a;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> d() {
        return this.f7374b;
    }
}
