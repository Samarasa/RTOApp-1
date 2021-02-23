package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Xba extends C2934xea<Xba, a> implements C2014kfa {
    private static volatile C2440qfa<Xba> zzei;
    /* access modifiers changed from: private */
    public static final Xba zzidr;
    private int zzibf;
    private int zzidq;

    public static final class a extends C2934xea.a<Xba, a> implements C2014kfa {
        private a() {
            super(Xba.zzidr);
        }

        /* synthetic */ a(Wba wba) {
            this();
        }
    }

    static {
        Xba xba = new Xba();
        zzidr = xba;
        C2934xea.a(Xba.class, xba);
    }

    private Xba() {
    }

    public static Xba q() {
        return zzidr;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Wba.f9148a[i - 1]) {
            case 1:
                return new Xba();
            case 2:
                return new a((Wba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzidr, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzidq", "zzibf"});
            case 4:
                return zzidr;
            case 5:
                C2440qfa<Xba> qfa = zzei;
                if (qfa == null) {
                    synchronized (Xba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzidr);
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

    public final Rba p() {
        Rba a2 = Rba.a(this.zzidq);
        return a2 == null ? Rba.UNRECOGNIZED : a2;
    }
}
