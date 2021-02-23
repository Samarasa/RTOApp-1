package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.f;

/* renamed from: com.google.android.gms.internal.ads.qn  reason: case insensitive filesystem */
final /* synthetic */ class C2455qn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C2242nn f11892a;

    C2455qn(C2242nn nnVar) {
        this.f11892a = nnVar;
    }

    public final void run() {
        C2242nn nnVar = this.f11892a;
        nnVar.f11514a.h();
        f a2 = nnVar.f11514a.a();
        if (a2 != null) {
            a2.ac();
        }
    }
}
