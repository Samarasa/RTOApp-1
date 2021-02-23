package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.spa  reason: case insensitive filesystem */
public final class C2601spa extends C2934xea<C2601spa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2601spa zzccj;
    private static volatile C2440qfa<C2601spa> zzei;
    private Eea zzccf = C2934xea.l();
    private int zzcci;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.spa$a */
    public static final class a extends C2934xea.a<C2601spa, a> implements C2014kfa {
        private a() {
            super(C2601spa.zzccj);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C2601spa spa = new C2601spa();
        zzccj = spa;
        C2934xea.a(C2601spa.class, spa);
    }

    private C2601spa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2601spa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzccj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzdt", "zzcci", Rpa.c(), "zzccf"});
            case 4:
                return zzccj;
            case 5:
                C2440qfa<C2601spa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2601spa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzccj);
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
