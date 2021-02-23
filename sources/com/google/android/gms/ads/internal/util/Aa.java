package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.view.View;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Qqa;

@TargetApi(18)
public class Aa extends xa {
    public final int a() {
        return 14;
    }

    public boolean a(View view) {
        return super.a(view) || view.getWindowId() != null;
    }

    public final long e() {
        if (!((Boolean) Qqa.e().a(F.Zb)).booleanValue()) {
            return -1;
        }
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
    }
}
