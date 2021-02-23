package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Cba extends C2934xea<Cba, a> implements C2014kfa {
    private static volatile C2440qfa<Cba> zzei;
    /* access modifiers changed from: private */
    public static final Cba zzicj;
    private C1513dca zzici;

    public static final class a extends C2934xea.a<Cba, a> implements C2014kfa {
        private a() {
            super(Cba.zzicj);
        }

        /* synthetic */ a(Bba bba) {
            this();
        }
    }

    static {
        Cba cba = new Cba();
        zzicj = cba;
        C2934xea.a(Cba.class, cba);
    }

    private Cba() {
    }

    public static Cba p() {
        return zzicj;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Bba.f6317a[i - 1]) {
            case 1:
                return new Cba();
            case 2:
                return new a((Bba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzicj, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzici"});
            case 4:
                return zzicj;
            case 5:
                C2440qfa<Cba> qfa = zzei;
                if (qfa == null) {
                    synchronized (Cba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzicj);
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

    public final C1513dca o() {
        C1513dca dca = this.zzici;
        return dca == null ? C1513dca.q() : dca;
    }
}
