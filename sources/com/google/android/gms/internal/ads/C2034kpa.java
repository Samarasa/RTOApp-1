package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.kpa  reason: case insensitive filesystem */
public final class C2034kpa extends C2934xea<C2034kpa, b> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2034kpa zzcab;
    private static volatile C2440qfa<C2034kpa> zzei;
    private int zzbzz;
    private C3098zpa zzcaa;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.kpa$a */
    public enum a implements C3076zea {
        AD_FORMAT_TYPE_UNSPECIFIED(0),
        BANNER(1),
        INTERSTITIAL(2),
        NATIVE_EXPRESS(3),
        NATIVE_CONTENT(4),
        NATIVE_APP_INSTALL(5),
        NATIVE_CUSTOM_TEMPLATE(6),
        DFP_BANNER(7),
        DFP_INTERSTITIAL(8),
        REWARD_BASED_VIDEO_AD(9),
        BANNER_SEARCH_ADS(10);
        
        private static final Cea<a> l = null;
        private final int n;

        static {
            l = new Npa();
        }

        private a(int i) {
            this.n = i;
        }

        public static a a(int i) {
            switch (i) {
                case 0:
                    return AD_FORMAT_TYPE_UNSPECIFIED;
                case 1:
                    return BANNER;
                case 2:
                    return INTERSTITIAL;
                case 3:
                    return NATIVE_EXPRESS;
                case 4:
                    return NATIVE_CONTENT;
                case 5:
                    return NATIVE_APP_INSTALL;
                case 6:
                    return NATIVE_CUSTOM_TEMPLATE;
                case 7:
                    return DFP_BANNER;
                case 8:
                    return DFP_INTERSTITIAL;
                case 9:
                    return REWARD_BASED_VIDEO_AD;
                case 10:
                    return BANNER_SEARCH_ADS;
                default:
                    return null;
            }
        }

        public static Bea c() {
            return Mpa.f7907a;
        }

        public final int a() {
            return this.n;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.n + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.kpa$b */
    public static final class b extends C2934xea.a<C2034kpa, b> implements C2014kfa {
        private b() {
            super(C2034kpa.zzcab);
        }

        /* synthetic */ b(C1468cpa cpa) {
            this();
        }
    }

    static {
        C2034kpa kpa = new C2034kpa();
        zzcab = kpa;
        C2934xea.a(C2034kpa.class, kpa);
    }

    private C2034kpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2034kpa();
            case 2:
                return new b((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcab, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdt", "zzbzz", a.c(), "zzcaa"});
            case 4:
                return zzcab;
            case 5:
                C2440qfa<C2034kpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2034kpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcab);
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
