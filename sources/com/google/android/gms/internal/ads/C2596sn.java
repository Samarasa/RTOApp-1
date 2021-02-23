package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.sn  reason: case insensitive filesystem */
final class C2596sn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ View f12130a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0835Kj f12131b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f12132c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C2242nn f12133d;

    C2596sn(C2242nn nnVar, View view, C0835Kj kj, int i) {
        this.f12133d = nnVar;
        this.f12130a = view;
        this.f12131b = kj;
        this.f12132c = i;
    }

    public final void run() {
        this.f12133d.a(this.f12130a, this.f12131b, this.f12132c - 1);
    }
}
