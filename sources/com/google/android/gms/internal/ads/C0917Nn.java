package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.fa;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.internal.ads.C1021Rn;
import com.google.android.gms.internal.ads.C1255_n;
import com.google.android.gms.internal.ads.C1394bo;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

@TargetApi(17)
/* renamed from: com.google.android.gms.internal.ads.Nn  reason: case insensitive filesystem */
public final class C0917Nn<WebViewT extends C1021Rn & C1255_n & C1394bo> {

    /* renamed from: a  reason: collision with root package name */
    private final C0943On f8016a;

    /* renamed from: b  reason: collision with root package name */
    private final WebViewT f8017b;

    private C0917Nn(WebViewT webviewt, C0943On on) {
        this.f8016a = on;
        this.f8017b = webviewt;
    }

    public static C0917Nn<C2313on> a(C2313on onVar) {
        return new C0917Nn<>(onVar, new C0891Mn(onVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        this.f8016a.a(Uri.parse(str));
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            Qba G = ((C1255_n) this.f8017b).G();
            if (G == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                HW a2 = G.a();
                if (a2 == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else if (this.f8017b.getContext() != null) {
                    return a2.a(this.f8017b.getContext(), str, ((C1394bo) this.f8017b).getView(), this.f8017b.f());
                } else {
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        fa.f(str2);
        return BuildConfig.FLAVOR;
    }

    @JavascriptInterface
    public final void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            C1018Rk.d("URL is empty, ignoring message");
        } else {
            oa.f5628a.post(new C0969Pn(this, str));
        }
    }
}
