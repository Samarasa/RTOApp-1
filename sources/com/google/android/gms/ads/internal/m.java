package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.C1018Rk;

final class m extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ j f5472a;

    m(j jVar) {
        this.f5472a = jVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f5472a.f5469g != null) {
            try {
                this.f5472a.f5469g.a(0);
            } catch (RemoteException e2) {
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f5472a._b())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (this.f5472a.f5469g != null) {
                try {
                    this.f5472a.f5469g.a(3);
                } catch (RemoteException e2) {
                    C1018Rk.d("#007 Could not call remote method.", e2);
                }
            }
            this.f5472a.d(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (this.f5472a.f5469g != null) {
                try {
                    this.f5472a.f5469g.a(0);
                } catch (RemoteException e3) {
                    C1018Rk.d("#007 Could not call remote method.", e3);
                }
            }
            this.f5472a.d(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            if (this.f5472a.f5469g != null) {
                try {
                    this.f5472a.f5469g.H();
                } catch (RemoteException e4) {
                    C1018Rk.d("#007 Could not call remote method.", e4);
                }
            }
            this.f5472a.d(this.f5472a.D(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f5472a.f5469g != null) {
                try {
                    this.f5472a.f5469g.N();
                } catch (RemoteException e5) {
                    C1018Rk.d("#007 Could not call remote method.", e5);
                }
            }
            this.f5472a.F(this.f5472a.E(str));
            return true;
        }
    }
}
