package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Gpa extends C2934xea<Gpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final Gpa zzcge;
    private static volatile C2440qfa<Gpa> zzei;
    private int zzcci = 1000;
    private Fpa zzcft;
    private Bpa zzcfu;
    private Cpa zzcgd;
    private int zzdt;

    public static final class a extends C2934xea.a<Gpa, a> implements C2014kfa {
        private a() {
            super(Gpa.zzcge);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        Gpa gpa = new Gpa();
        zzcge = gpa;
        C2934xea.a(Gpa.class, gpa);
    }

    private Gpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new Gpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcge, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzdt", "zzcgd", "zzcci", Rpa.c(), "zzcft", "zzcfu"});
            case 4:
                return zzcge;
            case 5:
                C2440qfa<Gpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Gpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcge);
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
