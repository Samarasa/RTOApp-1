package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Tba extends C2934xea<Tba, a> implements C2014kfa {
    private static volatile C2440qfa<Tba> zzei;
    /* access modifiers changed from: private */
    public static final Tba zzido;
    private int zziaz;
    private Lda zziba = Lda.f7691a;
    private Xba zzidn;

    public static final class a extends C2934xea.a<Tba, a> implements C2014kfa {
        private a() {
            super(Tba.zzido);
        }

        /* synthetic */ a(Sba sba) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Tba) this.f12784b).b(0);
            return this;
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Tba) this.f12784b).a(lda);
            return this;
        }

        public final a a(Xba xba) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Tba) this.f12784b).a(xba);
            return this;
        }
    }

    static {
        Tba tba = new Tba();
        zzido = tba;
        C2934xea.a(Tba.class, tba);
    }

    private Tba() {
    }

    public static Tba a(Lda lda, C2012kea kea) {
        return (Tba) C2934xea.a(zzido, lda, kea);
    }

    /* access modifiers changed from: private */
    public final void a(Lda lda) {
        lda.getClass();
        this.zziba = lda;
    }

    /* access modifiers changed from: private */
    public final void a(Xba xba) {
        xba.getClass();
        this.zzidn = xba;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zziaz = i;
    }

    public static a r() {
        return (a) zzido.j();
    }

    public static Tba s() {
        return zzido;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Sba.f8644a[i - 1]) {
            case 1:
                return new Tba();
            case 2:
                return new a((Sba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzido, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zziaz", "zzidn", "zziba"});
            case 4:
                return zzido;
            case 5:
                C2440qfa<Tba> qfa = zzei;
                if (qfa == null) {
                    synchronized (Tba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzido);
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

    public final Lda p() {
        return this.zziba;
    }

    public final Xba q() {
        Xba xba = this.zzidn;
        return xba == null ? Xba.q() : xba;
    }
}
