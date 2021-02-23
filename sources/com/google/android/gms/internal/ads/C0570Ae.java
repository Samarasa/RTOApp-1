package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.oa;

/* renamed from: com.google.android.gms.internal.ads.Ae  reason: case insensitive filesystem */
final /* synthetic */ class C0570Ae implements C2082le {

    /* renamed from: a  reason: collision with root package name */
    private final C2862we f6142a;

    /* renamed from: b  reason: collision with root package name */
    private final C0908Ne f6143b;

    /* renamed from: c  reason: collision with root package name */
    private final C1870ie f6144c;

    C0570Ae(C2862we weVar, C0908Ne ne, C1870ie ieVar) {
        this.f6142a = weVar;
        this.f6143b = ne;
        this.f6144c = ieVar;
    }

    public final void a() {
        oa.f5628a.postDelayed(new C3075ze(this.f6142a, this.f6143b, this.f6144c), (long) C0752He.f7167b);
    }
}
