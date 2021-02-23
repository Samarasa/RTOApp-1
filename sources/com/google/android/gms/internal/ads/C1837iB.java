package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.iB  reason: case insensitive filesystem */
public final class C1837iB extends C2934xea<C1837iB, a> implements C2014kfa {
    private static volatile C2440qfa<C1837iB> zzei;
    /* access modifiers changed from: private */
    public static final C1837iB zzlc;
    private int zzdt;
    private long zzkx;
    private int zzky;
    private boolean zzkz;
    private Eea zzla = C2934xea.l();
    private long zzlb;

    /* renamed from: com.google.android.gms.internal.ads.iB$a */
    public static final class a extends C2934xea.a<C1837iB, a> implements C2014kfa {
        private a() {
            super(C1837iB.zzlc);
        }

        /* synthetic */ a(HA ha) {
            this();
        }
    }

    static {
        C1837iB iBVar = new C1837iB();
        zzlc = iBVar;
        C2934xea.a(C1837iB.class, iBVar);
    }

    private C1837iB() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (HA.f7115a[i - 1]) {
            case 1:
                return new C1837iB();
            case 2:
                return new a((HA) null);
            case 3:
                return C2934xea.a((C1872ifa) zzlc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzdt", "zzkx", "zzky", "zzkz", "zzla", "zzlb"});
            case 4:
                return zzlc;
            case 5:
                C2440qfa<C1837iB> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1837iB.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzlc);
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
