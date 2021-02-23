package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Aca extends C2934xea<Aca, a> implements C2014kfa {
    private static volatile C2440qfa<Aca> zzei;
    /* access modifiers changed from: private */
    public static final Aca zzifu;

    public static final class a extends C2934xea.a<Aca, a> implements C2014kfa {
        private a() {
            super(Aca.zzifu);
        }

        /* synthetic */ a(C3072zca zca) {
            this();
        }
    }

    static {
        Aca aca = new Aca();
        zzifu = aca;
        C2934xea.a(Aca.class, aca);
    }

    private Aca() {
    }

    public static Aca a(Lda lda, C2012kea kea) {
        return (Aca) C2934xea.a(zzifu, lda, kea);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C3072zca.f13077a[i - 1]) {
            case 1:
                return new Aca();
            case 2:
                return new a((C3072zca) null);
            case 3:
                return C2934xea.a((C1872ifa) zzifu, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzifu;
            case 5:
                C2440qfa<Aca> qfa = zzei;
                if (qfa == null) {
                    synchronized (Aca.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzifu);
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
