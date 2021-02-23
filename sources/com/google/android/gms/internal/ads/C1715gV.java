package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gV  reason: case insensitive filesystem */
final class C1715gV implements VV {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2353pV f10543a;

    C1715gV(C2353pV pVVar) {
        this.f10543a = pVVar;
    }

    public final void a(int i, long j) {
        this.f10543a.a(i, System.currentTimeMillis() - j);
    }

    public final void a(int i, long j, String str) {
        this.f10543a.a(i, System.currentTimeMillis() - j, str);
    }
}
