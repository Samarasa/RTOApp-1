package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.ha;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mq  reason: case insensitive filesystem */
public final class C2177mq implements C1823hq {

    /* renamed from: a  reason: collision with root package name */
    private ha f11397a;

    public C2177mq(ha haVar) {
        this.f11397a = haVar;
    }

    public final void a(Map<String, String> map) {
        this.f11397a.a(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
