package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import c.b.b.b.c.b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.gs  reason: case insensitive filesystem */
public final class C1756gs extends C0583Ar {

    /* renamed from: h  reason: collision with root package name */
    private final C1653fc f10597h;
    private final Runnable i;
    private final Executor j;

    public C1756gs(C3032ys ysVar, C1653fc fcVar, Runnable runnable, Executor executor) {
        super(ysVar);
        this.f10597h = fcVar;
        this.i = runnable;
        this.j = executor;
    }

    public final void a(ViewGroup viewGroup, C2462qqa qqa) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Runnable runnable) {
        try {
            if (!this.f10597h.I(b.a(runnable))) {
                runnable.run();
            }
        } catch (RemoteException unused) {
            runnable.run();
        }
    }

    public final void b() {
        this.j.execute(new C1897is(this, new C1685fs(new AtomicReference(this.i))));
    }

    public final Sra g() {
        return null;
    }

    public final BS h() {
        return null;
    }

    public final View i() {
        return null;
    }

    public final BS j() {
        return null;
    }

    public final int k() {
        return 0;
    }

    public final void l() {
    }
}
