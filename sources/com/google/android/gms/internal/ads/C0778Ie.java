package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.fa;

/* renamed from: com.google.android.gms.internal.ads.Ie  reason: case insensitive filesystem */
final class C0778Ie implements C1883il {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0908Ne f7309a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2862we f7310b;

    C0778Ie(C2862we weVar, C0908Ne ne) {
        this.f7310b = weVar;
        this.f7309a = ne;
    }

    public final void run() {
        synchronized (this.f7310b.f12639a) {
            int unused = this.f7310b.f12646h = 1;
            fa.f("Failed loading new engine. Marking new engine destroyable.");
            this.f7309a.e();
        }
    }
}
