package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import b.e.i;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.p;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class PB extends C0723Gb {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8177a;

    /* renamed from: b  reason: collision with root package name */
    private final C0877Lz f8178b;

    /* renamed from: c  reason: collision with root package name */
    private C1765hA f8179c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public C3110zz f8180d;

    public PB(Context context, C0877Lz lz, C1765hA hAVar, C3110zz zzVar) {
        this.f8177a = context;
        this.f8178b = lz;
        this.f8179c = hAVar;
        this.f8180d = zzVar;
    }

    public final boolean Ab() {
        C3110zz zzVar = this.f8180d;
        return (zzVar == null || zzVar.l()) && this.f8178b.u() != null && this.f8178b.t() == null;
    }

    public final a B() {
        return null;
    }

    public final a Mb() {
        return b.a(this.f8177a);
    }

    public final String W() {
        return this.f8178b.e();
    }

    public final void bb() {
        String x = this.f8178b.x();
        if ("Google".equals(x)) {
            C1018Rk.d("Illegal argument specified for omid partner name.");
            return;
        }
        C3110zz zzVar = this.f8180d;
        if (zzVar != null) {
            zzVar.a(x, false);
        }
    }

    public final void destroy() {
        C3110zz zzVar = this.f8180d;
        if (zzVar != null) {
            zzVar.a();
        }
        this.f8180d = null;
        this.f8179c = null;
    }

    public final Sra getVideoController() {
        return this.f8178b.n();
    }

    public final List<String> jb() {
        i<String, C1190Ya> w = this.f8178b.w();
        i<String, String> y = this.f8178b.y();
        String[] strArr = new String[(w.size() + y.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < w.size()) {
            strArr[i3] = w.b(i2);
            i2++;
            i3++;
        }
        while (i < y.size()) {
            strArr[i3] = y.b(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    public final String l(String str) {
        return this.f8178b.y().get(str);
    }

    public final boolean nb() {
        a v = this.f8178b.v();
        if (v != null) {
            p.r().a(v);
            if (!((Boolean) Qqa.e().a(F.ud)).booleanValue() || this.f8178b.u() == null) {
                return true;
            }
            this.f8178b.u().a("onSdkLoaded", (Map<String, ?>) new b.e.b());
            return true;
        }
        C1018Rk.d("Trying to start OMID session before creation.");
        return false;
    }

    public final void p(String str) {
        C3110zz zzVar = this.f8180d;
        if (zzVar != null) {
            zzVar.a(str);
        }
    }

    public final void q(a aVar) {
        C3110zz zzVar;
        Object Q = b.Q(aVar);
        if ((Q instanceof View) && this.f8178b.v() != null && (zzVar = this.f8180d) != null) {
            zzVar.b((View) Q);
        }
    }

    public final boolean w(a aVar) {
        Object Q = b.Q(aVar);
        if (!(Q instanceof ViewGroup)) {
            return false;
        }
        C1765hA hAVar = this.f8179c;
        if (!(hAVar != null && hAVar.a((ViewGroup) Q))) {
            return false;
        }
        this.f8178b.t().a((C1242_a) new SB(this));
        return true;
    }

    public final C2076lb y(String str) {
        return this.f8178b.w().get(str);
    }

    public final void z() {
        C3110zz zzVar = this.f8180d;
        if (zzVar != null) {
            zzVar.j();
        }
    }
}
