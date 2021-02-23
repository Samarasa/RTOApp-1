package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.fpa  reason: case insensitive filesystem */
public final class C1680fpa extends C2934xea<C1680fpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C1680fpa zzcgj;
    private static volatile C2440qfa<C1680fpa> zzei;
    private int zzcci = 1000;
    private int zzcfj;
    private int zzcfk;
    private Fpa zzcft;
    private int zzcgf;
    private long zzcgi;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.fpa$a */
    public static final class a extends C2934xea.a<C1680fpa, a> implements C2014kfa {
        private a() {
            super(C1680fpa.zzcgj);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C1680fpa fpa = new C1680fpa();
        zzcgj = fpa;
        C2934xea.a(C1680fpa.class, fpa);
    }

    private C1680fpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C1680fpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcgj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzdt", "zzcci", Rpa.c(), "zzcft", "zzcfj", "zzcfk", "zzcgf", "zzcgi"});
            case 4:
                return zzcgj;
            case 5:
                C2440qfa<C1680fpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1680fpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcgj);
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
