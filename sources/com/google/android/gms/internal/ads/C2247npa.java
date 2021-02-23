package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.npa  reason: case insensitive filesystem */
public final class C2247npa extends C2934xea<C2247npa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2247npa zzcas;
    private static volatile C2440qfa<C2247npa> zzei;
    private int zzcam;
    private Bpa zzcan;
    private Bpa zzcao;
    private Bpa zzcap;
    private Fea<Bpa> zzcaq = C2934xea.n();
    private int zzcar;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.npa$a */
    public static final class a extends C2934xea.a<C2247npa, a> implements C2014kfa {
        private a() {
            super(C2247npa.zzcas);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C2247npa npa = new C2247npa();
        zzcas = npa;
        C2934xea.a(C2247npa.class, npa);
    }

    private C2247npa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2247npa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcas, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzdt", "zzcam", "zzcan", "zzcao", "zzcap", "zzcaq", Bpa.class, "zzcar"});
            case 4:
                return zzcas;
            case 5:
                C2440qfa<C2247npa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2247npa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcas);
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
