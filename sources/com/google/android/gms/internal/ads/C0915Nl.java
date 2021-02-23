package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Nl  reason: case insensitive filesystem */
final class C0915Nl implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0811Jl f8004a;

    C0915Nl(C0811Jl jl) {
        this.f8004a = jl;
    }

    public final void run() {
        this.f8004a.b("surfaceDestroyed", new String[0]);
    }
}
