package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Hpa extends C2934xea<Hpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final Hpa zzcgg;
    private static volatile C2440qfa<Hpa> zzei;
    private int zzcci = 1000;
    private int zzcfj;
    private int zzcfk;
    private Fpa zzcft;
    private int zzcgf;
    private int zzdt;

    public static final class a extends C2934xea.a<Hpa, a> implements C2014kfa {
        private a() {
            super(Hpa.zzcgg);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        Hpa hpa = new Hpa();
        zzcgg = hpa;
        C2934xea.a(Hpa.class, hpa);
    }

    private Hpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new Hpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcgg, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzdt", "zzcci", Rpa.c(), "zzcft", "zzcfj", "zzcfk", "zzcgf"});
            case 4:
                return zzcgg;
            case 5:
                C2440qfa<Hpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Hpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcgg);
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
