package com.google.firebase.auth.a.a;

import android.util.Log;
import com.google.android.gms.common.internal.C0563t;
import java.util.Map;

/* renamed from: com.google.firebase.auth.a.a.c  reason: case insensitive filesystem */
final class C3254c implements C3258g {

    /* renamed from: a  reason: collision with root package name */
    private final int f14310a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14311b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Integer> f14312c;

    public C3254c(int i, int i2, Map<String, Integer> map) {
        this.f14310a = a() ? 0 : i;
        this.f14311b = i2;
        C0563t.a(map);
        this.f14312c = map;
        a();
    }

    private static boolean a() {
        boolean equals = "local".equals(ma.a("firebear.preference"));
        if (equals) {
            Log.e("BiChannelGoogleApi", "Found local preference, will always use local service instance");
        }
        return equals;
    }

    public final boolean c(String str) {
        int i = this.f14310a;
        if (i == 0) {
            return true;
        }
        if (this.f14311b <= i) {
            return false;
        }
        Integer num = this.f14312c.get(str);
        if (num == null) {
            num = 0;
        }
        return num.intValue() > this.f14310a && this.f14311b >= num.intValue();
    }
}
