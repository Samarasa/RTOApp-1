package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.a;
import java.util.Map;
import java.util.concurrent.Executor;

public final class FC {

    /* renamed from: a  reason: collision with root package name */
    private final C2537ru f6796a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C1080Tu f6797b;

    /* renamed from: c  reason: collision with root package name */
    private final C1830hv f6798c;

    /* renamed from: d  reason: collision with root package name */
    private final C2468qv f6799d;

    /* renamed from: e  reason: collision with root package name */
    private final C3036yw f6800e;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f6801f;

    /* renamed from: g  reason: collision with root package name */
    private final C3037yx f6802g;

    /* renamed from: h  reason: collision with root package name */
    private final C0660Dq f6803h;
    private final a i;
    private final C0924Nu j;
    private final C0835Kj k;
    private final Qba l;
    /* access modifiers changed from: private */
    public final C2539rw m;
    private final C1701gH n;
    private final C1644fV o;
    private final C1627fE p;

    public FC(C2537ru ruVar, C1080Tu tu, C1830hv hvVar, C2468qv qvVar, C3036yw ywVar, Executor executor, C3037yx yxVar, C0660Dq dq, a aVar, C0924Nu nu, C0835Kj kj, Qba qba, C2539rw rwVar, C1701gH gHVar, C1644fV fVVar, C1627fE fEVar) {
        this.f6796a = ruVar;
        this.f6797b = tu;
        this.f6798c = hvVar;
        this.f6799d = qvVar;
        this.f6800e = ywVar;
        this.f6801f = executor;
        this.f6802g = yxVar;
        this.f6803h = dq;
        this.i = aVar;
        this.j = nu;
        this.k = kj;
        this.l = qba;
        this.m = rwVar;
        this.n = gHVar;
        this.o = fVVar;
        this.p = fEVar;
    }

    public static LY<?> a(C2313on onVar, String str, String str2) {
        C1742gl glVar = new C1742gl();
        onVar.t().a((Cdo) new RC(glVar));
        onVar.a(str, str2, (String) null);
        return glVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.f6797b.Y();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(View view) {
        this.i.a();
        C0835Kj kj = this.k;
        if (kj != null) {
            kj.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(C2313on onVar, C2313on onVar2, Map map) {
        this.f6803h.a(onVar);
    }

    public final void a(C2313on onVar, boolean z) {
        HW a2;
        C2313on onVar2 = onVar;
        onVar.t().a(new IC(this), this.f6798c, this.f6799d, new HC(this), new KC(this), z, (C1062Tc) null, this.i, new QC(this), this.k, this.n, this.o, this.p);
        onVar2.setOnTouchListener(new JC(this));
        onVar2.setOnClickListener(new MC(this));
        if (((Boolean) Qqa.e().a(F.Ib)).booleanValue() && (a2 = this.l.a()) != null) {
            a2.a(onVar.getView());
        }
        this.f6802g.a(onVar2, this.f6801f);
        this.f6802g.a(new LC(onVar2), this.f6801f);
        this.f6802g.a(onVar.getView());
        onVar2.b("/trackActiveViewUnit", new PC(this, onVar2));
        this.f6803h.a((Object) onVar2);
        if (!((Boolean) Qqa.e().a(F.qa)).booleanValue()) {
            C0924Nu nu = this.j;
            onVar.getClass();
            nu.a(NC.a(onVar), this.f6801f);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, String str2) {
        this.f6800e.a(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        this.i.a();
        C0835Kj kj = this.k;
        if (kj == null) {
            return false;
        }
        kj.b();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.f6796a.onAdClicked();
    }
}
