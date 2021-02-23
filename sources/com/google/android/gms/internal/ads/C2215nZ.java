package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nZ  reason: case insensitive filesystem */
final class C2215nZ implements Runnable {
    C2215nZ() {
    }

    public final void run() {
        try {
            IX.u.a();
            IX.u.b();
        } catch (Exception e2) {
            IX.w.a(2001, -1, e2);
        }
    }
}
