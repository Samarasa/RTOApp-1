package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Vaa extends C2934xea<Vaa, a> implements C2014kfa {
    private static volatile C2440qfa<Vaa> zzei;
    /* access modifiers changed from: private */
    public static final Vaa zzibg;
    private int zzibf;

    public static final class a extends C2934xea.a<Vaa, a> implements C2014kfa {
        private a() {
            super(Vaa.zzibg);
        }

        /* synthetic */ a(Waa waa) {
            this();
        }
    }

    static {
        Vaa vaa = new Vaa();
        zzibg = vaa;
        C2934xea.a(Vaa.class, vaa);
    }

    private Vaa() {
    }

    public static Vaa p() {
        return zzibg;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Waa.f9147a[i - 1]) {
            case 1:
                return new Vaa();
            case 2:
                return new a((Waa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibg, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzibf"});
            case 4:
                return zzibg;
            case 5:
                C2440qfa<Vaa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Vaa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibg);
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
        return this.zzibf;
    }
}
