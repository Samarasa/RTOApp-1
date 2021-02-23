package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pA  reason: case insensitive filesystem */
public final class C2332pA {

    /* renamed from: a  reason: collision with root package name */
    private final DC f11671a;

    /* renamed from: b  reason: collision with root package name */
    private final VB f11672b;

    /* renamed from: c  reason: collision with root package name */
    private final C0894Mq f11673c;

    /* renamed from: d  reason: collision with root package name */
    private final C1085Tz f11674d;

    public C2332pA(DC dc, VB vb, C0894Mq mq, C1085Tz tz) {
        this.f11671a = dc;
        this.f11672b = vb;
        this.f11673c = mq;
        this.f11674d = tz;
    }

    public final View a() {
        C2313on a2 = this.f11671a.a(C2462qqa.g());
        a2.getView().setVisibility(8);
        a2.b("/sendMessageToSdk", new C2261oA(this));
        a2.b("/adMuted", new C2473rA(this));
        this.f11672b.a(new WeakReference(a2), "/loadHtml", new C2403qA(this));
        this.f11672b.a(new WeakReference(a2), "/showOverlay", new C2615tA(this));
        this.f11672b.a(new WeakReference(a2), "/hideOverlay", new C2544sA(this));
        return a2.getView();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C2313on onVar, Map map) {
        C1018Rk.c("Hiding native ads overlay.");
        onVar.getView().setVisibility(8);
        this.f11673c.f(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f11672b.a("sendMessageToNativeJs", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(C2313on onVar, Map map) {
        C1018Rk.c("Showing native ads overlay.");
        onVar.getView().setVisibility(0);
        this.f11673c.f(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(C2313on onVar, Map map) {
        this.f11674d.c();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(C2313on onVar, Map map) {
        this.f11672b.a("sendMessageToNativeJs", (Map<String, ?>) map);
    }
}
