package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.ypa  reason: case insensitive filesystem */
public final class C3027ypa extends C2934xea<C3027ypa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C3027ypa zzceq;
    private static volatile C2440qfa<C3027ypa> zzei;
    private int zzceo;
    private int zzcep;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.ypa$a */
    public static final class a extends C2934xea.a<C3027ypa, a> implements C2014kfa {
        private a() {
            super(C3027ypa.zzceq);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C3027ypa ypa = new C3027ypa();
        zzceq = ypa;
        C2934xea.a(C3027ypa.class, ypa);
    }

    private C3027ypa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C3027ypa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzceq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdt", "zzceo", "zzcep"});
            case 4:
                return zzceq;
            case 5:
                C2440qfa<C3027ypa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C3027ypa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzceq);
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
