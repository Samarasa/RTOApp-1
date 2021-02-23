package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.internal.ads.Ol  reason: case insensitive filesystem */
public final class C0941Ol extends C0733Gl {
    public final C0759Hl a(Context context, C1175Xl xl, int i, boolean z, T t, C1201Yl yl) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        C1253_l _lVar = new C1253_l(context, xl.B(), xl.getRequestId(), t, xl.H());
        if (i == 2) {
            return new C1532dm(context, _lVar, xl, z, C0733Gl.a(xl), yl);
        }
        return new C2734ul(context, xl, z, C0733Gl.a(xl), yl, new C1253_l(context, xl.B(), xl.getRequestId(), t, xl.H()));
    }
}
