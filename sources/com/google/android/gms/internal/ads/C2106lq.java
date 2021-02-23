package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.lq  reason: case insensitive filesystem */
public final class C2106lq implements C1823hq {

    /* renamed from: a  reason: collision with root package name */
    private final C2846wS f11251a;

    public C2106lq(C2846wS wSVar) {
        this.f11251a = wSVar;
    }

    public final void a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f11251a.a(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
