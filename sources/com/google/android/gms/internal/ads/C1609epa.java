package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.epa  reason: case insensitive filesystem */
public final class C1609epa extends C2934xea<C1609epa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C1609epa zzcgh;
    private static volatile C2440qfa<C1609epa> zzei;
    private int zzcci = 1000;
    private Fpa zzcft;
    private Bpa zzcfu;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.epa$a */
    public static final class a extends C2934xea.a<C1609epa, a> implements C2014kfa {
        private a() {
            super(C1609epa.zzcgh);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C1609epa epa = new C1609epa();
        zzcgh = epa;
        C2934xea.a(C1609epa.class, epa);
    }

    private C1609epa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C1609epa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcgh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdt", "zzcci", Rpa.c(), "zzcft", "zzcfu"});
            case 4:
                return zzcgh;
            case 5:
                C2440qfa<C1609epa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1609epa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcgh);
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
