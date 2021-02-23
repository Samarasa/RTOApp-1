package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fY  reason: case insensitive filesystem */
final class C1647fY implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ LY f10411a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f10412b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C1718gY f10413c;

    C1647fY(C1718gY gYVar, LY ly, int i) {
        this.f10413c = gYVar;
        this.f10411a = ly;
        this.f10412b = i;
    }

    public final void run() {
        try {
            if (this.f10411a.isCancelled()) {
                C2638tX unused = this.f10413c.m = null;
                this.f10413c.cancel(false);
            } else {
                this.f10413c.a(this.f10412b, this.f10411a);
            }
        } finally {
            this.f10413c.a((C2638tX) null);
        }
    }
}
