package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Uaa extends C2934xea<Uaa, a> implements C2014kfa {
    private static volatile C2440qfa<Uaa> zzei;
    /* access modifiers changed from: private */
    public static final Uaa zzibe;
    private Vaa zzibb;
    private int zzibd;

    public static final class a extends C2934xea.a<Uaa, a> implements C2014kfa {
        private a() {
            super(Uaa.zzibe);
        }

        /* synthetic */ a(Taa taa) {
            this();
        }
    }

    static {
        Uaa uaa = new Uaa();
        zzibe = uaa;
        C2934xea.a(Uaa.class, uaa);
    }

    private Uaa() {
    }

    public static Uaa a(Lda lda, C2012kea kea) {
        return (Uaa) C2934xea.a(zzibe, lda, kea);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Taa.f8800a[i - 1]) {
            case 1:
                return new Uaa();
            case 2:
                return new a((Taa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibe, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzibd", "zzibb"});
            case 4:
                return zzibe;
            case 5:
                C2440qfa<Uaa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Uaa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibe);
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

    public final Vaa p() {
        Vaa vaa = this.zzibb;
        return vaa == null ? Vaa.p() : vaa;
    }
}
