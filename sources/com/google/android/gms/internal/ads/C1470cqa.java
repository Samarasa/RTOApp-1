package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cqa  reason: case insensitive filesystem */
final class C1470cqa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1339b f10090a;

    /* renamed from: b  reason: collision with root package name */
    private final C3073zd f10091b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f10092c;

    public C1470cqa(C1339b bVar, C3073zd zdVar, Runnable runnable) {
        this.f10090a = bVar;
        this.f10091b = zdVar;
        this.f10092c = runnable;
    }

    public final void run() {
        this.f10090a.m();
        if (this.f10091b.a()) {
            this.f10090a.a(this.f10091b.f13078a);
        } else {
            this.f10090a.a(this.f10091b.f13080c);
        }
        if (this.f10091b.f13081d) {
            this.f10090a.a("intermediate-response");
        } else {
            this.f10090a.b("done");
        }
        Runnable runnable = this.f10092c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
