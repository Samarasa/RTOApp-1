package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.zp  reason: case insensitive filesystem */
final class C3097zp implements GR {

    /* renamed from: a  reason: collision with root package name */
    private Context f13122a;

    /* renamed from: b  reason: collision with root package name */
    private String f13123b;

    /* renamed from: c  reason: collision with root package name */
    private C2462qqa f13124c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C1256_o f13125d;

    private C3097zp(C1256_o _oVar) {
        this.f13125d = _oVar;
    }

    public final /* synthetic */ GR a(Context context) {
        C1452cha.a(context);
        this.f13122a = context;
        return this;
    }

    public final /* synthetic */ GR a(C2462qqa qqa) {
        C1452cha.a(qqa);
        this.f13124c = qqa;
        return this;
    }

    public final /* synthetic */ GR a(String str) {
        C1452cha.a(str);
        this.f13123b = str;
        return this;
    }

    public final HR a() {
        C1452cha.a(this.f13122a, Context.class);
        C1452cha.a(this.f13123b, String.class);
        C1452cha.a(this.f13124c, C2462qqa.class);
        return new C3026yp(this.f13125d, this.f13122a, this.f13123b, this.f13124c);
    }
}
