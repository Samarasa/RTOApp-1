package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.C0515v;

/* renamed from: com.google.android.gms.internal.ads.gf  reason: case insensitive filesystem */
public final class C1730gf {

    /* renamed from: a  reason: collision with root package name */
    private static final C0515v<C1870ie> f10557a = new C1659ff();

    /* renamed from: b  reason: collision with root package name */
    private static final C0515v<C1870ie> f10558b = new Cif();

    /* renamed from: c  reason: collision with root package name */
    private final C2862we f10559c;

    public C1730gf(Context context, C1200Yk yk, String str) {
        this.f10559c = new C2862we(context, yk, str, f10557a, f10558b);
    }

    public final <I, O> C1220Ze<I, O> a(String str, C1246_e<I> _eVar, C1305af<O> afVar) {
        return new C1801hf(this.f10559c, str, _eVar, afVar);
    }

    public final C2084lf a() {
        return new C2084lf(this.f10559c);
    }
}
