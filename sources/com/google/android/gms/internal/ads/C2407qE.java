package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.qE  reason: case insensitive filesystem */
public final class C2407qE implements Xga<C1981kE> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<Executor> f11816a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1122Vk> f11817b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Context> f11818c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C1200Yk> f11819d;

    public C2407qE(C1876iha<Executor> iha, C1876iha<C1122Vk> iha2, C1876iha<Context> iha3, C1876iha<C1200Yk> iha4) {
        this.f11816a = iha;
        this.f11817b = iha2;
        this.f11818c = iha3;
        this.f11819d = iha4;
    }

    public final /* synthetic */ Object get() {
        return new C1981kE(this.f11816a.get(), this.f11817b.get(), this.f11818c.get(), this.f11819d.get());
    }
}
