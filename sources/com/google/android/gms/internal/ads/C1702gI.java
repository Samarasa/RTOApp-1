package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.gI  reason: case insensitive filesystem */
public final class C1702gI implements Xga<C1631fI> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Context> f10513a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<Executor> f10514b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C0616By> f10515c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C2846wS> f10516d;

    public C1702gI(C1876iha<Context> iha, C1876iha<Executor> iha2, C1876iha<C0616By> iha3, C1876iha<C2846wS> iha4) {
        this.f10513a = iha;
        this.f10514b = iha2;
        this.f10515c = iha3;
        this.f10516d = iha4;
    }

    public final /* synthetic */ Object get() {
        return new C1631fI(this.f10513a.get(), this.f10514b.get(), this.f10515c.get(), this.f10516d.get());
    }
}
