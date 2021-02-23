package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.vq  reason: case insensitive filesystem */
public final class C2815vq implements Xga<C2390pq> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f12584a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f12585b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f12586c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<OS> f12587d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C2988yS> f12588e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<C1503dV> f12589f;

    /* renamed from: g  reason: collision with root package name */
    private final C1876iha<_S> f12590g;

    /* renamed from: h  reason: collision with root package name */
    private final C1876iha<View> f12591h;
    private final C1876iha<Qba> i;
    private final C1876iha<C1862ia> j;
    private final C1876iha<C2216na> k;

    private C2815vq(C1876iha<Context> iha, C1876iha<Executor> iha2, C1876iha<ScheduledExecutorService> iha3, C1876iha<OS> iha4, C1876iha<C2988yS> iha5, C1876iha<C1503dV> iha6, C1876iha<_S> iha7, C1876iha<View> iha8, C1876iha<Qba> iha9, C1876iha<C1862ia> iha10, C1876iha<C2216na> iha11) {
        this.f12584a = iha;
        this.f12585b = iha2;
        this.f12586c = iha3;
        this.f12587d = iha4;
        this.f12588e = iha5;
        this.f12589f = iha6;
        this.f12590g = iha7;
        this.f12591h = iha8;
        this.i = iha9;
        this.j = iha10;
        this.k = iha11;
    }

    public static C2815vq a(C1876iha<Context> iha, C1876iha<Executor> iha2, C1876iha<ScheduledExecutorService> iha3, C1876iha<OS> iha4, C1876iha<C2988yS> iha5, C1876iha<C1503dV> iha6, C1876iha<_S> iha7, C1876iha<View> iha8, C1876iha<Qba> iha9, C1876iha<C1862ia> iha10, C1876iha<C2216na> iha11) {
        return new C2815vq(iha, iha2, iha3, iha4, iha5, iha6, iha7, iha8, iha9, iha10, iha11);
    }

    public final /* synthetic */ Object get() {
        return new C2390pq(this.f12584a.get(), this.f12585b.get(), this.f12586c.get(), this.f12587d.get(), this.f12588e.get(), this.f12589f.get(), this.f12590g.get(), this.f12591h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}
