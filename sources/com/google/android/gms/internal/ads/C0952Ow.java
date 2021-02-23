package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;

/* renamed from: com.google.android.gms.internal.ads.Ow  reason: case insensitive filesystem */
final /* synthetic */ class C0952Ow implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0926Nw f8168a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8169b;

    C0952Ow(C0926Nw nw, Object obj) {
        this.f8168a = nw;
        this.f8169b = obj;
    }

    public final void run() {
        try {
            this.f8168a.a(this.f8169b);
        } catch (Throwable th) {
            p.g().b(th, "EventEmitter.notify");
            fa.e("Event emitter exception.", th);
        }
    }
}
