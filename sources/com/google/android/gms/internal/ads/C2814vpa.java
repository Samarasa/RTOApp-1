package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.vpa  reason: case insensitive filesystem */
public final class C2814vpa extends C2934xea<C2814vpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2814vpa zzcda;
    private static volatile C2440qfa<C2814vpa> zzei;
    private int zzccy;
    private Bpa zzccz;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.vpa$a */
    public static final class a extends C2934xea.a<C2814vpa, a> implements C2014kfa {
        private a() {
            super(C2814vpa.zzcda);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C2814vpa vpa = new C2814vpa();
        zzcda = vpa;
        C2934xea.a(C2814vpa.class, vpa);
    }

    private C2814vpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2814vpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcda, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdt", "zzccy", Rpa.c(), "zzccz"});
            case 4:
                return zzcda;
            case 5:
                C2440qfa<C2814vpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2814vpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcda);
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
