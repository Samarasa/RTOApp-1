package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C1122Vk;

public final class S extends C0493a {

    /* renamed from: d  reason: collision with root package name */
    private final C1122Vk f5552d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5553e;

    public S(Context context, String str, String str2) {
        this(str2, p.c().b(context, str));
    }

    private S(String str, String str2) {
        this.f5552d = new C1122Vk(str2);
        this.f5553e = str;
    }

    public final void a() {
        this.f5552d.a(this.f5553e);
    }
}
