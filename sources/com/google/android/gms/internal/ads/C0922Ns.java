package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ns  reason: case insensitive filesystem */
final class C0922Ns implements AY<C0714Fs> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AY f8035a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0740Gs f8036b;

    C0922Ns(C0740Gs gs, AY ay) {
        this.f8036b = gs;
        this.f8035a = ay;
    }

    public final /* synthetic */ void a(Object obj) {
        this.f8036b.a(((C0714Fs) obj).f6963a, this.f8035a);
    }

    public final void a(Throwable th) {
        this.f8035a.a(th);
        this.f8036b.c();
    }
}
