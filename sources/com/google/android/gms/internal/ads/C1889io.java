package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.io  reason: case insensitive filesystem */
final class C1889io implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ View f10846a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0835Kj f10847b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f10848c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C1748go f10849d;

    C1889io(C1748go goVar, View view, C0835Kj kj, int i) {
        this.f10849d = goVar;
        this.f10846a = view;
        this.f10847b = kj;
        this.f10848c = i;
    }

    public final void run() {
        this.f10849d.a(this.f10846a, this.f10847b, this.f10848c - 1);
    }
}
