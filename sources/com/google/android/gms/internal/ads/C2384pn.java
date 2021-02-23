package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;

/* renamed from: com.google.android.gms.internal.ads.pn  reason: case insensitive filesystem */
final /* synthetic */ class C2384pn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f11765a;

    C2384pn(String str) {
        this.f11765a = str;
    }

    public final void run() {
        p.g().c().b(this.f11765a.substring(1));
    }
}
