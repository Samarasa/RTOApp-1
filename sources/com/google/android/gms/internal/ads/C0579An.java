package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import c.b.b.b.c.a;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.overlay.c;
import com.google.android.gms.ads.internal.overlay.f;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.util.n;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.An  reason: case insensitive filesystem */
public final class C0579An extends FrameLayout implements C2313on {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C2313on f6185a;

    /* renamed from: b  reason: collision with root package name */
    private final C0967Pl f6186b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f6187c = new AtomicBoolean();

    public C0579An(C2313on onVar) {
        super(onVar.getContext());
        this.f6185a = onVar;
        this.f6186b = new C0967Pl(onVar.E(), this, this);
        if (!i()) {
            addView(this.f6185a.getView());
        }
    }

    public final void A() {
        this.f6185a.A();
    }

    public final C1200Yk B() {
        return this.f6185a.B();
    }

    public final C1536doa C() {
        return this.f6185a.C();
    }

    public final boolean D() {
        return this.f6185a.D();
    }

    public final Context E() {
        return this.f6185a.E();
    }

    public final boolean F() {
        return this.f6187c.get();
    }

    public final Qba G() {
        return this.f6185a.G();
    }

    public final Q H() {
        return this.f6185a.H();
    }

    public final int I() {
        return getMeasuredWidth();
    }

    public final void J() {
        this.f6185a.J();
    }

    public final String K() {
        return this.f6185a.K();
    }

    public final void L() {
        this.f6185a.L();
    }

    public final int M() {
        return this.f6185a.M();
    }

    public final int N() {
        return getMeasuredHeight();
    }

    public final C0967Pl O() {
        return this.f6186b;
    }

    public final void P() {
        this.f6185a.P();
    }

    public final void Q() {
        this.f6185a.Q();
    }

    public final f a() {
        return this.f6185a.a();
    }

    public final void a(int i) {
        this.f6185a.a(i);
    }

    public final void a(Context context) {
        this.f6185a.a(context);
    }

    public final void a(ViewGroup viewGroup, Activity activity, String str, String str2) {
        this.f6185a.a(this, activity, str, str2);
    }

    public final void a(a aVar) {
        this.f6185a.a(aVar);
    }

    public final void a(c cVar) {
        this.f6185a.a(cVar);
    }

    public final void a(f fVar) {
        this.f6185a.a(fVar);
    }

    public final void a(C0813Jn jn) {
        this.f6185a.a(jn);
    }

    public final void a(C1112Va va) {
        this.f6185a.a(va);
    }

    public final void a(C1242_a _aVar) {
        this.f6185a.a(_aVar);
    }

    public final void a(C1536doa doa) {
        this.f6185a.a(doa);
    }

    public final void a(C1819ho hoVar) {
        this.f6185a.a(hoVar);
    }

    public final void a(C2810vna vna) {
        this.f6185a.a(vna);
    }

    public final void a(C2988yS ySVar, DS ds) {
        this.f6185a.a(ySVar, ds);
    }

    public final void a(String str) {
        this.f6185a.a(str);
    }

    public final void a(String str, n<C1088Uc<? super C2313on>> nVar) {
        this.f6185a.a(str, nVar);
    }

    public final void a(String str, C0994Qm qm) {
        this.f6185a.a(str, qm);
    }

    public final void a(String str, C1088Uc<? super C2313on> uc) {
        this.f6185a.a(str, uc);
    }

    public final void a(String str, String str2, String str3) {
        this.f6185a.a(str, str2, str3);
    }

