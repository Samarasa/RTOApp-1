package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.oJ  reason: case insensitive filesystem */
public final class C2270oJ implements AH<C2405qC, C1925jT, C2127mI> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11579a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11580b;

    /* renamed from: c  reason: collision with root package name */
    private final C2617tC f11581c;

    public C2270oJ(Context context, Executor executor, C2617tC tCVar) {
        this.f11579a = context;
        this.f11580b = executor;
        this.f11581c = tCVar;
    }

    public final void a(OS os, C2988yS ySVar, C2693uH<C1925jT, C2127mI> uHVar) {
        try {
            SS ss = os.f8087a.f7415a;
            if (ss.n.f6849a == KS.f7552c) {
                ((C1925jT) uHVar.f12306b).c(this.f11579a, ss.f8618d, ySVar.u.toString(), (C0831Kf) uHVar.f12307c);
            } else {
                ((C1925jT) uHVar.f12306b).b(this.f11579a, ss.f8618d, ySVar.u.toString(), (C0831Kf) uHVar.f12307c);
            }
        } catch (Exception e2) {
            String valueOf = String.valueOf(uHVar.f12305a);
            C1018Rk.c(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e2);
        }
    }

    public final /* synthetic */ Object b(OS os, C2988yS ySVar, C2693uH uHVar) {
        C2546sC a2 = this.f11581c.a(new C0974Ps(os, ySVar, uHVar.f12305a), new C2475rC(new C2199nJ(uHVar)));
        a2.a().a(new C2248nq((C1925jT) uHVar.f12306b), this.f11580b);
        ((C2127mI) uHVar.f12307c).a((C0831Kf) a2.m());
        return a2.k();
    }
}
