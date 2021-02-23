package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final /* synthetic */ class va implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5657a;

    /* renamed from: b  reason: collision with root package name */
    private final WebSettings f5658b;

    va(Context context, WebSettings webSettings) {
        this.f5657a = context;
        this.f5658b = webSettings;
    }

    public final Object call() {
        Context context = this.f5657a;
        WebSettings webSettings = this.f5658b;
        if (context.getCacheDir() != null) {
            webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
            webSettings.setAppCacheMaxSize(0);
            webSettings.setAppCacheEnabled(true);
        }
        webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        webSettings.setAllowContentAccess(false);
        return true;
    }
}
