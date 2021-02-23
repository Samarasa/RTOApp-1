package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.c.a;

/* renamed from: com.google.android.gms.internal.ads.qk  reason: case insensitive filesystem */
public final class C2449qk implements C2590sk {
    public final LY<a.C0070a> a(Context context) {
        C1742gl glVar = new C1742gl();
        Qqa.a();
        if (C0758Hk.c(context)) {
            C1252_k.f9699a.execute(new C2661tk(this, context, glVar));
        }
        return glVar;
    }

    public final LY<String> a(Context context, int i) {
        return DY.a(null);
    }

    public final LY<String> a(String str, PackageInfo packageInfo) {
        return DY.a(str);
    }
}
