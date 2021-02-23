package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.google.android.gms.common.util.p;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.concurrent.Callable;

final class Z implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f5562a;

    Z(W w, Context context) {
        this.f5562a = context;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences = this.f5562a.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", BuildConfig.FLAVOR);
        if (!TextUtils.isEmpty(string)) {
            fa.f("User agent is already initialized on Google Play Services.");
            return string;
        }
        fa.f("User agent is not initialized on Google Play Services. Initializing.");
        p.a(this.f5562a, sharedPreferences.edit().putString("user_agent", WebSettings.getDefaultUserAgent(this.f5562a)), "admob_user_agent");
        throw null;
    }
}
