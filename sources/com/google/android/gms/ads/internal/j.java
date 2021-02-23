package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.internal.ads.C0729Gh;
import com.google.android.gms.internal.ads.C0758Hk;
import com.google.android.gms.internal.ads.C0833Kh;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1146Wi;
import com.google.android.gms.internal.ads.C1200Yk;
import com.google.android.gms.internal.ads.C1252_k;
import com.google.android.gms.internal.ads.C1508da;
import com.google.android.gms.internal.ads.C1684fra;
import com.google.android.gms.internal.ads.C1905j;
import com.google.android.gms.internal.ads.C1967jra;
import com.google.android.gms.internal.ads.C2103loa;
import com.google.android.gms.internal.ads.C2249nqa;
import com.google.android.gms.internal.ads.C2322ora;
import com.google.android.gms.internal.ads.C2462qqa;
import com.google.android.gms.internal.ads.C2506rda;
import com.google.android.gms.internal.ads.C2641ta;
import com.google.android.gms.internal.ads.C2747ura;
import com.google.android.gms.internal.ads.C3100zqa;
import com.google.android.gms.internal.ads.Mra;
import com.google.android.gms.internal.ads.Nra;
import com.google.android.gms.internal.ads.Qba;
import com.google.android.gms.internal.ads.Qqa;
import com.google.android.gms.internal.ads.Sqa;
import com.google.android.gms.internal.ads.Sra;
import com.google.android.gms.internal.ads.Tqa;
import com.google.android.gms.internal.ads.Yra;
import java.util.Map;
import java.util.concurrent.Future;

public final class j extends C1684fra {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C1200Yk f5463a;

    /* renamed from: b  reason: collision with root package name */
    private final C2462qqa f5464b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Future<Qba> f5465c = C1252_k.f9699a.a(new o(this));
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f5466d;

    /* renamed from: e  reason: collision with root package name */
    private final q f5467e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public WebView f5468f = new WebView(this.f5466d);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public Tqa f5469g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public Qba f5470h;
    private AsyncTask<Void, Void, String> i;

    public j(Context context, C2462qqa qqa, String str, C1200Yk yk) {
        this.f5466d = context;
        this.f5463a = yk;
        this.f5464b = qqa;
        this.f5467e = new q(context, str);
        d(0);
        this.f5468f.setVerticalScrollBarEnabled(false);
        this.f5468f.getSettings().setJavaScriptEnabled(true);
        this.f5468f.setWebViewClient(new m(this));
        this.f5468f.setOnTouchListener(new l(this));
    }

    /* access modifiers changed from: private */
    public final String E(String str) {
        if (this.f5470h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.f5470h.a(parse, this.f5466d, (View) null, (Activity) null);
        } catch (C2506rda e2) {
            C1018Rk.c("Unable to process ad data", e2);
        }
        return parse.toString();
    }

    /* access modifiers changed from: private */
    public final void F(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f5466d.startActivity(intent);
    }

    public final Nra A() {
        return null;
    }

    public final a Ca() {
        C0563t.a("getAdFrame must be called on the main UI thread.");
        return b.a(this.f5468f);
    }

    /* access modifiers changed from: package-private */
    public final int D(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            Qqa.a();
            return C0758Hk.b(this.f5466d, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void Pa() {
        throw new IllegalStateException("Unused method");
    }

    public final String Pb() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final C2462qqa Qb() {
        return this.f5464b;
    }

    public final Bundle V() {
        throw new IllegalStateException("Unused method");
    }

    public final void X() {
        C0563t.a("resume must be called on the main UI thread.");
    }

    /* access modifiers changed from: package-private */
    public final String Zb() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(C2641ta.f12215d.a());
        builder.appendQueryParameter("query", this.f5467e.a());
        builder.appendQueryParameter("pubId", this.f5467e.c());
        Map<String, String> d2 = this.f5467e.d();
        for (String next : d2.keySet()) {
            builder.appendQueryParameter(next, d2.get(next));
        }
        Uri build = builder.build();
        Qba qba = this.f5470h;
        if (qba != null) {
            try {
                build = qba.a(build, this.f5466d);
            } catch (C2506rda e2) {
                C1018Rk.c("Unable to process ad data", e2);
            }
        }
        String _b = _b();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder sb = new StringBuilder(String.valueOf(_b).length() + 1 + String.valueOf(encodedQuery).length());
        sb.append(_b);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String _b() {
        String b2 = this.f5467e.b();
        if (TextUtils.isEmpty(b2)) {
            b2 = "www.google.com";
        }
        String a2 = C2641ta.f12215d.a();
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 8 + String.valueOf(a2).length());
        sb.append("https://");
        sb.append(b2);
        sb.append(a2);
        return sb.toString();
    }

    public final void a(C0729Gh gh) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(C0833Kh kh, String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(Mra mra) {
    }

    public final void a(Sqa sqa) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(C1146Wi wi) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(Yra yra) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(C1508da daVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(C1905j jVar) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(C1967jra jra) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(C2103loa loa) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(C2322ora ora) {
        throw new IllegalStateException("Unused method");
    }

    public final void a(C2462qqa qqa) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void a(C3100zqa zqa) {
        throw new IllegalStateException("Unused method");
    }

    public final boolean a(C2249nqa nqa) {
        C0563t.a(this.f5468f, (Object) "This Search Ad has already been torn down");
        this.f5467e.a(nqa, this.f5463a);
        this.i = new n(this, (m) null).execute(new Void[0]);
        return true;
    }

    public final void b(Tqa tqa) {
        this.f5469g = tqa;
    }

    public final void b(C2747ura ura) {
        throw new IllegalStateException("Unused method");
    }

    public final void b(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    /* access modifiers changed from: package-private */
    public final void d(int i2) {
        if (this.f5468f != null) {
            this.f5468f.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
        }
    }

    public final void destroy() {
        C0563t.a("destroy must be called on the main UI thread.");
        this.i.cancel(true);
        this.f5465c.cancel(true);
        this.f5468f.destroy();
        this.f5468f = null;
    }

    public final void f(boolean z) {
    }

    public final Sra getVideoController() {
        return null;
    }

    public final void h(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final C2322ora lb() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final String o() {
        return null;
    }

    public final void pause() {
        C0563t.a("pause must be called on the main UI thread.");
    }

    public final void q(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final boolean q() {
        return false;
    }

    public final void rb() {
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    public final boolean t() {
        return false;
    }

    public final String va() {
        return null;
    }

    public final Tqa yb() {
        throw new IllegalStateException("getIAdListener not implemented");
    }
}
