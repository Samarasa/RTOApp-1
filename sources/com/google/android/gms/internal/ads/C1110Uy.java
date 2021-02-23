package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.C1538dpa;

/* renamed from: com.google.android.gms.internal.ads.Uy  reason: case insensitive filesystem */
public final class C1110Uy implements Xga<C1032Ry> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0939Oj> f8982a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Context> f8983b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1017Rj> f8984c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<View> f8985d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C1538dpa.a> f8986e;

    private C1110Uy(C1876iha<C0939Oj> iha, C1876iha<Context> iha2, C1876iha<C1017Rj> iha3, C1876iha<View> iha4, C1876iha<C1538dpa.a> iha5) {
        this.f8982a = iha;
        this.f8983b = iha2;
        this.f8984c = iha3;
        this.f8985d = iha4;
        this.f8986e = iha5;
    }

    public static C1110Uy a(C1876iha<C0939Oj> iha, C1876iha<Context> iha2, C1876iha<C1017Rj> iha3, C1876iha<View> iha4, C1876iha<C1538dpa.a> iha5) {
        return new C1110Uy(iha, iha2, iha3, iha4, iha5);
    }

    public final /* synthetic */ Object get() {
        return new C1032Ry(this.f8982a.get(), this.f8983b.get(), this.f8984c.get(), this.f8985d.get(), this.f8986e.get());
    }
}
