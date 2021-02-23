package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Kba extends C2934xea<Kba, a> implements C2014kfa {
    private static volatile C2440qfa<Kba> zzei;
    /* access modifiers changed from: private */
    public static final Kba zzicu;
    private int zziaz;
    private Gba zzick;
    private Lda zzics;
    private Lda zzict;

    public static final class a extends C2934xea.a<Kba, a> implements C2014kfa {
        private a() {
            super(Kba.zzicu);
        }

        /* synthetic */ a(Jba jba) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Kba) this.f12784b).b(0);
            return this;
        }

        public final a a(Gba gba) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Kba) this.f12784b).a(gba);
            return this;
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Kba) this.f12784b).a(lda);
            return this;
        }

        public final a b(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Kba) this.f12784b).b(lda);
            return this;
        }
    }

    static {
        Kba kba = new Kba();
        zzicu = kba;
        C2934xea.a(Kba.class, kba);
    }

    private Kba() {
        Lda lda = Lda.f7691a;
        this.zzics = lda;
        this.zzict = lda;
    }

    public static Kba a(Lda lda, C2012kea kea) {
        return (Kba) C2934xea.a(zzicu, lda, kea);
    }

    /* access modifiers changed from: private */
    public final void a(Gba gba) {
        gba.getClass();
        this.zzick = gba;
    }

    /* access modifiers changed from: private */
    public final void a(Lda lda) {
        lda.getClass();
        this.zzics = lda;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zziaz = i;
    }

    /* access modifiers changed from: private */
    public final void b(Lda lda) {
        lda.getClass();
        this.zzict = lda;
    }

    public static a s() {
        return (a) zzicu.j();
    }

    public static Kba t() {
        return zzicu;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Jba.f7441a[i - 1]) {
            case 1:
                return new Kba();
            case 2:
                return new a((Jba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzicu, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zziaz", "zzick", "zzics", "zzict"});
            case 4:
                return zzicu;
            case 5:
                C2440qfa<Kba> qfa = zzei;
                if (qfa == null) {
                    synchronized (Kba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzicu);
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

    public final Gba p() {
        Gba gba = this.zzick;
        return gba == null ? Gba.r() : gba;
    }

    public final Lda q() {
        return this.zzics;
    }

    public final Lda r() {
        return this.zzict;
    }
}
