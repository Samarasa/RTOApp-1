package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.tba  reason: case insensitive filesystem */
public final class C2644tba extends C2934xea<C2644tba, a> implements C2014kfa {
    private static volatile C2440qfa<C2644tba> zzei;
    /* access modifiers changed from: private */
    public static final C2644tba zzibz;
    private int zziaz;
    private int zzibd;

    /* renamed from: com.google.android.gms.internal.ads.tba$a */
    public static final class a extends C2934xea.a<C2644tba, a> implements C2014kfa {
        private a() {
            super(C2644tba.zzibz);
        }

        /* synthetic */ a(C2715uba uba) {
            this();
        }
    }

    static {
        C2644tba tba = new C2644tba();
        zzibz = tba;
        C2934xea.a(C2644tba.class, tba);
    }

    private C2644tba() {
    }

    public static C2644tba a(Lda lda, C2012kea kea) {
        return (C2644tba) C2934xea.a(zzibz, lda, kea);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2715uba.f12341a[i - 1]) {
            case 1:
                return new C2644tba();
            case 2:
                return new a((C2715uba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibz, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zziaz", "zzibd"});
            case 4:
                return zzibz;
            case 5:
                C2440qfa<C2644tba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2644tba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibz);
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

    public final int o() {
        return this.zzibd;
    }
}
