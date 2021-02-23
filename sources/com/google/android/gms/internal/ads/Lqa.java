package com.google.android.gms.internal.ads;

import android.content.Context;
import c.b.b.b.c.b;

final class Lqa extends Nqa<Zqa> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f7760b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7761c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C0675Ef f7762d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Aqa f7763e;

    Lqa(Aqa aqa, Context context, String str, C0675Ef ef) {
        this.f7763e = aqa;
        this.f7760b = context;
        this.f7761c = str;
        this.f7762d = ef;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a() {
        Aqa.b(this.f7760b, "native_ad");
        return new msa();
    }

    public final /* synthetic */ Object a(C2393pra pra) {
        return pra.b(b.a(this.f7760b), this.f7761c, this.f7762d, 203404000);
    }

    public final /* synthetic */ Object b() {
        return this.f7763e.f6204b.a(this.f7760b, this.f7761c, this.f7762d);
    }
}
