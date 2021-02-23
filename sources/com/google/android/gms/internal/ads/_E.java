package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.concurrent.Callable;

final /* synthetic */ class _E implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final CookieManager f9624a;

    _E(CookieManager cookieManager) {
        this.f9624a = cookieManager;
    }

    public final Object call() {
        CookieManager cookieManager = this.f9624a;
        if (cookieManager == null) {
            return BuildConfig.FLAVOR;
        }
        return cookieManager.getCookie((String) Qqa.e().a(F.ra));
    }
}
