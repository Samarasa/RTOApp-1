package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.kE  reason: case insensitive filesystem */
public final class C1981kE extends C2194nE {

    /* renamed from: f  reason: collision with root package name */
    private final Context f11034f;

    /* renamed from: g  reason: collision with root package name */
    private final String f11035g;

    /* renamed from: h  reason: collision with root package name */
    private final String f11036h;

    public C1981kE(Executor executor, C1122Vk vk, Context context, C1200Yk yk) {
        super(executor, vk);
        this.f11034f = context;
        this.f11035g = context.getPackageName();
        this.f11036h = yk.f9456a;
        b();
    }

    public final Map<String, String> a() {
        return new HashMap(this.f11427b);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f11427b.put("s", "gmob_sdk");
        this.f11427b.put("v", "3");
        this.f11427b.put("os", Build.VERSION.RELEASE);
        this.f11427b.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f11427b;
        p.c();
        map.put("device", oa.b());
        this.f11427b.put("app", this.f11035g);
        Map<String, String> map2 = this.f11427b;
        p.c();
        map2.put("is_lite_sdk", oa.j(this.f11034f) ? "1" : "0");
        this.f11427b.put("e", TextUtils.join(",", F.b()));
        this.f11427b.put("sdkVersion", this.f11036h);
    }
}
