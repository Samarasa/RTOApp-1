package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zma  reason: case insensitive filesystem */
final class C3092zma implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1339b f13110a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Yka f13111b;

    C3092zma(Yka yka, C1339b bVar) {
        this.f13111b = yka;
        this.f13110a = bVar;
    }

    public final void run() {
        try {
            this.f13111b.f9463c.put(this.f13110a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
