package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Lba extends C2934xea<Lba, a> implements C2014kfa {
    private static volatile C2440qfa<Lba> zzei;
    /* access modifiers changed from: private */
    public static final Lba zzicy;
    private int zzicv;
    private int zzicw;
    private Lda zzicx = Lda.f7691a;

    public static final class a extends C2934xea.a<Lba, a> implements C2014kfa {
        private a() {
            super(Lba.zzicy);
        }

        /* synthetic */ a(Mba mba) {
            this();
        }
    }

    static {
        Lba lba = new Lba();
        zzicy = lba;
        C2934xea.a(Lba.class, lba);
    }

    private Lba() {
    }

    public static Lba r() {
        return zzicy;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Mba.f7867a[i - 1]) {
            case 1:
                return new Lba();
            case 2:
                return new a((Mba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzicy, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzicv", "zzicw", "zzicx"});
            case 4:
                return zzicy;
            case 5:
                C2440qfa<Lba> qfa = zzei;
                if (qfa == null) {
                    synchronized (Lba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzicy);
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

    public final Oba o() {
        Oba a2 = Oba.a(this.zzicv);
        return a2 == null ? Oba.UNRECOGNIZED : a2;
    }

    public final Rba p() {
        Rba a2 = Rba.a(this.zzicw);
        return a2 == null ? Rba.UNRECOGNIZED : a2;
    }

    public final Lda q() {
        return this.zzicx;
    }
}
