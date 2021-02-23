package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.ppa  reason: case insensitive filesystem */
public final class C2389ppa extends C2934xea<C2389ppa, b> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2389ppa zzcbg;
    private static volatile C2440qfa<C2389ppa> zzei;
    private int zzcbc;
    private Cpa zzcbd;
    private String zzcbe = BuildConfig.FLAVOR;
    private String zzcbf = BuildConfig.FLAVOR;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.ppa$a */
    public enum a implements C3076zea {
        PLATFORM_UNSPECIFIED(0),
        IOS(1),
        ANDROID(2);
        

        /* renamed from: d  reason: collision with root package name */
        private static final Cea<a> f11784d = null;

        /* renamed from: f  reason: collision with root package name */
        private final int f11786f;

        static {
            f11784d = new Ppa();
        }

        private a(int i) {
            this.f11786f = i;
        }

        public static Bea a() {
            return Opa.f8160a;
        }

        public static a a(int i) {
            if (i == 0) {
                return PLATFORM_UNSPECIFIED;
            }
            if (i == 1) {
                return IOS;
            }
            if (i != 2) {
                return null;
            }
            return ANDROID;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11786f + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ppa$b */
    public static final class b extends C2934xea.a<C2389ppa, b> implements C2014kfa {
        private b() {
            super(C2389ppa.zzcbg);
        }

        /* synthetic */ b(C1468cpa cpa) {
            this();
        }
    }

    static {
        C2389ppa ppa = new C2389ppa();
        zzcbg = ppa;
        C2934xea.a(C2389ppa.class, ppa);
    }

    private C2389ppa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2389ppa();
            case 2:
                return new b((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcbg, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzdt", "zzcbc", a.a(), "zzcbd", "zzcbe", "zzcbf"});
            case 4:
                return zzcbg;
            case 5:
                C2440qfa<C2389ppa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2389ppa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcbg);
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
