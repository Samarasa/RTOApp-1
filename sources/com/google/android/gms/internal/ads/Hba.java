package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Hba extends C2934xea<Hba, a> implements C2014kfa {
    private static volatile C2440qfa<Hba> zzei;
    /* access modifiers changed from: private */
    public static final Hba zzicr;
    private int zziaz;
    private Lda zziba = Lda.f7691a;
    private Kba zzicq;

    public static final class a extends C2934xea.a<Hba, a> implements C2014kfa {
        private a() {
            super(Hba.zzicr);
        }

        /* synthetic */ a(Iba iba) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Hba) this.f12784b).b(0);
            return this;
        }

        public final a a(Kba kba) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Hba) this.f12784b).a(kba);
            return this;
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Hba) this.f12784b).a(lda);
            return this;
        }
    }

    static {
        Hba hba = new Hba();
        zzicr = hba;
        C2934xea.a(Hba.class, hba);
    }

    private Hba() {
    }

    public static Hba a(Lda lda, C2012kea kea) {
        return (Hba) C2934xea.a(zzicr, lda, kea);
    }

    /* access modifiers changed from: private */
    public final void a(Kba kba) {
        kba.getClass();
        this.zzicq = kba;
    }

    /* access modifiers changed from: private */
    public final void a(Lda lda) {
        lda.getClass();
        this.zziba = lda;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zziaz = i;
    }

    public static a r() {
        return (a) zzicr.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Iba.f7305a[i - 1]) {
            case 1:
                return new Hba();
            case 2:
                return new a((Iba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzicr, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zziaz", "zzicq", "zziba"});
            case 4:
                return zzicr;
            case 5:
                C2440qfa<Hba> qfa = zzei;
                if (qfa == null) {
                    synchronized (Hba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzicr);
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

    public final Kba q() {
        Kba kba = this.zzicq;
        return kba == null ? Kba.t() : kba;
    }
}
