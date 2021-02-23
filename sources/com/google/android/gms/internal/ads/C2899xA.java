package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.util.T;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.xA  reason: case insensitive filesystem */
public final class C2899xA {

    /* renamed from: a  reason: collision with root package name */
    private final DC f12726a;

    /* renamed from: b  reason: collision with root package name */
    private final VB f12727b;

    /* renamed from: c  reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f12728c = null;

    public C2899xA(DC dc, VB vb) {
        this.f12726a = dc;
        this.f12727b = vb;
    }

    private static int a(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        Qqa.a();
        return C0758Hk.b(context, i);
    }

    public final View a(View view, WindowManager windowManager) {
        C2313on a2 = this.f12726a.a(C2462qqa.g());
        a2.getView().setVisibility(4);
        a2.getView().setContentDescription("policy_validator");
        a2.b("/sendMessageToSdk", new C2828wA(this));
        a2.b("/hideValidatorOverlay", new C3041zA(this, windowManager, view));
        a2.b("/open", new C1192Yc((a) null, (C1170Xg) null, (C1701gH) null, (C1627fE) null));
        this.f12727b.a(new WeakReference(a2), "/loadNativeAdPolicyViolations", new C2970yA(this, view, windowManager));
        this.f12727b.a(new WeakReference(a2), "/showValidatorOverlay", BA.f6243a);
        return a2.getView();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view, WindowManager windowManager, C2313on onVar, Map map) {
        onVar.t().a((Cdo) new DA(this, map));
        if (map != null) {
            Context context = view.getContext();
            int a2 = a(context, (String) map.get("validator_width"), ((Integer) Qqa.e().a(F.pf)).intValue());
            int a3 = a(context, (String) map.get("validator_height"), ((Integer) Qqa.e().a(F.qf)).intValue());
            int a4 = a(context, (String) map.get("validator_x"), 0);
            int a5 = a(context, (String) map.get("validator_y"), 0);
            onVar.a(C1819ho.a(a2, a3));
            try {
                onVar.getWebView().getSettings().setUseWideViewPort(((Boolean) Qqa.e().a(F.rf)).booleanValue());
                onVar.getWebView().getSettings().setLoadWithOverviewMode(((Boolean) Qqa.e().a(F.sf)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams a6 = T.a();
            a6.x = a4;
            a6.y = a5;
            windowManager.updateViewLayout(onVar.getView(), a6);
            String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                this.f12728c = new AA(view, onVar, str, a6, (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - a5, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.f12728c);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                onVar.loadUrl(str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(WindowManager windowManager, View view, C2313on onVar, Map map) {
        C1018Rk.a("Hide native ad policy validator overlay.");
        onVar.getView().setVisibility(8);
        if (onVar.getView().getWindowToken() != null) {
            windowManager.removeView(onVar.getView());
        }
        onVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f12728c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f12728c);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C2313on onVar, Map map) {
        this.f12727b.a("sendMessageToNativeJs", (Map<String, ?>) map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f12727b.a("sendMessageToNativeJs", (Map<String, ?>) hashMap);
    }
}
