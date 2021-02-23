package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.zpa  reason: case insensitive filesystem */
public final class C3098zpa extends C2934xea<C3098zpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C3098zpa zzcet;
    private static volatile C2440qfa<C3098zpa> zzei;
    private int zzcer;
    private int zzces;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.zpa$a */
    public static final class a extends C2934xea.a<C3098zpa, a> implements C2014kfa {
        private a() {
            super(C3098zpa.zzcet);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C3098zpa zpa = new C3098zpa();
        zzcet = zpa;
        C2934xea.a(C3098zpa.class, zpa);
    }

    private C3098zpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C3098zpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcet, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdt", "zzcer", "zzces"});
            case 4:
                return zzcet;
            case 5:
                C2440qfa<C3098zpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C3098zpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcet);
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
