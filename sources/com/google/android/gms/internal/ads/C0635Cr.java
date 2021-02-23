package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import c.b.b.b.c.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Cr  reason: case insensitive filesystem */
final class C0635Cr extends C0583Ar {

    /* renamed from: h  reason: collision with root package name */
    private final Context f6484h;
    private final View i;
    private final C2313on j;
    private final BS k;
    private final C2819vs l;
    private final C1059Sz m;
    private final C0745Gx n;
    private final Qga<EK> o;
    private final Executor p;
    private C2462qqa q;

    C0635Cr(C3032ys ysVar, Context context, BS bs, View view, C2313on onVar, C2819vs vsVar, C1059Sz sz, C0745Gx gx, Qga<EK> qga, Executor executor) {
        super(ysVar);
        this.f6484h = context;
        this.i = view;
        this.j = onVar;
        this.k = bs;
        this.l = vsVar;
        this.m = sz;
        this.n = gx;
        this.o = qga;
        this.p = executor;
    }

    public final void a(ViewGroup viewGroup, C2462qqa qqa) {
        C2313on onVar;
        if (viewGroup != null && (onVar = this.j) != null) {
            onVar.a(C1819ho.a(qqa));
            viewGroup.setMinimumHeight(qqa.f11916c);
            viewGroup.setMinimumWidth(qqa.f11919f);
            this.q = qqa;
        }
    }

    public final void b() {
        this.p.execute(new C0609Br(this));
        super.b();
    }

    public final Sra g() {
        try {
            return this.l.getVideoController();
        } catch (WS unused) {
            return null;
        }
    }

    public final BS h() {
        boolean z;
        C2462qqa qqa = this.q;
        if (qqa != null) {
            return XS.a(qqa);
        }
        C2988yS ySVar = this.f13129b;
        if (ySVar.X) {
            Iterator<String> it = ySVar.f12914a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("FirstParty")) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return new BS(this.i.getWidth(), this.i.getHeight(), false);
            }
        }
        return XS.a(this.f13129b.q, this.k);
    }

    public final View i() {
        return this.i;
    }

    public final BS j() {
        return this.k;
    }

    public final int k() {
        if (((Boolean) Qqa.e().a(F.f0if)).booleanValue() && this.f13129b.ca) {
            if (!((Boolean) Qqa.e().a(F.jf)).booleanValue()) {
                return 0;
            }
        }
        return this.f13128a.f8088b.f7844b.f6548c;
    }

    public final void l() {
        this.n.X();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        if (this.m.d() != null) {
            try {
                this.m.d().a(this.o.get(), b.a(this.f6484h));
            } catch (RemoteException e2) {
                C1018Rk.b("RemoteException when notifyAdLoad is called", e2);
            }
        }
    }
}
