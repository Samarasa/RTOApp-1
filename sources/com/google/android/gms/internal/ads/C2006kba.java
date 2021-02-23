package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.kba  reason: case insensitive filesystem */
public final class C2006kba extends C2934xea<C2006kba, a> implements C2014kfa {
    private static volatile C2440qfa<C2006kba> zzei;
    /* access modifiers changed from: private */
    public static final C2006kba zzibv;
    private int zzibq;

    /* renamed from: com.google.android.gms.internal.ads.kba$a */
    public static final class a extends C2934xea.a<C2006kba, a> implements C2014kfa {
        private a() {
            super(C2006kba.zzibv);
        }

        /* synthetic */ a(C2077lba lba) {
            this();
        }
    }

    static {
        C2006kba kba = new C2006kba();
        zzibv = kba;
        C2934xea.a(C2006kba.class, kba);
    }

    private C2006kba() {
    }

    public static C2006kba p() {
        return zzibv;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2077lba.f11196a[i - 1]) {
            case 1:
                return new C2006kba();
            case 2:
                return new a((C2077lba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibv, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzibq"});
            case 4:
                return zzibv;
            case 5:
                C2440qfa<C2006kba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2006kba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibv);
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
        return this.zzibq;
    }
}
