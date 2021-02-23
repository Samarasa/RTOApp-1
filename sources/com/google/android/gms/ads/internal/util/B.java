package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.C0836Kk;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1459cl;
import com.google.android.gms.internal.ads.LY;

public final class B {
    public static void a(Context context) {
        if (C0836Kk.a(context) && !C0836Kk.c()) {
            LY<?> b2 = new ga(context).b();
            C1018Rk.c("Updating ad debug logging enablement.");
            C1459cl.a(b2, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
