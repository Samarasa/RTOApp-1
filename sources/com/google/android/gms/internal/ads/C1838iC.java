package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.iC  reason: case insensitive filesystem */
public final class C1838iC implements Xga<C1767hC> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f10769a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f10770b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Qba> f10771c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C1200Yk> f10772d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<b> f10773e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<C2951xn> f10774f;

    /* renamed from: g  reason: collision with root package name */
    private final C1876iha<C1701gH> f10775g;

    /* renamed from: h  reason: collision with root package name */
    private final C1876iha<C1644fV> f10776h;
    private final C1876iha<C1627fE> i;

    public C1838iC(C1876iha<Context> iha, C1876iha<Executor> iha2, C1876iha<Qba> iha3, C1876iha<C1200Yk> iha4, C1876iha<b> iha5, C1876iha<C2951xn> iha6, C1876iha<C1701gH> iha7, C1876iha<C1644fV> iha8, C1876iha<C1627fE> iha9) {
        this.f10769a = iha;
        this.f10770b = iha2;
        this.f10771c = iha3;
        this.f10772d = iha4;
        this.f10773e = iha5;
        this.f10774f = iha6;
        this.f10775g = iha7;
        this.f10776h = iha8;
        this.i = iha9;
    }

    public final /* synthetic */ Object get() {
        return new C1767hC(this.f10769a.get(), this.f10770b.get(), this.f10771c.get(), this.f10772d.get(), this.f10773e.get(), this.f10774f.get(), this.f10775g.get(), this.f10776h.get(), this.i.get());
    }
}
