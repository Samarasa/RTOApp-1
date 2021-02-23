package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.tR  reason: case insensitive filesystem */
public final class C2632tR implements Xga<C2278oR<C2617tC, C2405qC>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f12202a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<GT> f12203b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<XT> f12204c;

    public C2632tR(C1876iha<Context> iha, C1876iha<GT> iha2, C1876iha<XT> iha3) {
        this.f12202a = iha;
        this.f12203b = iha2;
        this.f12204c = iha3;
    }

    public final /* synthetic */ Object get() {
        C2278oR oRVar;
        Context context = this.f12202a.get();
        GT gt = this.f12203b.get();
        XT xt = this.f12204c.get();
        if (((Integer) Qqa.e().a(F.Ge)).intValue() > 0) {
            _T a2 = xt.a(PT.Rewarded, context, gt, new WQ(new NQ()));
            oRVar = new SQ(new C1640fR(new C1711gR()), new XQ(a2.f9661a, C1252_k.f9699a), a2.f9662b, C1252_k.f9699a);
        } else {
            oRVar = new C1711gR();
        }
        C1452cha.a(oRVar, "Cannot return null from a non-@Nullable @Provides method");
        return oRVar;
    }
}
