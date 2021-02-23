package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.b;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.gB  reason: case insensitive filesystem */
public final class C1695gB implements Xga<_A> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f10490a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<RA> f10491b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Qba> f10492c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C1200Yk> f10493d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<b> f10494e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<Soa> f10495f;

    /* renamed from: g  reason: collision with root package name */
    private final C1876iha<Executor> f10496g;

    /* renamed from: h  reason: collision with root package name */
    private final C1876iha<SS> f10497h;
    private final C1876iha<C2545sB> i;
    private final C1876iha<ScheduledExecutorService> j;

    public C1695gB(C1876iha<Context> iha, C1876iha<RA> iha2, C1876iha<Qba> iha3, C1876iha<C1200Yk> iha4, C1876iha<b> iha5, C1876iha<Soa> iha6, C1876iha<Executor> iha7, C1876iha<SS> iha8, C1876iha<C2545sB> iha9, C1876iha<ScheduledExecutorService> iha10) {
        this.f10490a = iha;
        this.f10491b = iha2;
        this.f10492c = iha3;
        this.f10493d = iha4;
        this.f10494e = iha5;
        this.f10495f = iha6;
        this.f10496g = iha7;
        this.f10497h = iha8;
        this.i = iha9;
        this.j = iha10;
    }

    public final /* synthetic */ Object get() {
        return new _A(this.f10490a.get(), this.f10491b.get(), this.f10492c.get(), this.f10493d.get(), this.f10494e.get(), this.f10495f.get(), this.f10496g.get(), this.f10497h.get(), this.i.get(), this.j.get());
    }
}
