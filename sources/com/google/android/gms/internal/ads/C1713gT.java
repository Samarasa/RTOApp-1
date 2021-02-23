package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;

/* renamed from: com.google.android.gms.internal.ads.gT  reason: case insensitive filesystem */
public final class C1713gT {
    public static void a(int i, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i);
        C1018Rk.c(sb.toString());
        fa.e(str, th);
        if (i != 3) {
            p.g().b(th, str);
        }
    }

    public static void a(Context context, boolean z) {
        String sb;
        if (z) {
            sb = "This request is sent from a test device.";
        } else {
            Qqa.a();
            String a2 = C0758Hk.a(context);
            StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 101);
            sb2.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
            sb2.append(a2);
            sb2.append("\") to get test ads on this device.");
            sb = sb2.toString();
        }
        C1018Rk.c(sb);
    }
}
