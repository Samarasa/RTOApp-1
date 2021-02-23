package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Zaa extends C2934xea<Zaa, a> implements C2014kfa {
    private static volatile C2440qfa<Zaa> zzei;
    /* access modifiers changed from: private */
    public static final Zaa zzibm;
    private C1440cba zzibk;
    private Uba zzibl;

    public static final class a extends C2934xea.a<Zaa, a> implements C2014kfa {
        private a() {
            super(Zaa.zzibm);
        }

        /* synthetic */ a(_aa _aa) {
            this();
        }
    }

    static {
        Zaa zaa = new Zaa();
        zzibm = zaa;
        C2934xea.a(Zaa.class, zaa);
    }

    private Zaa() {
    }

    public static Zaa a(Lda lda, C2012kea kea) {
        return (Zaa) C2934xea.a(zzibm, lda, kea);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (_aa.f9669a[i - 1]) {
            case 1:
                return new Zaa();
            case 2:
                return new a((_aa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzibk", "zzibl"});
            case 4:
                return zzibm;
            case 5:
                C2440qfa<Zaa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Zaa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibm);
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

    public final C1440cba o() {
        C1440cba cba = this.zzibk;
        return cba == null ? C1440cba.q() : cba;
    }

    public final Uba p() {
        Uba uba = this.zzibl;
        return uba == null ? Uba.q() : uba;
    }
}
