package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

final class HK implements AY<C0583Ar> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1181Xr f7132a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ IK f7133b;

    HK(IK ik, C1181Xr xr) {
        this.f7133b = ik;
        this.f7132a = xr;
    }

    public final /* synthetic */ void a(Object obj) {
        C0583Ar ar = (C0583Ar) obj;
        synchronized (this.f7133b) {
            LY unused = this.f7133b.k = null;
            if (this.f7133b.j != null) {
                this.f7133b.j.a();
            }
            C0583Ar unused2 = this.f7133b.j = ar;
            this.f7133b.f7262c.removeAllViews();
            if (ar.i() != null) {
                ViewParent parent = ar.i().getParent();
                if (parent instanceof ViewGroup) {
                    String o = this.f7133b.o();
                    StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(o);
                    sb.append(" already has a parent view. Removing its old parent.");
                    C1018Rk.d(sb.toString());
                    ((ViewGroup) parent).removeView(ar.i());
                }
            }
            if (((Boolean) Qqa.e().a(F.tf)).booleanValue()) {
                C2256nw f2 = ar.f();
                f2.a(this.f7133b.f7263d);
                f2.a(this.f7133b.f7264e);
            }
            this.f7133b.f7262c.addView(ar.i());
            ar.b();
            if (((Boolean) Qqa.e().a(F.tf)).booleanValue()) {
                Executor a2 = this.f7133b.f7260a.a();
                MK d2 = this.f7133b.f7263d;
                d2.getClass();
                a2.execute(KK.a(d2));
            }
            this.f7133b.f7265f.b(ar.k());
        }
    }

    public final void a(Throwable th) {
        C1824hqa a2 = this.f7132a.a().a(th);
        synchronized (this.f7133b) {
            LY unused = this.f7133b.k = null;
            this.f7132a.b().a(a2);
            if (((Boolean) Qqa.e().a(F.tf)).booleanValue()) {
                this.f7133b.f7260a.a().execute(new JK(this, a2));
            }
            this.f7133b.f7265f.b(60);
            C1713gT.a(a2.f10744a, th, "BannerAdManagerShim.onFailure");
        }
    }
}