    public final void a(String str, Map<String, ?> map) {
        this.f6185a.a(str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        this.f6185a.a(str, jSONObject);
    }

    public final void a(boolean z) {
        this.f6185a.a(z);
    }

    public final void a(boolean z, int i, String str) {
        this.f6185a.a(z, i, str);
    }

    public final void a(boolean z, int i, String str, String str2) {
        this.f6185a.a(z, i, str, str2);
    }

    public final void a(boolean z, long j) {
        this.f6185a.a(z, j);
    }

    public final boolean a(boolean z, int i) {
        if (!this.f6187c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) Qqa.e().a(F.na)).booleanValue()) {
            return false;
        }
        if (this.f6185a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f6185a.getParent()).removeView(this.f6185a.getView());
        }
        return this.f6185a.a(z, i);
    }

    public final C0994Qm b(String str) {
        return this.f6185a.b(str);
    }

    public final void b(int i) {
        this.f6185a.b(i);
    }

    public final void b(f fVar) {
        this.f6185a.b(fVar);
    }

    public final void b(String str, C1088Uc<? super C2313on> uc) {
        this.f6185a.b(str, uc);
    }

    public final void b(String str, JSONObject jSONObject) {
        this.f6185a.b(str, jSONObject);
    }

    public final void b(boolean z) {
        this.f6185a.b(z);
    }

    public final void b(boolean z, int i) {
        this.f6185a.b(z, i);
    }

    public final boolean b() {
        return this.f6185a.b();
    }

    public final C2670toa c() {
        return this.f6185a.c();
    }

    public final void c(boolean z) {
        this.f6185a.c(z);
    }

    public final a d() {
        return this.f6185a.d();
    }

    public final void d(boolean z) {
        this.f6185a.d(z);
    }

    public final void destroy() {
        a d2 = d();
        if (d2 != null) {
            oa.f5628a.post(new C0657Dn(d2));
            oa.f5628a.postDelayed(new C0631Cn(this), (long) ((Integer) Qqa.e().a(F.pd)).intValue());
            return;
        }
        this.f6185a.destroy();
    }

    public final C0813Jn e() {
        return this.f6185a.e();
    }

    public final void e(boolean z) {
        this.f6185a.e(z);
    }

    public final Activity f() {
        return this.f6185a.f();
    }

    public final void f(boolean z) {
        this.f6185a.f(z);
    }

    public final f g() {
        return this.f6185a.g();
    }

    public final String getRequestId() {
        return this.f6185a.getRequestId();
    }

    public final View getView() {
        return this;
    }

    public final WebView getWebView() {
        return this.f6185a.getWebView();
    }

    public final void h() {
        this.f6185a.h();
    }

    public final boolean i() {
        return this.f6185a.i();
    }

    public final boolean isDestroyed() {
        return this.f6185a.isDestroyed();
    }

    public final boolean j() {
        return this.f6185a.j();
    }

    public final b k() {
        return this.f6185a.k();
    }

    public final void l() {
        this.f6185a.l();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f6185a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f6185a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f6185a.loadUrl(str);
    }

    public final C1819ho m() {
        return this.f6185a.m();
    }

    public final DS n() {
        return this.f6185a.n();
    }

    public final void o() {
        this.f6186b.a();
        this.f6185a.o();
    }

    public final void onAdClicked() {
        C2313on onVar = this.f6185a;
        if (onVar != null) {
            onVar.onAdClicked();
        }
    }

    public final void onPause() {
        this.f6186b.b();
        this.f6185a.onPause();
    }

    public final void onResume() {
        this.f6185a.onResume();
    }

    public final String p() {
        return this.f6185a.p();
    }

    public final C1242_a q() {
        return this.f6185a.q();
    }

    public final boolean r() {
        return this.f6185a.r();
    }

    public final C2988yS s() {
        return this.f6185a.s();
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f6185a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f6185a.setOnTouchListener(onTouchListener);
    }

    public final void setRequestedOrientation(int i) {
        this.f6185a.setRequestedOrientation(i);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f6185a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f6185a.setWebViewClient(webViewClient);
    }

    public final C1323ao t() {
        return this.f6185a.t();
    }

    public final void u() {
        setBackgroundColor(0);
        this.f6185a.setBackgroundColor(0);
    }

    public final void v() {
        this.f6185a.v();
    }

    public final void w() {
        this.f6185a.w();
    }

    public final U x() {
        return this.f6185a.x();
    }

    public final void y() {
        TextView textView = new TextView(getContext());
        Resources b2 = p.g().b();
        textView.setText(b2 != null ? b2.getString(com.google.android.gms.ads.d.a.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    public final WebViewClient z() {
        return this.f6185a.z();
    }
}
