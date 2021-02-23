package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.nq  reason: case insensitive filesystem */
public final class C2248nq implements C0950Ou {

    /* renamed from: a  reason: collision with root package name */
    private final C1925jT f11533a;

    public C2248nq(C1925jT jTVar) {
        this.f11533a = jTVar;
    }

    public final void b(Context context) {
        try {
            this.f11533a.f();
            if (context != null) {
                this.f11533a.a(context);
            }
        } catch (WS e2) {
            C1018Rk.c("Cannot invoke onResume for the mediation adapter.", e2);
        }
    }

    public final void c(Context context) {
        try {
            this.f11533a.a();
        } catch (WS e2) {
            C1018Rk.c("Cannot invoke onDestroy for the mediation adapter.", e2);
        }
    }

    public final void d(Context context) {
        try {
            this.f11533a.e();
        } catch (WS e2) {
            C1018Rk.c("Cannot invoke onPause for the mediation adapter.", e2);
        }
    }
}
