package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Zg  reason: case insensitive filesystem */
public final class C1222Zg {

    /* renamed from: a  reason: collision with root package name */
    private final C2313on f9577a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f9578b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9579c;

    public C1222Zg(C2313on onVar, Map<String, String> map) {
        this.f9577a = onVar;
        this.f9579c = map.get("forceOrientation");
        this.f9578b = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean(map.get("allowOrientationChange")) : true;
    }

    public final void a() {
        int i;
        if (this.f9577a == null) {
            C1018Rk.d("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.f9579c)) {
            p.e();
            i = 7;
        } else if ("landscape".equalsIgnoreCase(this.f9579c)) {
            p.e();
            i = 6;
        } else {
            i = this.f9578b ? -1 : p.e().a();
        }
        this.f9577a.setRequestedOrientation(i);
    }
}
