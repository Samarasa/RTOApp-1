package com.google.android.gms.internal.ads;

final /* synthetic */ class UH implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C2313on f8877a;

    private UH(C2313on onVar) {
        this.f8877a = onVar;
    }

    static Runnable a(C2313on onVar) {
        return new UH(onVar);
    }

    public final void run() {
        this.f8877a.y();
    }
}
