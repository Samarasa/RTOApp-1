package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;

/* renamed from: com.google.android.gms.internal.ads.je  reason: case insensitive filesystem */
final /* synthetic */ class C1940je implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f10961a;

    C1940je(String str) {
        this.f10961a = str;
    }

    public final void run() {
        p.g().c().b(this.f10961a.substring(1));
    }
}
