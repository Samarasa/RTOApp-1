package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.tpa  reason: case insensitive filesystem */
public final class C2672tpa extends C2934xea<C2672tpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2672tpa zzccm;
    private static volatile C2440qfa<C2672tpa> zzei;
    private Bpa zzccg;
    private int zzcci;
    private C2530rpa zzcck;
    private Fea<Apa> zzccl = C2934xea.n();
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.tpa$a */
    public static final class a extends C2934xea.a<C2672tpa, a> implements C2014kfa {
        private a() {
            super(C2672tpa.zzccm);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C2672tpa tpa = new C2672tpa();
        zzccm = tpa;
        C2934xea.a(C2672tpa.class, tpa);
    }

    private C2672tpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2672tpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzccm, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzdt", "zzcck", "zzccl", Apa.class, "zzcci", Rpa.c(), "zzccg"});
            case 4:
                return zzccm;
            case 5:
                C2440qfa<C2672tpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2672tpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzccm);
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
