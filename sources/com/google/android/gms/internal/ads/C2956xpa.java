package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.xpa  reason: case insensitive filesystem */
public final class C2956xpa extends C2934xea<C2956xpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2956xpa zzcen;
    private static volatile C2440qfa<C2956xpa> zzei;
    private int zzcec = 1000;
    private int zzced = 1000;
    private int zzcee;
    private int zzcef;
    private int zzceg;
    private int zzceh;
    private int zzcei;
    private int zzcej;
    private int zzcek;
    private int zzcel;
    private C3027ypa zzcem;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.xpa$a */
    public static final class a extends C2934xea.a<C2956xpa, a> implements C2014kfa {
        private a() {
            super(C2956xpa.zzcen);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C2956xpa xpa = new C2956xpa();
        zzcen = xpa;
        C2934xea.a(C2956xpa.class, xpa);
    }

    private C2956xpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2956xpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcen, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzdt", "zzcec", Rpa.c(), "zzced", Rpa.c(), "zzcee", "zzcef", "zzceg", "zzceh", "zzcei", "zzcej", "zzcek", "zzcel", "zzcem"});
            case 4:
                return zzcen;
            case 5:
                C2440qfa<C2956xpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2956xpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcen);
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
