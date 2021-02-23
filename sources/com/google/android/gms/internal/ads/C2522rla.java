package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rla  reason: case insensitive filesystem */
final class C2522rla implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2593sla f12026a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2168mla f12027b;

    C2522rla(C2168mla mla, C2593sla sla) {
        this.f12027b = mla;
        this.f12026a = sla;
    }

    public final void run() {
        this.f12026a.a();
        int size = this.f12027b.p.size();
        for (int i = 0; i < size; i++) {
            ((Hla) this.f12027b.p.valueAt(i)).a();
        }
    }
}
