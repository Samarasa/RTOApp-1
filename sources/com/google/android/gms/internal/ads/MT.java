package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C1963jpa;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

final class MT implements JT {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<WT, KT> f7846a;

    /* renamed from: b  reason: collision with root package name */
    private QT f7847b;

    /* renamed from: c  reason: collision with root package name */
    private OT f7848c = new OT();

    public MT(QT qt) {
        this.f7846a = new ConcurrentHashMap<>(qt.f8346h);
        this.f7847b = qt;
    }

    private final void a(TT<?> tt, C2139mU mUVar) {
        if (tt != null) {
            C1963jpa.c o = C1963jpa.o();
            C1963jpa.a.C0081a o2 = C1963jpa.a.o();
            o2.a(C1963jpa.b.IN_MEMORY);
            C1963jpa.d.a o3 = C1963jpa.d.o();
            o3.a(mUVar.f11311a);
            o3.a(mUVar.f11312b);
            o2.a(o3);
            o.a(o2);
            tt.f8779a.c().c((C1963jpa) o.k());
        }
        b();
    }

    private final void b() {
        if (QT.g()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f7847b.f8344f);
            sb.append(" PoolCollection");
            sb.append(this.f7848c.g());
            int i = 0;
            for (Map.Entry next : this.f7846a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(next.getValue());
                sb.append("#");
                sb.append(((WT) next.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((KT) next.getValue()).b(); i2++) {
                    sb.append("[O]");
                }
                for (int b2 = ((KT) next.getValue()).b(); b2 < this.f7847b.f8346h; b2++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((KT) next.getValue()).f());
                sb.append("\n");
            }
            while (i < this.f7847b.f8345g) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            C1018Rk.a(sb.toString());
        }
    }

    public final QT a() {
        return this.f7847b;
    }

    public final synchronized TT<?> a(WT wt) {
        TT<?> tt;
        KT kt = this.f7846a.get(wt);
        tt = null;
        if (kt != null) {
            tt = kt.c();
            if (tt == null) {
                this.f7848c.b();
            }
            a(tt, kt.g());
        } else {
            this.f7848c.a();
            a((TT<?>) null, (C2139mU) null);
        }
        return tt;
    }

    @Deprecated
    public final WT a(C2249nqa nqa, String str, C3100zqa zqa) {
        return new VT(nqa, str, new C3083zi(this.f7847b.f8342d).a().o, this.f7847b.j, zqa);
    }

    public final synchronized boolean a(WT wt, TT<?> tt) {
        boolean a2;
        ConcurrentHashMap<WT, KT> concurrentHashMap;
        KT kt = this.f7846a.get(wt);
        tt.f8782d = p.j().a();
        if (kt == null) {
            kt = new KT(this.f7847b.f8346h, this.f7847b.i * 1000);
            if (this.f7846a.size() == this.f7847b.f8345g) {
                int i = LT.f7676a[this.f7847b.l - 1];
                long j = Long.MAX_VALUE;
                WT wt2 = null;
                if (i == 1) {
                    for (Map.Entry next : this.f7846a.entrySet()) {
                        if (((KT) next.getValue()).a() < j) {
                            j = ((KT) next.getValue()).a();
                            wt2 = (WT) next.getKey();
                        }
                    }
                    if (wt2 != null) {
                        concurrentHashMap = this.f7846a;
                    }
                    this.f7848c.d();
                } else if (i != 2) {
                    if (i == 3) {
                        int i2 = Integer.MAX_VALUE;
                        for (Map.Entry next2 : this.f7846a.entrySet()) {
                            if (((KT) next2.getValue()).e() < i2) {
                                i2 = ((KT) next2.getValue()).e();
                                wt2 = (WT) next2.getKey();
                            }
                        }
                        if (wt2 != null) {
                            concurrentHashMap = this.f7846a;
                        }
                    }
                    this.f7848c.d();
                } else {
                    for (Map.Entry next3 : this.f7846a.entrySet()) {
                        if (((KT) next3.getValue()).d() < j) {
                            j = ((KT) next3.getValue()).d();
                            wt2 = (WT) next3.getKey();
                        }
                    }
                    if (wt2 != null) {
                        concurrentHashMap = this.f7846a;
                    }
                    this.f7848c.d();
                }
                concurrentHashMap.remove(wt2);
                this.f7848c.d();
            }
            this.f7846a.put(wt, kt);
            this.f7848c.c();
        }
        a2 = kt.a(tt);
        this.f7848c.e();
        NT f2 = this.f7848c.f();
        C2139mU g2 = kt.g();
        if (tt != null) {
            C1963jpa.c o = C1963jpa.o();
            C1963jpa.a.C0081a o2 = C1963jpa.a.o();
            o2.a(C1963jpa.b.IN_MEMORY);
            C1963jpa.e.a o3 = C1963jpa.e.o();
            o3.a(f2.f7967a);
            o3.b(f2.f7968b);
            o3.a(g2.f11312b);
            o2.a(o3);
            o.a(o2);
            tt.f8779a.c().b((C1963jpa) ((C2934xea) o.k()));
        }
        b();
        return a2;
    }

    public final synchronized boolean b(WT wt) {
        KT kt = this.f7846a.get(wt);
        if (kt != null) {
            return kt.b() < this.f7847b.f8346h;
        }
        return true;
    }
}
