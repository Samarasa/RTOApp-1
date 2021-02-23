package com.google.android.gms.internal.ads;

import android.content.Context;
import c.b.b.b.c.b;

final class Iqa extends Nqa<C1755gra> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f7353b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C2462qqa f7354c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f7355d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C0675Ef f7356e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Aqa f7357f;

    Iqa(Aqa aqa, Context context, C2462qqa qqa, String str, C0675Ef ef) {
        this.f7357f = aqa;
        this.f7353b = context;
        this.f7354c = qqa;
        this.f7355d = str;
        this.f7356e = ef;
    }

    public final /* synthetic */ Object a() {
        Aqa.b(this.f7353b, "interstitial");
        return new qsa();
    }

    public final /* synthetic */ Object a(C2393pra pra) {
        return pra.b(b.a(this.f7353b), this.f7354c, this.f7355d, this.f7356e, 203404000);
    }

    public final /* synthetic */ Object b() {
        return this.f7357f.f6203a.a(this.f7353b, this.f7354c, this.f7355d, this.f7356e, 2);
    }
}
