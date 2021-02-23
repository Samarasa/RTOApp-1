package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yl  reason: case insensitive filesystem */
final class C3018yl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f12967a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f12968b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C2734ul f12969c;

    C3018yl(C2734ul ulVar, String str, String str2) {
        this.f12969c = ulVar;
        this.f12967a = str;
        this.f12968b = str2;
    }

    public final void run() {
        if (this.f12969c.s != null) {
            this.f12969c.s.a(this.f12967a, this.f12968b);
        }
    }
}
