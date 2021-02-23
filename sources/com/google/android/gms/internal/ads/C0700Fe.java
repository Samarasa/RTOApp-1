package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.fa;

/* renamed from: com.google.android.gms.internal.ads.Fe  reason: case insensitive filesystem */
final class C0700Fe implements C2025kl<C1870ie> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0908Ne f6875a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2862we f6876b;

    C0700Fe(C2862we weVar, C0908Ne ne) {
        this.f6876b = weVar;
        this.f6875a = ne;
    }

    public final /* synthetic */ void a(Object obj) {
        C1870ie ieVar = (C1870ie) obj;
        synchronized (this.f6876b.f12639a) {
            int unused = this.f6876b.f12646h = 0;
            if (!(this.f6876b.f12645g == null || this.f6875a == this.f6876b.f12645g)) {
                fa.f("New JS engine is loaded, marking previous one as destroyable.");
                this.f6876b.f12645g.e();
            }
            C0908Ne unused2 = this.f6876b.f12645g = this.f6875a;
        }
    }
}
