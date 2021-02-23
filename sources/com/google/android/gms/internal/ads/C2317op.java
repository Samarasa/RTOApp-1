package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.op  reason: case insensitive filesystem */
final class C2317op implements C1993kQ {

    /* renamed from: a  reason: collision with root package name */
    private Context f11641a;

    /* renamed from: b  reason: collision with root package name */
    private String f11642b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1256_o f11643c;

    private C2317op(C1256_o _oVar) {
        this.f11643c = _oVar;
    }

    public final /* synthetic */ C1993kQ a(Context context) {
        C1452cha.a(context);
        this.f11641a = context;
        return this;
    }

    public final /* synthetic */ C1993kQ a(String str) {
        C1452cha.a(str);
        this.f11642b = str;
        return this;
    }

    public final C2064lQ a() {
        C1452cha.a(this.f11641a, Context.class);
        C1452cha.a(this.f11642b, String.class);
        return new C2246np(this.f11643c, this.f11641a, this.f11642b);
    }
}
