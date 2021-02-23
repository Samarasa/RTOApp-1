package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c.b.b.b.c.a;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.overlay.f;
import com.google.android.gms.common.util.n;

/* renamed from: com.google.android.gms.internal.ads.on  reason: case insensitive filesystem */
public interface C2313on extends k, C1141Wd, C2578se, C1175Xl, C1534dn, C0839Kn, C0995Qn, C1021Rn, C1125Vn, C1229Zn, C1255_n, C1394bo, C2739una, C1540dqa {
    void A();

    C1200Yk B();

    C1536doa C();

    boolean D();

    Context E();

    boolean F();

    Qba G();

    f a();

    void a(int i);

    void a(Context context);

    void a(ViewGroup viewGroup, Activity activity, String str, String str2);

    void a(a aVar);

    void a(f fVar);

    void a(C0813Jn jn);

    void a(C1112Va va);

    void a(C1242_a _aVar);

    void a(C1536doa doa);

    void a(C1819ho hoVar);

    void a(C2988yS ySVar, DS ds);

    void a(String str, n<C1088Uc<? super C2313on>> nVar);

    void a(String str, C0994Qm qm);

    void a(String str, C1088Uc<? super C2313on> uc);

    void a(String str, String str2, String str3);

    void a(boolean z);

    boolean a(boolean z, int i);

    void b(f fVar);

    void b(String str, C1088Uc<? super C2313on> uc);

    void b(boolean z);

    boolean b();

    C2670toa c();

    void c(boolean z);

    a d();

    void d(boolean z);

    void destroy();

    C0813Jn e();

    void e(boolean z);

    Activity f();

    f g();

    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    View getView();

    WebView getWebView();

    int getWidth();

    void h();

    boolean i();

    boolean isDestroyed();

    boolean j();

    b k();

    void l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    C1819ho m();

    void measure(int i, int i2);

    DS n();

    void o();

    void onPause();

    void onResume();

    String p();

    C1242_a q();

    boolean r();

    C2988yS s();

    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    C1323ao t();

    void u();

    void v();

    void w();

    U x();

    void y();

    WebViewClient z();
}
