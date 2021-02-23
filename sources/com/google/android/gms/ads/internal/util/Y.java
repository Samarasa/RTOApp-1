package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.concurrent.Callable;

final class Y implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f5560a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f5561b;

    Y(W w, Context context, Context context2) {
        this.f5560a = context;
        this.f5561b = context2;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (this.f5560a != null) {
            fa.f("Attempting to read user agent from Google Play Services.");
            sharedPreferences = this.f5560a.getSharedPreferences("admob_user_agent", 0);
        } else {
            fa.f("Attempting to read user agent from local cache.");
            sharedPreferences = this.f5561b.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", BuildConfig.FLAVOR);
        if (TextUtils.isEmpty(string)) {
            fa.f("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(this.f5561b);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                fa.f("Persisting user agent.");
            }
        }
        return string;
    }
}
