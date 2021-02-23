package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Al  reason: case insensitive filesystem */
final class C0577Al implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f6180a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f6181b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C2734ul f6182c;

    C0577Al(C2734ul ulVar, int i, int i2) {
        this.f6182c = ulVar;
        this.f6180a = i;
        this.f6181b = i2;
    }

    public final void run() {
        if (this.f6182c.s != null) {
            this.f6182c.s.a(this.f6180a, this.f6181b);
        }
    }
}
