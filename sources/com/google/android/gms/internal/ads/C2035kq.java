package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.ha;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kq  reason: case insensitive filesystem */
public final class C2035kq implements C1823hq {

    /* renamed from: a  reason: collision with root package name */
    private ha f11116a;

    public C2035kq(ha haVar) {
        this.f11116a = haVar;
    }

    public final void a(Map<String, String> map) {
        this.f11116a.b(Boolean.parseBoolean(map.get("content_url_opted_out")));
    }
}
