package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Qqa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Locale;

@TargetApi(28)
/* renamed from: com.google.android.gms.ads.internal.util.c  reason: case insensitive filesystem */
public final class C0497c extends C0498d {
    static /* synthetic */ WindowInsets a(Activity activity, View view, WindowInsets windowInsets) {
        if (p.g().i().h() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = BuildConfig.FLAVOR;
            if (displayCutout != null) {
                ha i = p.g().i();
                for (Rect next : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(next.left), Integer.valueOf(next.top), Integer.valueOf(next.right), Integer.valueOf(next.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                i.b(str);
            } else {
                p.g().i().b(str);
            }
        }
        a(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static void a(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = z ? 1 : 2;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    public final void a(Activity activity) {
        if (((Boolean) Qqa.e().a(F.Ga)).booleanValue() && p.g().i().h() == null && !activity.isInMultiWindowMode()) {
            a(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new C0500f(this, activity));
        }
    }
}
