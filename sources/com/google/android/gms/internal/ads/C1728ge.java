package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ge  reason: case insensitive filesystem */
final /* synthetic */ class C1728ge implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1799he f10554a;

    /* renamed from: b  reason: collision with root package name */
    private final C1088Uc f10555b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f10556c;

    C1728ge(C1799he heVar, C1088Uc uc, Map map) {
        this.f10554a = heVar;
        this.f10555b = uc;
        this.f10556c = map;
    }

    public final void run() {
        this.f10554a.a(this.f10555b, this.f10556c);
    }
}
