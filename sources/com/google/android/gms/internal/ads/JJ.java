package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class JJ implements AH<C2405qC, C1925jT, C2340pI> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7395a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Executor f7396b;

    /* renamed from: c  reason: collision with root package name */
    private final C2617tC f7397c;

    public JJ(Context context, Executor executor, C2617tC tCVar) {
        this.f7395a = context;
        this.f7396b = executor;
        this.f7397c = tCVar;
    }

    /* access modifiers changed from: private */
    public static void c(OS os, C2988yS ySVar, C2693uH<C1925jT, C2340pI> uHVar) {
        try {
            ((C1925jT) uHVar.f12306b).a(os.f8087a.f7415a.f8618d, ySVar.u.toString());
        } catch (Exception e2) {
            String valueOf = String.valueOf(uHVar.f12305a);
            C1018Rk.c(valueOf.length() != 0 ? "Fail to load ad from adapter ".concat(valueOf) : new String("Fail to load ad from adapter "), e2);
        }
    }

    public final void a(OS os, C2988yS ySVar, C2693uH<C1925jT, C2340pI> uHVar) {
        if (!((C1925jT) uHVar.f12306b).d()) {
            ((C2340pI) uHVar.f12307c).a((C0979Px) new LJ(this, os, ySVar, uHVar));
            ((C1925jT) uHVar.f12306b).a(this.f7395a, os.f8087a.f7415a.f8618d, (String) null, (C1455cj) uHVar.f12307c, ySVar.u.toString());
            return;
        }
        c(os, ySVar, uHVar);
    }

    public final /* synthetic */ Object b(OS os, C2988yS ySVar, C2693uH uHVar) {
        C2546sC a2 = this.f7397c.a(new C0974Ps(os, ySVar, uHVar.f12305a), new C2475rC(new IJ(uHVar)));
        a2.a().a(new C2248nq((C1925jT) uHVar.f12306b), this.f7396b);
        C1080Tu b2 = a2.b();
        C2537ru c2 = a2.c();
        ((C2340pI) uHVar.f12307c).a((C1455cj) new NJ(this, a2.j(), c2, b2, a2.l()));
        return a2.k();
    }
}
