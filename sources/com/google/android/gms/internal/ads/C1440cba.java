package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.cba  reason: case insensitive filesystem */
public final class C1440cba extends C2934xea<C1440cba, a> implements C2014kfa {
    private static volatile C2440qfa<C1440cba> zzei;
    /* access modifiers changed from: private */
    public static final C1440cba zzibp;
    private int zzibd;
    private C1652fba zzibn;

    /* renamed from: com.google.android.gms.internal.ads.cba$a */
    public static final class a extends C2934xea.a<C1440cba, a> implements C2014kfa {
        private a() {
            super(C1440cba.zzibp);
        }

        /* synthetic */ a(C1511dba dba) {
            this();
        }
    }

    static {
        C1440cba cba = new C1440cba();
        zzibp = cba;
        C2934xea.a(C1440cba.class, cba);
    }

    private C1440cba() {
    }

    public static C1440cba a(Lda lda, C2012kea kea) {
        return (C1440cba) C2934xea.a(zzibp, lda, kea);
    }

    public static C1440cba q() {
        return zzibp;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1511dba.f10157a[i - 1]) {
            case 1:
                return new C1440cba();
            case 2:
                return new a((C1511dba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzibn", "zzibd"});
            case 4:
                return zzibp;
            case 5:
                C2440qfa<C1440cba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1440cba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibp);
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

    public final C1652fba p() {
        C1652fba fba = this.zzibn;
        return fba == null ? C1652fba.p() : fba;
    }
}
