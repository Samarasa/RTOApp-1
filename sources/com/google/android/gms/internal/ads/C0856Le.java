package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.fa;

/* renamed from: com.google.android.gms.internal.ads.Le  reason: case insensitive filesystem */
final class C0856Le implements C2025kl<C1090Ue> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0804Je f7695a;

    C0856Le(C0804Je je) {
        this.f7695a = je;
    }

    public final /* synthetic */ void a(Object obj) {
        C1090Ue ue = (C1090Ue) obj;
        fa.f("Releasing engine reference.");
        this.f7695a.f7448d.d();
    }
}
