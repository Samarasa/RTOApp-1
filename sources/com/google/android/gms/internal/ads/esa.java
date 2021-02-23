package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.b.e;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.h.a;
import com.google.android.gms.ads.h.d;
import com.google.android.gms.ads.r;

public final class esa {

    /* renamed from: a  reason: collision with root package name */
    private final C0701Ff f10327a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f10328b;

    /* renamed from: c  reason: collision with root package name */
    private final C2320oqa f10329c;

    /* renamed from: d  reason: collision with root package name */
    private c f10330d;

    /* renamed from: e  reason: collision with root package name */
    private C1540dqa f10331e;

    /* renamed from: f  reason: collision with root package name */
    private C1755gra f10332f;

    /* renamed from: g  reason: collision with root package name */
    private String f10333g;

    /* renamed from: h  reason: collision with root package name */
    private a f10334h;
    private com.google.android.gms.ads.b.a i;
    private com.google.android.gms.ads.b.c j;
    private d k;
    private boolean l;
    private boolean m;
    private r n;

    public esa(Context context) {
        this(context, C2320oqa.f11645a, (e) null);
    }

    private esa(Context context, C2320oqa oqa, e eVar) {
        this.f10327a = new C0701Ff();
        this.f10328b = context;
        this.f10329c = oqa;
    }

    private final void b(String str) {
        if (this.f10332f == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
            sb.append("The ad unit ID must be set on InterstitialAd before ");
            sb.append(str);
            sb.append(" is called.");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final Bundle a() {
        try {
            if (this.f10332f != null) {
                return this.f10332f.V();
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
        return new Bundle();
    }

    public final void a(c cVar) {
        try {
            this.f10330d = cVar;
            if (this.f10332f != null) {
                this.f10332f.b((Tqa) cVar != null ? new C1965jqa(cVar) : null);
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(a aVar) {
        try {
            this.f10334h = aVar;
            if (this.f10332f != null) {
                this.f10332f.a((C1967jra) aVar != null ? new C2036kqa(aVar) : null);
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(d dVar) {
        try {
            this.k = dVar;
            if (this.f10332f != null) {
                this.f10332f.a((C1146Wi) dVar != null ? new C1224Zi(dVar) : null);
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(asa asa) {
        try {
            if (this.f10332f == null) {
                if (this.f10333g == null) {
                    b("loadAd");
                }
                C2462qqa h2 = this.l ? C2462qqa.h() : new C2462qqa();
                Aqa b2 = Qqa.b();
                Context context = this.f10328b;
                this.f10332f = (C1755gra) new Iqa(b2, context, h2, this.f10333g, this.f10327a).a(context, false);
                if (this.f10330d != null) {
                    this.f10332f.b((Tqa) new C1965jqa(this.f10330d));
                }
                if (this.f10331e != null) {
                    this.f10332f.a((Sqa) new C1399bqa(this.f10331e));
                }
                if (this.f10334h != null) {
                    this.f10332f.a((C1967jra) new C2036kqa(this.f10334h));
                }
                if (this.i != null) {
                    this.f10332f.a((C2322ora) new C2887wqa(this.i));
                }
                if (this.j != null) {
                    this.f10332f.a((C1508da) new C1578ea(this.j));
                }
                if (this.k != null) {
                    this.f10332f.a((C1146Wi) new C1224Zi(this.k));
                }
                this.f10332f.a((Mra) new C1622f(this.n));
                this.f10332f.b(this.m);
            }
            if (this.f10332f.a(C2320oqa.a(this.f10328b, asa))) {
                this.f10327a.a(asa.n());
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(C1540dqa dqa) {
        try {
            this.f10331e = dqa;
            if (this.f10332f != null) {
                this.f10332f.a((Sqa) dqa != null ? new C1399bqa(dqa) : null);
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(String str) {
        if (this.f10333g == null) {
            this.f10333g = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    public final void a(boolean z) {
        try {
            this.m = z;
            if (this.f10332f != null) {
                this.f10332f.b(z);
            }
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void b(boolean z) {
        this.l = true;
    }

    public final boolean b() {
        try {
            if (this.f10332f == null) {
                return false;
            }
            return this.f10332f.t();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
            return false;
        }
    }

    public final void c() {
        try {
            b("show");
            this.f10332f.showInterstitial();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }
}
