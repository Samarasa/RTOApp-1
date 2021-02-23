package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.fba  reason: case insensitive filesystem */
public final class C1652fba extends C2934xea<C1652fba, a> implements C2014kfa {
    private static volatile C2440qfa<C1652fba> zzei;
    /* access modifiers changed from: private */
    public static final C1652fba zzibr;
    private int zzibq;

    /* renamed from: com.google.android.gms.internal.ads.fba$a */
    public static final class a extends C2934xea.a<C1652fba, a> implements C2014kfa {
        private a() {
            super(C1652fba.zzibr);
        }

        /* synthetic */ a(C1581eba eba) {
            this();
        }
    }

    static {
        C1652fba fba = new C1652fba();
        zzibr = fba;
        C2934xea.a(C1652fba.class, fba);
    }

    private C1652fba() {
    }

    public static C1652fba p() {
        return zzibr;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1581eba.f10283a[i - 1]) {
            case 1:
                return new C1652fba();
            case 2:
                return new a((C1581eba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibr, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzibq"});
            case 4:
                return zzibr;
            case 5:
                C2440qfa<C1652fba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1652fba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibr);
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
