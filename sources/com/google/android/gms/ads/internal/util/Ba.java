package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C0758Hk;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Qqa;

@TargetApi(24)
public class Ba extends C0495b {
    private static boolean a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public final boolean a(Activity activity, Configuration configuration) {
        if (!((Boolean) Qqa.e().a(F.ed)).booleanValue()) {
            return false;
        }
        if (((Boolean) Qqa.e().a(F.gd)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        Qqa.a();
        int b2 = C0758Hk.b((Context) activity, configuration.screenHeightDp);
        int b3 = C0758Hk.b((Context) activity, configuration.screenWidthDp);
        p.c();
        DisplayMetrics a2 = oa.a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a2.heightPixels;
        int i2 = a2.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        double d2 = (double) activity.getResources().getDisplayMetrics().density;
        Double.isNaN(d2);
        int round = ((int) Math.round(d2 + 0.5d)) * ((Integer) Qqa.e().a(F.dd)).intValue();
        return !(a(i, b2 + dimensionPixelSize, round) && a(i2, b3, round));
    }
}
