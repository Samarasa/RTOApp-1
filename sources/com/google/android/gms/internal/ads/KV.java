package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.C1766hB;

final class KV implements JV {

    /* renamed from: a  reason: collision with root package name */
    private static final C1766hB f7559a;

    static {
        C1766hB.a v = C1766hB.v();
        v.e("E");
        f7559a = (C1766hB) v.k();
    }

    KV() {
    }

    public final C1766hB a() {
        return f7559a;
    }

    public final C1766hB a(Context context) {
        return C2849wV.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }
}
