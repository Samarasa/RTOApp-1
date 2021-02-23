package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.b.a;
import com.google.android.gms.internal.ads.C1004Qw;
import com.google.android.gms.internal.ads.C1616eu;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yR  reason: case insensitive filesystem */
public final class C2987yR implements C1776hL<C1337ay> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f12906a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f12907b;

    /* renamed from: c  reason: collision with root package name */
    private final C0710Fo f12908c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final MK f12909d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final JR f12910e;

    /* renamed from: f  reason: collision with root package name */
    private C1508da f12911f;

    /* renamed from: g  reason: collision with root package name */
    private final US f12912g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public LY<C1337ay> f12913h;

    public C2987yR(Context context, Executor executor, C0710Fo fo, MK mk, JR jr, US us) {
        this.f12906a = context;
        this.f12907b = executor;
        this.f12908c = fo;
        this.f12909d = mk;
        this.f12912g = us;
        this.f12910e = jr;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.f12909d.a(C2209nT.a(C2351pT.INVALID_AD_UNIT_ID, (String) null, (C1824hqa) null));
    }

    public final void a(C1508da daVar) {
        this.f12911f = daVar;
    }

    public final boolean a(C2249nqa nqa, String str, C1988kL kLVar, C1917jL<? super C1337ay> jLVar) {
        C0616By by;
        if (str == null) {
            C1018Rk.b("Ad unit ID should not be null for interstitial ad.");
            this.f12907b.execute(new C2916xR(this));
            return false;
        } else if (q()) {
            return false;
        } else {
            C2462qqa qqa = kLVar instanceof C2774vR ? ((C2774vR) kLVar).f12498a : new C2462qqa();
            US us = this.f12912g;
            us.a(str);
            us.a(qqa);
            us.a(nqa);
            SS d2 = us.d();
            if (((Boolean) Qqa.e().a(F.wf)).booleanValue()) {
                C0746Gy l = this.f12908c.l();
                C1616eu.a aVar = new C1616eu.a();
                aVar.a(this.f12906a);
                aVar.a(d2);
                l.e(aVar.a());
                l.c(new C1004Qw.a().a());
                l.a(new C2058lK(this.f12911f));
                by = l.c();
            } else {
                C1004Qw.a aVar2 = new C1004Qw.a();
                JR jr = this.f12910e;
                if (jr != null) {
                    aVar2.a((C2608su) jr, this.f12907b);
                    aVar2.a((C1900iv) this.f12910e, this.f12907b);
                    aVar2.a((C2963xu) this.f12910e, this.f12907b);
                }
                C0746Gy l2 = this.f12908c.l();
                C1616eu.a aVar3 = new C1616eu.a();
                aVar3.a(this.f12906a);
                aVar3.a(d2);
                l2.e(aVar3.a());
                aVar2.a((C2608su) this.f12909d, this.f12907b);
                aVar2.a((C1900iv) this.f12909d, this.f12907b);
                aVar2.a((C2963xu) this.f12909d, this.f12907b);
                aVar2.a((C1540dqa) this.f12909d, this.f12907b);
                aVar2.a((a) this.f12909d, this.f12907b);
                aVar2.a((C0613Bv) this.f12909d, this.f12907b);
                l2.c(aVar2.a());
                l2.a(new C2058lK(this.f12911f));
                by = l2.c();
            }
            this.f12913h = by.a().b();
            DY.a(this.f12913h, new AR(this, jLVar, by), this.f12907b);
            return true;
        }
    }

    public final boolean q() {
        LY<C1337ay> ly = this.f12913h;
        return ly != null && !ly.isDone();
    }
}
