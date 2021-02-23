package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.h.a;
import com.google.android.gms.internal.ads.C1004Qw;
import com.google.android.gms.internal.ads.C1616eu;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.eS  reason: case insensitive filesystem */
public final class C1570eS implements C1776hL<C2405qC> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10260a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f10261b;

    /* renamed from: c  reason: collision with root package name */
    private final C0710Fo f10262c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final JR f10263d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C2278oR<C2617tC, C2405qC> f10264e;

    /* renamed from: f  reason: collision with root package name */
    private final NS f10265f;

    /* renamed from: g  reason: collision with root package name */
    private final US f10266g;

    /* renamed from: h  reason: collision with root package name */
    private LY<C2405qC> f10267h;

    public C1570eS(Context context, Executor executor, C0710Fo fo, C2278oR<C2617tC, C2405qC> oRVar, JR jr, US us, NS ns) {
        this.f10260a = context;
        this.f10261b = executor;
        this.f10262c = fo;
        this.f10264e = oRVar;
        this.f10263d = jr;
        this.f10266g = us;
        this.f10265f = ns;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C2830wC a(C2207nR nRVar) {
        C1995kS kSVar = (C1995kS) nRVar;
        if (((Boolean) Qqa.e().a(F.uf)).booleanValue()) {
            C2830wC o = this.f10262c.o();
            C1616eu.a aVar = new C1616eu.a();
            aVar.a(this.f10260a);
            aVar.a(kSVar.f11057a);
            aVar.a(kSVar.f11058b);
            aVar.a(this.f10265f);
            o.d(aVar.a());
            o.b(new C1004Qw.a().a());
            return o;
        }
        JR a2 = JR.a(this.f10263d);
        C2830wC o2 = this.f10262c.o();
        C1616eu.a aVar2 = new C1616eu.a();
        aVar2.a(this.f10260a);
        aVar2.a(kSVar.f11057a);
        aVar2.a(kSVar.f11058b);
        aVar2.a(this.f10265f);
        o2.d(aVar2.a());
        C1004Qw.a aVar3 = new C1004Qw.a();
        aVar3.a((C2608su) a2, this.f10261b);
        aVar3.a((C1900iv) a2, this.f10261b);
        aVar3.a((C2963xu) a2, this.f10261b);
        aVar3.a((a) a2, this.f10261b);
        aVar3.a((C0768Hu) a2, this.f10261b);
        aVar3.a((C0613Bv) a2, this.f10261b);
        aVar3.a((C2065lR) a2);
        o2.b(aVar3.a());
        return o2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.f10263d.a(C2209nT.a(C2351pT.INVALID_AD_UNIT_ID, (String) null, (C1824hqa) null));
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.f10266g.c().a(i);
    }

    public final boolean a(C2249nqa nqa, String str, C1988kL kLVar, C1917jL<? super C2405qC> jLVar) {
        C1384bj bjVar = new C1384bj(nqa, str);
        String str2 = kLVar instanceof C1641fS ? ((C1641fS) kLVar).f10404a : null;
        if (bjVar.f9950b == null) {
            C1018Rk.b("Ad unit ID should not be null for rewarded video ad.");
            this.f10261b.execute(new C1783hS(this));
            return false;
        }
        LY<C2405qC> ly = this.f10267h;
        if (ly != null && !ly.isDone()) {
            return false;
        }
        C1713gT.a(this.f10260a, bjVar.f9949a.f11539f);
        US us = this.f10266g;
        us.a(bjVar.f9950b);
        us.a(C2462qqa.h());
        us.a(bjVar.f9949a);
        SS d2 = us.d();
        C1995kS kSVar = new C1995kS((C1924jS) null);
        kSVar.f11057a = d2;
        kSVar.f11058b = str2;
        this.f10267h = this.f10264e.a(new C2349pR(kSVar), new C1712gS(this));
        DY.a(this.f10267h, new C1924jS(this, jLVar, kSVar), this.f10261b);
        return true;
    }

    public final boolean q() {
        LY<C2405qC> ly = this.f10267h;
        return ly != null && !ly.isDone();
    }
}
