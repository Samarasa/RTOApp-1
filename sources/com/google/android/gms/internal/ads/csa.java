package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import c.b.b.b.c.b;
import com.google.android.gms.ads.b.a;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.r;
import com.google.android.gms.ads.u;
import com.google.android.gms.ads.v;
import com.google.android.gms.ads.w;
import java.util.concurrent.atomic.AtomicBoolean;

public final class csa {

    /* renamed from: a  reason: collision with root package name */
    private final C0701Ff f10094a;

    /* renamed from: b  reason: collision with root package name */
    private final C2320oqa f10095b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f10096c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final v f10097d;

    /* renamed from: e  reason: collision with root package name */
    private final Pqa f10098e;

    /* renamed from: f  reason: collision with root package name */
    private C1540dqa f10099f;

    /* renamed from: g  reason: collision with root package name */
    private c f10100g;

    /* renamed from: h  reason: collision with root package name */
    private f[] f10101h;
    private a i;
    private C1755gra j;
    private com.google.android.gms.ads.b.c k;
    private w l;
    private String m;
    private ViewGroup n;
    private int o;
    private boolean p;
    private r q;

    public csa(ViewGroup viewGroup, int i2) {
        this(viewGroup, (AttributeSet) null, false, C2320oqa.f11645a, i2);
    }

    private csa(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C2320oqa oqa, int i2) {
        this(viewGroup, attributeSet, z, oqa, (C1755gra) null, i2);
    }

