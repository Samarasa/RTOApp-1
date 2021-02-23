package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.f;

/* renamed from: com.google.android.gms.internal.ads.jo  reason: case insensitive filesystem */
final /* synthetic */ class C1960jo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1748go f11001a;

    C1960jo(C1748go goVar) {
        this.f11001a = goVar;
    }

    public final void run() {
        C1748go goVar = this.f11001a;
        goVar.f10582d.h();
        f a2 = goVar.f10582d.a();
        if (a2 != null) {
            a2.ac();
        }
    }
}
