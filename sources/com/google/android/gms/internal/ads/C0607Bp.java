package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Bp  reason: case insensitive filesystem */
final class C0607Bp implements C2633tS {

    /* renamed from: a  reason: collision with root package name */
    private Context f6367a;

    /* renamed from: b  reason: collision with root package name */
    private String f6368b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1256_o f6369c;

    private C0607Bp(C1256_o _oVar) {
        this.f6369c = _oVar;
    }

    public final C2421qS a() {
        C1452cha.a(this.f6367a, Context.class);
        return new C0581Ap(this.f6369c, this.f6367a, this.f6368b);
    }

    public final /* synthetic */ C2633tS a(Context context) {
        C1452cha.a(context);
        this.f6367a = context;
        return this;
    }

    public final /* synthetic */ C2633tS a(String str) {
        this.f6368b = str;
        return this;
    }
}
