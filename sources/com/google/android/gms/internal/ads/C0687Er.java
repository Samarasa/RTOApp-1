package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Er  reason: case insensitive filesystem */
public final class C0687Er implements Xga<C0635Cr> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C3032ys> f6773a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f6774b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<BS> f6775c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<View> f6776d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C2313on> f6777e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<C2819vs> f6778f;

    /* renamed from: g  reason: collision with root package name */
    private final C1876iha<C1059Sz> f6779g;

    /* renamed from: h  reason: collision with root package name */
    private final C1876iha<C0745Gx> f6780h;
    private final C1876iha<EK> i;
    private final C1876iha<Executor> j;

    public C0687Er(C1876iha<C3032ys> iha, C1876iha<Context> iha2, C1876iha<BS> iha3, C1876iha<View> iha4, C1876iha<C2313on> iha5, C1876iha<C2819vs> iha6, C1876iha<C1059Sz> iha7, C1876iha<C0745Gx> iha8, C1876iha<EK> iha9, C1876iha<Executor> iha10) {
        this.f6773a = iha;
        this.f6774b = iha2;
        this.f6775c = iha3;
        this.f6776d = iha4;
        this.f6777e = iha5;
        this.f6778f = iha6;
        this.f6779g = iha7;
        this.f6780h = iha8;
        this.i = iha9;
        this.j = iha10;
    }

    public static C0635Cr a(C3032ys ysVar, Context context, BS bs, View view, C2313on onVar, C2819vs vsVar, C1059Sz sz, C0745Gx gx, Qga<EK> qga, Executor executor) {
        return new C0635Cr(ysVar, context, bs, view, onVar, vsVar, sz, gx, qga, executor);
    }

    public final /* synthetic */ Object get() {
        return a(this.f6773a.get(), this.f6774b.get(), this.f6775c.get(), this.f6776d.get(), this.f6777e.get(), this.f6778f.get(), this.f6779g.get(), this.f6780h.get(), Yga.b(this.i), this.j.get());
    }
}
