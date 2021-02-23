package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ml  reason: case insensitive filesystem */
final class C0889Ml implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f7893a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0811Jl f7894b;

    C0889Ml(C0811Jl jl, boolean z) {
        this.f7894b = jl;
        this.f7893a = z;
    }

    public final void run() {
        this.f7894b.b("windowVisibilityChanged", "isVisible", String.valueOf(this.f7893a));
    }
}
