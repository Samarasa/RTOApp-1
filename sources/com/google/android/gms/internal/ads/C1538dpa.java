package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2176mpa;
import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.dpa  reason: case insensitive filesystem */
public final class C1538dpa extends C2934xea<C1538dpa, b> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C1538dpa zzbyx;
    private static volatile C2440qfa<C1538dpa> zzei;
    private int zzbym;
    private int zzbyn = 1000;
    private C2105lpa zzbyo;
    private C2176mpa zzbyp;
    private Fea<C2034kpa> zzbyq = C2934xea.n();
    private C2247npa zzbyr;
    private C2956xpa zzbys;
    private C2814vpa zzbyt;
    private C2601spa zzbyu;
    private C2672tpa zzbyv;
    private Fea<Dpa> zzbyw = C2934xea.n();
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.dpa$a */
    public enum a implements C3076zea {
        AD_INITIATER_UNSPECIFIED(0),
        BANNER(1),
        DFP_BANNER(2),
        INTERSTITIAL(3),
        DFP_INTERSTITIAL(4),
        NATIVE_EXPRESS(5),
        AD_LOADER(6),
        REWARD_BASED_VIDEO_AD(7),
        BANNER_SEARCH_ADS(8),
        GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
        APP_OPEN(10);
        
        private static final Cea<a> l = null;
        private final int n;

        static {
            l = new Jpa();
        }

        private a(int i) {
            this.n = i;
        }

        public static a a(int i) {
            switch (i) {
                case 0:
                    return AD_INITIATER_UNSPECIFIED;
                case 1:
                    return BANNER;
                case 2:
                    return DFP_BANNER;
                case 3:
                    return INTERSTITIAL;
                case 4:
                    return DFP_INTERSTITIAL;
                case 5:
                    return NATIVE_EXPRESS;
                case 6:
                    return AD_LOADER;
                case 7:
                    return REWARD_BASED_VIDEO_AD;
                case 8:
                    return BANNER_SEARCH_ADS;
                case 9:
                    return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                case 10:
                    return APP_OPEN;
                default:
                    return null;
            }
        }

        public static Bea c() {
            return Ipa.f7351a;
        }

        public final int a() {
            return this.n;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.n + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.dpa$b */
    public static final class b extends C2934xea.a<C1538dpa, b> implements C2014kfa {
        private b() {
            super(C1538dpa.zzbyx);
        }

        /* synthetic */ b(C1468cpa cpa) {
            this();
        }

        public final b a(a aVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1538dpa) this.f12784b).a(aVar);
            return this;
        }

        public final b a(C2176mpa.a aVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1538dpa) this.f12784b).a((C2176mpa) aVar.k());
            return this;
        }
    }

    static {
        C1538dpa dpa = new C1538dpa();
        zzbyx = dpa;
        C2934xea.a(C1538dpa.class, dpa);
    }

    private C1538dpa() {
    }

    /* access modifiers changed from: private */
    public final void a(a aVar) {
        this.zzbym = aVar.a();
        this.zzdt |= 1;
    }

    /* access modifiers changed from: private */
    public final void a(C2176mpa mpa) {
        mpa.getClass();
        this.zzbyp = mpa;
        this.zzdt |= 8;
    }

    public static C1538dpa p() {
        return zzbyx;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C1538dpa();
            case 2:
                return new b((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzbyx, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzdt", "zzbym", a.c(), "zzbyn", Rpa.c(), "zzbyo", "zzbyp", "zzbyq", C2034kpa.class, "zzbyr", "zzbys", "zzbyt", "zzbyu", "zzbyv", "zzbyw", Dpa.class});
            case 4:
                return zzbyx;
            case 5:
                C2440qfa<C1538dpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1538dpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzbyx);
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

    public final C2176mpa o() {
        C2176mpa mpa = this.zzbyp;
        return mpa == null ? C2176mpa.o() : mpa;
    }
}
