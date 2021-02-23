package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Uba extends C2934xea<Uba, a> implements C2014kfa {
    private static volatile C2440qfa<Uba> zzei;
    /* access modifiers changed from: private */
    public static final Uba zzidp;
    private int zziaz;
    private int zzibd;
    private Xba zzidn;

    public static final class a extends C2934xea.a<Uba, a> implements C2014kfa {
        private a() {
            super(Uba.zzidp);
        }

        /* synthetic */ a(Vba vba) {
            this();
        }
    }

    static {
        Uba uba = new Uba();
        zzidp = uba;
        C2934xea.a(Uba.class, uba);
    }

    private Uba() {
    }

    public static Uba a(Lda lda, C2012kea kea) {
        return (Uba) C2934xea.a(zzidp, lda, kea);
    }

    public static Uba q() {
        return zzidp;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Vba.f9053a[i - 1]) {
            case 1:
                return new Uba();
            case 2:
                return new a((Vba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzidp, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzidn", "zzibd", "zziaz"});
            case 4:
                return zzidp;
            case 5:
                C2440qfa<Uba> qfa = zzei;
                if (qfa == null) {
                    synchronized (Uba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzidp);
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

    public final Xba p() {
        Xba xba = this.zzidn;
        return xba == null ? Xba.q() : xba;
    }
}
