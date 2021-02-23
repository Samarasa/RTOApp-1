package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gL  reason: case insensitive filesystem */
final class C1705gL implements C1917jL<C3103zs> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1493dL f10527a;

    C1705gL(C1493dL dLVar) {
        this.f10527a = dLVar;
    }

    public final void a() {
        synchronized (this.f10527a) {
            boolean unused = this.f10527a.f10138d = false;
        }
    }

    public final /* synthetic */ void a(Object obj) {
        C3103zs zsVar = (C3103zs) obj;
        synchronized (this.f10527a) {
            boolean unused = this.f10527a.f10138d = false;
            Nra unused2 = this.f10527a.f10137c = zsVar.d();
            zsVar.b();
        }
    }
}
