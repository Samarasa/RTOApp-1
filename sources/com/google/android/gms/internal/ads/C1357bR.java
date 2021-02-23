package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.fa;

/* renamed from: com.google.android.gms.internal.ads.bR  reason: case insensitive filesystem */
final class C1357bR implements AY<Void> {
    C1357bR(XQ xq) {
    }

    public final /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        fa.f("Notification of cache hit successful.");
    }

    public final void a(Throwable th) {
        fa.f("Notification of cache hit failed.");
    }
}
