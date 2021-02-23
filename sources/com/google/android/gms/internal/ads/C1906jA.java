package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* renamed from: com.google.android.gms.internal.ads.jA  reason: case insensitive filesystem */
final /* synthetic */ class C1906jA implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1765hA f10877a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f10878b;

    C1906jA(C1765hA hAVar, ViewGroup viewGroup) {
        this.f10877a = hAVar;
        this.f10878b = viewGroup;
    }

    public final void run() {
        this.f10877a.b(this.f10878b);
    }
}
