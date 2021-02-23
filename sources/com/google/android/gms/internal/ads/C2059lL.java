package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.internal.ads.C1004Qw;
import com.google.android.gms.internal.ads.C1616eu;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.lL  reason: case insensitive filesystem */
public final class C2059lL implements C1776hL<C3103zs> {

    /* renamed from: a  reason: collision with root package name */
    private final US f11157a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C0710Fo f11158b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f11159c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C1634fL f11160d;

    /* renamed from: e  reason: collision with root package name */
    private C0740Gs f11161e;

    public C2059lL(C0710Fo fo, Context context, C1634fL fLVar, US us) {
        this.f11158b = fo;
        this.f11159c = context;
        this.f11160d = fLVar;
        this.f11157a = us;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.f11160d.e().a(C2209nT.a(C2351pT.INVALID_AD_UNIT_ID, (String) null, (C1824hqa) null));
    }

    public final boolean a(C2249nqa nqa, String str, C1988kL kLVar, C1917jL<? super C3103zs> jLVar) {
        C1409bz bzVar;
        C2746ur urVar;
        Executor a2;
        Runnable nLVar;
        p.c();
        if (oa.o(this.f11159c) && nqa.s == null) {
            C1018Rk.b("Failed to load the ad because app ID is missing.");
            a2 = this.f11158b.a();
            nLVar = new C2272oL(this);
        } else if (str == null) {
            C1018Rk.b("Ad unit ID should not be null for NativeAdLoader.");
            a2 = this.f11158b.a();
            nLVar = new C2201nL(this);
        } else {
            C1713gT.a(this.f11159c, nqa.f11539f);
            int i = kLVar instanceof C2130mL ? ((C2130mL) kLVar).f11292a : 1;
            US us = this.f11157a;
            us.a(nqa);
            us.a(i);
            SS d2 = us.d();
            if (((Boolean) Qqa.e().a(F.xf)).booleanValue()) {
                bzVar = this.f11158b.n();
                C1616eu.a aVar = new C1616eu.a();
                aVar.a(this.f11159c);
                aVar.a(d2);
                bzVar.c(aVar.a());
                bzVar.a(new C1004Qw.a().a());
                bzVar.b(this.f11160d.a());
                urVar = new C2746ur((ViewGroup) null);
            } else {
                bzVar = this.f11158b.n();
                C1616eu.a aVar2 = new C1616eu.a();
                aVar2.a(this.f11159c);
                aVar2.a(d2);
                bzVar.c(aVar2.a());
                C1004Qw.a aVar3 = new C1004Qw.a();
                aVar3.a(this.f11160d.d(), this.f11158b.a());
                aVar3.a(this.f11160d.e(), this.f11158b.a());
                aVar3.a(this.f11160d.f(), this.f11158b.a());
                aVar3.a(this.f11160d.g(), this.f11158b.a());
                aVar3.a(this.f11160d.c(), this.f11158b.a());
                aVar3.a(d2.m, this.f11158b.a());
                bzVar.a(aVar3.a());
                bzVar.b(this.f11160d.a());
                urVar = new C2746ur((ViewGroup) null);
            }
            bzVar.d(urVar);
            C1240Zy b2 = bzVar.b();
            this.f11158b.t().a(1);
            this.f11161e = new C0740Gs(this.f11158b.c(), this.f11158b.b(), b2.a().b());
            this.f11161e.a((AY<C3103zs>) new C2414qL(this, jLVar, b2));
            return true;
        }
        a2.execute(nLVar);
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        this.f11160d.e().a(C2209nT.a(C2351pT.APP_ID_MISSING, (String) null, (C1824hqa) null));
    }

    public final boolean q() {
        C0740Gs gs = this.f11161e;
        return gs != null && gs.a();
    }
}
