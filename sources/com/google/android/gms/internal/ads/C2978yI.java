package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yI  reason: case insensitive filesystem */
public final class C2978yI implements Xga<C2269oI> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f12890a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1200Yk> f12891b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<SS> f12892c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<Executor> f12893d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C0616By> f12894e;

    /* renamed from: f  reason: collision with root package name */
    private final C1876iha<DC> f12895f;

    public C2978yI(C1876iha<Context> iha, C1876iha<C1200Yk> iha2, C1876iha<SS> iha3, C1876iha<Executor> iha4, C1876iha<C0616By> iha5, C1876iha<DC> iha6) {
        this.f12890a = iha;
        this.f12891b = iha2;
        this.f12892c = iha3;
        this.f12893d = iha4;
        this.f12894e = iha5;
        this.f12895f = iha6;
    }

    public final /* synthetic */ Object get() {
        return new C2269oI(this.f12890a.get(), this.f12891b.get(), this.f12892c.get(), this.f12893d.get(), this.f12894e.get(), this.f12895f.get());
    }
}
