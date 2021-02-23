package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Je  reason: case insensitive filesystem */
public final class C0804Je extends C2238nl<C1090Ue> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f7447c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C0908Ne f7448d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7449e;

    public C0804Je(C0908Ne ne) {
        this.f7448d = ne;
    }

    public final void c() {
        synchronized (this.f7447c) {
            if (!this.f7449e) {
                this.f7449e = true;
                a(new C0882Me(this), new C2096ll());
                a(new C0856Le(this), new C0934Oe(this));
            }
        }
    }
}
