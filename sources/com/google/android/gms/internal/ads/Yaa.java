package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Yaa extends C2934xea<Yaa, a> implements C2014kfa {
    private static volatile C2440qfa<Yaa> zzei;
    /* access modifiers changed from: private */
    public static final Yaa zzibj;
    private int zziaz;
    private C1369bba zzibh;
    private Tba zzibi;

    public static final class a extends C2934xea.a<Yaa, a> implements C2014kfa {
        private a() {
            super(Yaa.zzibj);
        }

        /* synthetic */ a(Xaa xaa) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Yaa) this.f12784b).b(i);
            return this;
        }

        public final a a(Tba tba) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Yaa) this.f12784b).a(tba);
            return this;
        }

        public final a a(C1369bba bba) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Yaa) this.f12784b).a(bba);
            return this;
        }
    }

    static {
        Yaa yaa = new Yaa();
        zzibj = yaa;
        C2934xea.a(Yaa.class, yaa);
    }

    private Yaa() {
    }

    public static Yaa a(Lda lda, C2012kea kea) {
        return (Yaa) C2934xea.a(zzibj, lda, kea);
    }

    /* access modifiers changed from: private */
    public final void a(Tba tba) {
        tba.getClass();
        this.zzibi = tba;
    }

    /* access modifiers changed from: private */
    public final void a(C1369bba bba) {
        bba.getClass();
        this.zzibh = bba;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zziaz = i;
    }

    public static a r() {
        return (a) zzibj.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Xaa.f9246a[i - 1]) {
            case 1:
                return new Yaa();
            case 2:
                return new a((Xaa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibj, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zziaz", "zzibh", "zzibi"});
            case 4:
                return zzibj;
            case 5:
                C2440qfa<Yaa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Yaa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibj);
                            zzei = qfa;
                        }
                    }
                }
                return qfa;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final int o() {
        return this.zziaz;
    }

    public final C1369bba p() {
        C1369bba bba = this.zzibh;
        return bba == null ? C1369bba.s() : bba;
    }

    public final Tba q() {
        Tba tba = this.zzibi;
        return tba == null ? Tba.s() : tba;
    }
}
