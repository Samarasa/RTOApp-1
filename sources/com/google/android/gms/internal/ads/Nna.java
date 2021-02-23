package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

final class Nna implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private ValueCallback<String> f8018a = new Qna(this);

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Fna f8019b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WebView f8020c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f8021d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Lna f8022e;

    Nna(Lna lna, Fna fna, WebView webView, boolean z) {
        this.f8022e = lna;
        this.f8019b = fna;
        this.f8020c = webView;
        this.f8021d = z;
    }

    public final void run() {
        if (this.f8020c.getSettings().getJavaScriptEnabled()) {
            try {
                this.f8020c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f8018a);
            } catch (Throwable unused) {
                this.f8018a.onReceiveValue(BuildConfig.FLAVOR);
            }
        }
    }
}
