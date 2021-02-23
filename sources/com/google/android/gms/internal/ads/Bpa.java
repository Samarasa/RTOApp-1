package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Bpa extends C2934xea<Bpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final Bpa zzcex;
    private static volatile C2440qfa<Bpa> zzei;
    private int zzcev;
    private int zzcew;
    private int zzdt;

    public static final class a extends C2934xea.a<Bpa, a> implements C2014kfa {
        private a() {
            super(Bpa.zzcex);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        Bpa bpa = new Bpa();
        zzcex = bpa;
        C2934xea.a(Bpa.class, bpa);
    }

    private Bpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new Bpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcex, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdt", "zzcev", "zzcew"});
            case 4:
                return zzcex;
            case 5:
                C2440qfa<Bpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Bpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcex);
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
