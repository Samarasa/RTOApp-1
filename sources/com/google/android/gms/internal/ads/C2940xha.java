package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xha  reason: case insensitive filesystem */
final class C2940xha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f12800a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f12801b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C2869wha f12802c;

    C2940xha(C2869wha wha, int i, boolean z) {
        this.f12802c = wha;
        this.f12800a = i;
        this.f12801b = z;
    }

    public final void run() {
        C1766hB b2 = this.f12802c.b(this.f12800a, this.f12801b);
        C1766hB unused = this.f12802c.k = b2;
        if (C2869wha.b(this.f12800a, b2)) {
            this.f12802c.a(this.f12800a + 1, this.f12801b);
        }
    }
}
