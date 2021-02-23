package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Vd  reason: case insensitive filesystem */
public final class C1115Vd extends C1799he<C1090Ue> implements C1516de, C1870ie {

    /* renamed from: c  reason: collision with root package name */
    private final C2882wo f9060c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C2082le f9061d;

    public C1115Vd(Context context, C1200Yk yk) {
        try {
            this.f9060c = new C2882wo(context, new C1303ae(this));
            this.f9060c.setWillNotDraw(true);
            this.f9060c.addJavascriptInterface(new C1374be(this), "GoogleJsInterface");
            p.c().a(context, yk.f9456a, this.f9060c.getSettings());
            super.a(this);
        } catch (Throwable th) {
            throw new C0605Bn("Init failed.", th);
        }
    }

    public final C1064Te P() {
        return new C1168Xe(this);
    }

    public final void a(C2082le leVar) {
        this.f9061d = leVar;
    }

    public final void a(String str) {
        C1252_k.f9703e.execute(new C1245_d(this, str));
    }

    public final void a(String str, String str2) {
        C1445ce.a((C1516de) this, str, str2);
    }

    public final void a(String str, Map map) {
        C1445ce.a((C1516de) this, str, map);
    }

    public final void a(String str, JSONObject jSONObject) {
        C1445ce.b(this, str, jSONObject);
    }

    public final void b(String str, JSONObject jSONObject) {
        C1445ce.a((C1516de) this, str, jSONObject);
    }

    public final void c(String str) {
        C1252_k.f9703e.execute(new C1193Yd(this, str));
    }

    public final void d(String str) {
        C1252_k.f9703e.execute(new C1167Xd(this, str));
    }

    public final void destroy() {
        this.f9060c.destroy();
    }

    public final void e(String str) {
        c(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(String str) {
        this.f9060c.a(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(String str) {
        this.f9060c.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str) {
        this.f9060c.loadData(str, "text/html", "UTF-8");
    }

    public final boolean isDestroyed() {
        return this.f9060c.isDestroyed();
    }
}
