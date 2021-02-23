package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Epa extends C2934xea<Epa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final Epa zzcfv;
    private static volatile C2440qfa<Epa> zzei;
    private int zzcci = 1000;
    private Fpa zzcft;
    private Bpa zzcfu;
    private int zzdt;

    public static final class a extends C2934xea.a<Epa, a> implements C2014kfa {
        private a() {
            super(Epa.zzcfv);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        Epa epa = new Epa();
        zzcfv = epa;
        C2934xea.a(Epa.class, epa);
    }

    private Epa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new Epa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcfv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdt", "zzcci", Rpa.c(), "zzcft", "zzcfu"});
            case 4:
                return zzcfv;
            case 5:
                C2440qfa<Epa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Epa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcfv);
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
}
