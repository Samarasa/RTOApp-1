package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Dpa extends C2934xea<Dpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final Dpa zzcfs;
    private static volatile C2440qfa<Dpa> zzei;
    private Hpa zzcfc;
    private C1680fpa zzcfd;
    private C1751gpa zzcfe;
    private C1822hpa zzcff;
    private Epa zzcfg;
    private C1609epa zzcfh;
    private Gpa zzcfi;
    private int zzcfj;
    private int zzcfk;
    private Bpa zzcfl;
    private int zzcfm;
    private int zzcfn;
    private int zzcfo;
    private int zzcfp;
    private int zzcfq;
    private long zzcfr;
    private int zzdt;

    public static final class a extends C2934xea.a<Dpa, a> implements C2014kfa {
        private a() {
            super(Dpa.zzcfs);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        Dpa dpa = new Dpa();
        zzcfs = dpa;
        C2934xea.a(Dpa.class, dpa);
    }

    private Dpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new Dpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcfs, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzdt", "zzcfc", "zzcfd", "zzcfe", "zzcff", "zzcfg", "zzcfh", "zzcfi", "zzcfj", "zzcfk", "zzcfl", "zzcfm", "zzcfn", "zzcfo", "zzcfp", "zzcfq", "zzcfr"});
            case 4:
                return zzcfs;
            case 5:
                C2440qfa<Dpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Dpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcfs);
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
