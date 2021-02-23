package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1073Tn;
import com.google.android.gms.internal.ads.C2242nn;
import com.google.android.gms.internal.ads.C2313on;
import com.google.android.gms.internal.ads.Rpa;
import com.google.android.gms.internal.ads.Soa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.InputStream;
import java.util.Map;

@TargetApi(16)
public class wa {
    private wa() {
    }

    public static wa a(int i) {
        return i >= 28 ? new C0497c() : i >= 26 ? new C0498d() : i >= 24 ? new Ba() : i >= 21 ? new C0495b() : i >= 19 ? new za() : i >= 18 ? new Aa() : i >= 17 ? new xa() : new wa();
    }

    public static boolean a(C2313on onVar) {
        if (onVar == null) {
            return false;
        }
        onVar.onPause();
        return true;
    }

    public static boolean b(C2313on onVar) {
        if (onVar == null) {
            return false;
        }
        onVar.onResume();
        return true;
    }

    public static boolean c() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public int a() {
        return 5;
    }

    public int a(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public Drawable a(Context context, Bitmap bitmap, boolean z, float f2) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public WebResourceResponse a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public Rpa a(Context context, TelephonyManager telephonyManager) {
        return Rpa.ENUM_UNKNOWN;
    }

    public C2242nn a(C2313on onVar, Soa soa, boolean z) {
        return new C1073Tn(onVar, soa, z);
    }

    public String a(Context context) {
        return BuildConfig.FLAVOR;
    }

    public void a(Activity activity) {
    }

    public boolean a(Activity activity, Configuration configuration) {
        return false;
    }

    public boolean a(Context context, WebSettings webSettings) {
        X.a(context, new va(context, webSettings));
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public boolean a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public int b(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public void b(Context context) {
    }

    public CookieManager c(Context context) {
        if (c()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C1018Rk.b("Failed to obtain CookieManager.", th);
            p.g().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public int d() {
        return 1;
    }

    public long e() {
        return -1;
    }
}
