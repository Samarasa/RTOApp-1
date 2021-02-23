package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class VB {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C1413cC f9001a = new C1413cC((_B) null);

    /* renamed from: b  reason: collision with root package name */
    private final b f9002b;

    /* renamed from: c  reason: collision with root package name */
    private final C2951xn f9003c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f9004d;

    /* renamed from: e  reason: collision with root package name */
    private final C1627fE f9005e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f9006f;

    /* renamed from: g  reason: collision with root package name */
    private final Qba f9007g;

    /* renamed from: h  reason: collision with root package name */
    private final C1200Yk f9008h;
    private final C1584ed i;
    private final C1701gH j;
    private final C1644fV k;
    private LY<C2313on> l;

    VB(C1767hC hCVar) {
        this.f9004d = hCVar.f10642c;
        this.f9006f = hCVar.f10645f;
        this.f9007g = hCVar.f10646g;
        this.f9008h = hCVar.f10647h;
        this.f9002b = hCVar.f10640a;
        this.f9003c = hCVar.f10641b;
        this.i = new C1584ed();
        this.j = hCVar.f10644e;
        this.k = hCVar.i;
        this.f9005e = hCVar.f10643d;
    }

    public final synchronized LY<JSONObject> a(String str, JSONObject jSONObject) {
        if (this.l == null) {
            return DY.a(null);
        }
        return DY.a(this.l, new XB(this, str, jSONObject), this.f9006f);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ LY a(String str, JSONObject jSONObject, C2313on onVar) {
        return this.i.a(onVar, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2313on a(C2313on onVar) {
        C2313on onVar2 = onVar;
        onVar2.b("/result", this.i);
        C1323ao t = onVar.t();
        C1413cC cCVar = this.f9001a;
        t.a((C1540dqa) null, cCVar, cCVar, cCVar, cCVar, false, (C1062Tc) null, new a(this.f9004d, (C0835Kj) null, (C1382bi) null), (C1946jh) null, (C0835Kj) null, this.j, this.k, this.f9005e);
        return onVar2;
    }

    public final synchronized void a() {
        if (this.l != null) {
            DY.a(this.l, new _B(this), this.f9006f);
            this.l = null;
        }
    }

    public final synchronized void a(C2988yS ySVar, DS ds) {
        if (this.l != null) {
            DY.a(this.l, new C1484dC(this, ySVar, ds), this.f9006f);
        }
    }

    public final synchronized void a(String str, C1088Uc<Object> uc) {
        if (this.l != null) {
            DY.a(this.l, new ZB(this, str, uc), this.f9006f);
        }
    }

    public final synchronized void a(String str, Map<String, ?> map) {
        if (this.l != null) {
            DY.a(this.l, new C1271aC(this, str, map), this.f9006f);
        }
    }

    public final <T> void a(WeakReference<T> weakReference, String str, C1088Uc<T> uc) {
        a(str, (C1088Uc<Object>) new C1696gC(this, weakReference, str, uc, (_B) null));
    }

    public final synchronized void b() {
        this.l = DY.a(C2951xn.a(this.f9004d, this.f9008h, (String) Qqa.e().a(F.cc), this.f9007g, this.f9002b), new YB(this), this.f9006f);
        C1459cl.a(this.l, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void b(String str, C1088Uc<Object> uc) {
        if (this.l != null) {
            DY.a(this.l, new C1342bC(this, str, uc), this.f9006f);
        }
    }
}
