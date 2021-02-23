package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.jba  reason: case insensitive filesystem */
public final class C1935jba extends C2934xea<C1935jba, a> implements C2014kfa {
    private static volatile C2440qfa<C1935jba> zzei;
    /* access modifiers changed from: private */
    public static final C1935jba zzibu;
    private int zzibd;
    private C2006kba zzibs;

    /* renamed from: com.google.android.gms.internal.ads.jba$a */
    public static final class a extends C2934xea.a<C1935jba, a> implements C2014kfa {
        private a() {
            super(C1935jba.zzibu);
        }

        /* synthetic */ a(C1865iba iba) {
            this();
        }
    }

    static {
        C1935jba jba = new C1935jba();
        zzibu = jba;
        C2934xea.a(C1935jba.class, jba);
    }

    private C1935jba() {
    }

    public static C1935jba a(Lda lda, C2012kea kea) {
        return (C1935jba) C2934xea.a(zzibu, lda, kea);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1865iba.f10823a[i - 1]) {
            case 1:
                return new C1935jba();
            case 2:
                return new a((C1865iba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibu, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzibs", "zzibd"});
            case 4:
                return zzibu;
            case 5:
                C2440qfa<C1935jba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1935jba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibu);
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

    public final C2006kba p() {
        C2006kba kba = this.zzibs;
        return kba == null ? C2006kba.p() : kba;
    }
}
