package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Dba extends C2934xea<Dba, a> implements C2014kfa {
    private static volatile C2440qfa<Dba> zzei;
    /* access modifiers changed from: private */
    public static final Dba zzicl;
    private Gba zzick;

    public static final class a extends C2934xea.a<Dba, a> implements C2014kfa {
        private a() {
            super(Dba.zzicl);
        }

        /* synthetic */ a(Eba eba) {
            this();
        }
    }

    static {
        Dba dba = new Dba();
        zzicl = dba;
        C2934xea.a(Dba.class, dba);
    }

    private Dba() {
    }

    public static Dba a(Lda lda, C2012kea kea) {
        return (Dba) C2934xea.a(zzicl, lda, kea);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Eba.f6717a[i - 1]) {
            case 1:
                return new Dba();
            case 2:
                return new a((Eba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzicl, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzick"});
            case 4:
                return zzicl;
            case 5:
                C2440qfa<Dba> qfa = zzei;
                if (qfa == null) {
                    synchronized (Dba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzicl);
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

    public final Gba o() {
        Gba gba = this.zzick;
        return gba == null ? Gba.r() : gba;
    }
}
