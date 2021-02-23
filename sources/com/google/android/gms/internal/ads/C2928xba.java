package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.xba  reason: case insensitive filesystem */
public final class C2928xba extends C2934xea<C2928xba, a> implements C2014kfa {
    private static volatile C2440qfa<C2928xba> zzei;
    /* access modifiers changed from: private */
    public static final C2928xba zzicb;

    /* renamed from: com.google.android.gms.internal.ads.xba$a */
    public static final class a extends C2934xea.a<C2928xba, a> implements C2014kfa {
        private a() {
            super(C2928xba.zzicb);
        }

        /* synthetic */ a(C2999yba yba) {
            this();
        }
    }

    static {
        C2928xba xba = new C2928xba();
        zzicb = xba;
        C2934xea.a(C2928xba.class, xba);
    }

    private C2928xba() {
    }

    public static C2928xba a(Lda lda, C2012kea kea) {
        return (C2928xba) C2934xea.a(zzicb, lda, kea);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2999yba.f12933a[i - 1]) {
            case 1:
                return new C2928xba();
            case 2:
                return new a((C2999yba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzicb, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzicb;
            case 5:
                C2440qfa<C2928xba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2928xba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzicb);
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
