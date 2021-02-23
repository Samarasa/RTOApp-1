package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Fv  reason: case insensitive filesystem */
final class C0717Fv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<C0587Av> f6967a;

    private C0717Fv(C0587Av av) {
        this.f6967a = new WeakReference<>(av);
    }

    public final void run() {
        C0587Av av = (C0587Av) this.f6967a.get();
        if (av != null) {
            av.Y();
        }
    }
}
