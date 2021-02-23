package com.google.android.gms.internal.ads;

import android.view.View;

final class Ona implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ View f8147a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Lna f8148b;

    Ona(Lna lna, View view) {
        this.f8148b = lna;
        this.f8147a = view;
    }

    public final void run() {
        this.f8148b.a(this.f8147a);
    }
}
