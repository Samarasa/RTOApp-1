package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import com.google.android.gms.ads.internal.k;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.util.n;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ke  reason: case insensitive filesystem */
public final class C2011ke implements C1516de, C1870ie {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C2313on f11075a;

    public C2011ke(Context context, C1200Yk yk, Qba qba, b bVar) {
        p.d();
        this.f11075a = C2951xn.a(context, C1819ho.b(), BuildConfig.FLAVOR, false, false, qba, (C1862ia) null, yk, (T) null, (k) null, (b) null, Soa.a(), (C2670toa) null, false, (C2988yS) null, (DS) null);
        this.f11075a.getView().setWillNotDraw(true);
    }

    private static void a(Runnable runnable) {
        Qqa.a();
        if (C0758Hk.b()) {
            runnable.run();
        } else {
            oa.f5628a.post(runnable);
        }
    }

    public final C1064Te P() {
        return new C1168Xe(this);
    }

    public final void a(C2082le leVar) {
        C1323ao t = this.f11075a.t();
        leVar.getClass();
        t.a(C2366pe.a(leVar));
    }

    public final void a(String str) {
        a((Runnable) new C2224ne(this, str));
    }

    public final void a(String str, C1088Uc<? super C1090Ue> uc) {
        this.f11075a.a(str, (n<C1088Uc<? super C2313on>>) new C2153me(uc));
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

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str) {
        this.f11075a.a(str);
    }

    public final void b(String str, C1088Uc<? super C1090Ue> uc) {
        this.f11075a.b(str, new C2649te(this, uc));
    }

    public final void b(String str, JSONObject jSONObject) {
        C1445ce.a((C1516de) this, str, jSONObject);
    }

    public final void c(String str) {
        a((Runnable) new C2507re(this, str));
    }

    public final void d(String str) {
        a((Runnable) new C2437qe(this, str));
    }

    public final void destroy() {
        this.f11075a.destroy();
    }

    public final void e(String str) {
        a((Runnable) new C2295oe(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final boolean isDestroyed() {
        return this.f11075a.isDestroyed();
    }
}