    private csa(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, C2320oqa oqa, C1755gra gra, int i2) {
        C2462qqa qqa;
        this.f10094a = new C0701Ff();
        this.f10097d = new v();
        this.f10098e = new bsa(this);
        this.n = viewGroup;
        this.f10095b = oqa;
        this.j = null;
        this.f10096c = new AtomicBoolean(false);
        this.o = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                Bqa bqa = new Bqa(context, attributeSet);
                this.f10101h = bqa.a(z);
                this.m = bqa.a();
                if (viewGroup.isInEditMode()) {
                    C0758Hk a2 = Qqa.a();
                    f fVar = this.f10101h[0];
                    int i3 = this.o;
                    if (fVar.equals(f.i)) {
                        qqa = C2462qqa.j();
                    } else {
                        C2462qqa qqa2 = new C2462qqa(context, fVar);
                        qqa2.j = a(i3);
                        qqa = qqa2;
                    }
                    a2.a(viewGroup, qqa, "Ads by Google");
                }
            } catch (IllegalArgumentException e2) {
                Qqa.a().a(viewGroup, new C2462qqa(context, f.f5383a), e2.getMessage(), e2.getMessage());
            }
        }
    }

    private static C2462qqa a(Context context, f[] fVarArr, int i2) {
        for (f equals : fVarArr) {
            if (equals.equals(f.i)) {
                return C2462qqa.j();
            }
        }
        C2462qqa qqa = new C2462qqa(context, fVarArr);
        qqa.j = a(i2);
        return qqa;
    }

    private static boolean a(int i2) {
        return i2 == 1;
    }

    public final void a() {
        try {
            if (this.j != null) {
                this.j.destroy();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(a aVar) {
        try {
            this.i = aVar;
            if (this.j != null) {
                this.j.a((C2322ora) aVar != null ? new C2887wqa(aVar) : null);
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(com.google.android.gms.ads.b.c cVar) {
        this.k = cVar;
        try {
            if (this.j != null) {
                this.j.a((C1508da) cVar != null ? new C1578ea(cVar) : null);
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(c cVar) {
        this.f10100g = cVar;
        this.f10098e.a(cVar);
    }

    public final void a(r rVar) {
        try {
            this.q = rVar;
            if (this.j != null) {
                this.j.a((Mra) new C1622f(rVar));
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#008 Must be called on the main UI thread.", e2);
        }
    }

    public final void a(w wVar) {
        this.l = wVar;
        try {
            if (this.j != null) {
                this.j.a(wVar == null ? null : new C1905j(wVar));
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(asa asa) {
        Object a2;
        try {
            if (this.j == null) {
                if ((this.f10101h == null || this.m == null) && this.j == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.n.getContext();
                C2462qqa a3 = a(context, this.f10101h, this.o);
                if ("search_v2".equals(a3.f11914a)) {
                    a2 = new Jqa(Qqa.b(), context, a3, this.m).a(context, false);
                } else {
                    a2 = new Dqa(Qqa.b(), context, a3, this.m, this.f10094a).a(context, false);
                }
                this.j = (C1755gra) a2;
                this.j.b((Tqa) new C1965jqa(this.f10098e));
                if (this.f10099f != null) {
                    this.j.a((Sqa) new C1399bqa(this.f10099f));
                }
                if (this.i != null) {
                    this.j.a((C2322ora) new C2887wqa(this.i));
                }
                if (this.k != null) {
                    this.j.a((C1508da) new C1578ea(this.k));
                }
                if (this.l != null) {
                    this.j.a(new C1905j(this.l));
                }
                this.j.a((Mra) new C1622f(this.q));
                this.j.f(this.p);
                try {
                    c.b.b.b.c.a Ca = this.j.Ca();
                    if (Ca != null) {
                        this.n.addView((View) b.Q(Ca));
                    }
                } catch (RemoteException e2) {
                    C1018Rk.d("#007 Could not call remote method.", e2);
                }
            }
            if (this.j.a(C2320oqa.a(this.n.getContext(), asa))) {
                this.f10094a.a(asa.n());
            }
        } catch (RemoteException e3) {
            C1018Rk.d("#007 Could not call remote method.", e3);
        }
    }

    public final void a(C1540dqa dqa) {
        try {
            this.f10099f = dqa;
            if (this.j != null) {
                this.j.a((Sqa) dqa != null ? new C1399bqa(dqa) : null);
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(String str) {
        if (this.m == null) {
            this.m = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void a(boolean z) {
        this.p = z;
        try {
            if (this.j != null) {
                this.j.f(this.p);
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(f... fVarArr) {
        if (this.f10101h == null) {
            b(fVarArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final c b() {
        return this.f10100g;
    }

    public final void b(f... fVarArr) {
        this.f10101h = fVarArr;
        try {
            if (this.j != null) {
                this.j.a(a(this.n.getContext(), this.f10101h, this.o));
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
        this.n.requestLayout();
    }

    public final f c() {
        C2462qqa Qb;
        try {
            if (!(this.j == null || (Qb = this.j.Qb()) == null)) {
                return Qb.k();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
        f[] fVarArr = this.f10101h;
        if (fVarArr != null) {
            return fVarArr[0];
        }
        return null;
    }

    public final f[] d() {
        return this.f10101h;
    }

    public final String e() {
        C1755gra gra;
        if (this.m == null && (gra = this.j) != null) {
            try {
                this.m = gra.Pb();
            } catch (RemoteException e2) {
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        }
        return this.m;
    }

    public final a f() {
        return this.i;
    }

    public final String g() {
        try {
            if (this.j != null) {
                return this.j.va();
            }
            return null;
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
            return null;
        }
    }

    public final com.google.android.gms.ads.b.c h() {
        return this.k;
    }

    public final u i() {
        Nra nra = null;
        try {
            if (this.j != null) {
                nra = this.j.A();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
        return u.a(nra);
    }

    public final v j() {
        return this.f10097d;
    }

    public final w k() {
        return this.l;
    }

    public final void l() {
        try {
            if (this.j != null) {
                this.j.pause();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void m() {
        try {
            if (this.j != null) {
                this.j.X();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final Sra n() {
        C1755gra gra = this.j;
        if (gra == null) {
            return null;
        }
        try {
            return gra.getVideoController();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
