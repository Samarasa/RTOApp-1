package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C0562s;

/* renamed from: com.google.android.gms.internal.ads.Ki  reason: case insensitive filesystem */
public final class C0834Ki extends C0860Li {

    /* renamed from: a  reason: collision with root package name */
    private final String f7586a;

    /* renamed from: b  reason: collision with root package name */
    private final int f7587b;

    public C0834Ki(String str, int i) {
        this.f7586a = str;
        this.f7587b = i;
    }

    public final int F() {
        return this.f7587b;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C0834Ki)) {
            C0834Ki ki = (C0834Ki) obj;
            return C0562s.a(this.f7586a, ki.f7586a) && C0562s.a(Integer.valueOf(this.f7587b), Integer.valueOf(ki.f7587b));
        }
    }

    public final String getType() {
        return this.f7586a;
    }
}
