package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.oba  reason: case insensitive filesystem */
public final class C2290oba extends C2934xea<C2290oba, a> implements C2014kfa {
    private static volatile C2440qfa<C2290oba> zzei;
    /* access modifiers changed from: private */
    public static final C2290oba zzibx;
    private int zziaz;
    private int zzibd;

    /* renamed from: com.google.android.gms.internal.ads.oba$a */
    public static final class a extends C2934xea.a<C2290oba, a> implements C2014kfa {
        private a() {
            super(C2290oba.zzibx);
        }

        /* synthetic */ a(C2432qba qba) {
            this();
        }
    }

    static {
        C2290oba oba = new C2290oba();
        zzibx = oba;
        C2934xea.a(C2290oba.class, oba);
    }

    private C2290oba() {
    }

    public static C2290oba a(Lda lda, C2012kea kea) {
        return (C2290oba) C2934xea.a(zzibx, lda, kea);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2432qba.f11860a[i - 1]) {
            case 1:
                return new C2290oba();
            case 2:
                return new a((C2432qba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibx, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzibd", "zziaz"});
            case 4:
                return zzibx;
            case 5:
                C2440qfa<C2290oba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2290oba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibx);
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
