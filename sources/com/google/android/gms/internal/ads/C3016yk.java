package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.C0493a;

/* renamed from: com.google.android.gms.internal.ads.yk  reason: case insensitive filesystem */
final class C3016yk extends C0493a {

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C2874wk f12961d;

    C3016yk(C2874wk wkVar) {
        this.f12961d = wkVar;
    }

    public final void a() {
        J j = new J(this.f12961d.f12673e, this.f12961d.f12674f.f9456a);
        synchronized (this.f12961d.f12669a) {
            try {
                p.l();
                K.a(this.f12961d.f12675g, j);
            } catch (IllegalArgumentException e2) {
                C1018Rk.c("Cannot config CSI reporter.", e2);
            }
        }
    }
}
