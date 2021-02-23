package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Qaa extends C2934xea<Qaa, a> implements C2014kfa {
    private static volatile C2440qfa<Qaa> zzei;
    /* access modifiers changed from: private */
    public static final Qaa zzibc;
    private int zziaz;
    private Lda zziba = Lda.f7691a;
    private Vaa zzibb;

    public static final class a extends C2934xea.a<Qaa, a> implements C2014kfa {
        private a() {
            super(Qaa.zzibc);
        }

        /* synthetic */ a(Saa saa) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Qaa) this.f12784b).b(0);
            return this;
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Qaa) this.f12784b).a(lda);
            return this;
        }

        public final a a(Vaa vaa) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Qaa) this.f12784b).a(vaa);
            return this;
        }
    }

    static {
        Qaa qaa = new Qaa();
        zzibc = qaa;
        C2934xea.a(Qaa.class, qaa);
    }

    private Qaa() {
    }

    public static Qaa a(Lda lda, C2012kea kea) {
        return (Qaa) C2934xea.a(zzibc, lda, kea);
    }

    /* access modifiers changed from: private */
    public final void a(Lda lda) {
        lda.getClass();
        this.zziba = lda;
    }

    /* access modifiers changed from: private */
    public final void a(Vaa vaa) {
        vaa.getClass();
        this.zzibb = vaa;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zziaz = 0;
    }

    public static a r() {
        return (a) zzibc.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Saa.f8643a[i - 1]) {
            case 1:
                return new Qaa();
            case 2:
                return new a((Saa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zziaz", "zziba", "zzibb"});
            case 4:
                return zzibc;
            case 5:
                C2440qfa<Qaa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Qaa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibc);
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

    public final Vaa q() {
        Vaa vaa = this.zzibb;
        return vaa == null ? Vaa.p() : vaa;
    }
}
