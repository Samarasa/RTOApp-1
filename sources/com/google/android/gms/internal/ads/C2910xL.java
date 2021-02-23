package com.google.android.gms.internal.ads;

import c.b.b.b.c.a;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.xL  reason: case insensitive filesystem */
final /* synthetic */ class C2910xL implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2626tL f12750a;

    /* renamed from: b  reason: collision with root package name */
    private final List f12751b;

    /* renamed from: c  reason: collision with root package name */
    private final a f12752c;

    C2910xL(C2626tL tLVar, List list, a aVar) {
        this.f12750a = tLVar;
        this.f12751b = list;
        this.f12752c = aVar;
    }

    public final Object call() {
        return this.f12750a.a(this.f12751b, this.f12752c);
    }
}
