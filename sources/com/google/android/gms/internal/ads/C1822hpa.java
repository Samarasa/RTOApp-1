package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.hpa  reason: case insensitive filesystem */
public final class C1822hpa extends C2934xea<C1822hpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C1822hpa zzcgl;
    private static volatile C2440qfa<C1822hpa> zzei;
    private int zzcci = 1000;
    private Fpa zzcft;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.hpa$a */
    public static final class a extends C2934xea.a<C1822hpa, a> implements C2014kfa {
        private a() {
            super(C1822hpa.zzcgl);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C1822hpa hpa = new C1822hpa();
        zzcgl = hpa;
        C2934xea.a(C1822hpa.class, hpa);
    }

    private C1822hpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C1822hpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcgl, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdt", "zzcci", Rpa.c(), "zzcft"});
            case 4:
                return zzcgl;
            case 5:
                C2440qfa<C1822hpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1822hpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcgl);
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
