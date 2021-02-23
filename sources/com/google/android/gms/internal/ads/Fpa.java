package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Fpa extends C2934xea<Fpa, b> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final Fpa zzcfx;
    private static volatile C2440qfa<Fpa> zzei;
    private int zzcfw;
    private int zzdt;

    public enum a implements C3076zea {
        VIDEO_ERROR_CODE_UNSPECIFIED(0),
        OPENGL_RENDERING_FAILED(1),
        CACHE_LOAD_FAILED(2),
        ANDROID_TARGET_API_TOO_LOW(3);
        

        /* renamed from: e  reason: collision with root package name */
        private static final Cea<a> f6951e = null;

        /* renamed from: g  reason: collision with root package name */
        private final int f6953g;

        static {
            f6951e = new C1328aqa();
        }

        private a(int i) {
            this.f6953g = i;
        }

        public static Bea a() {
            return _pa.f9734a;
        }

        public static a a(int i) {
            if (i == 0) {
                return VIDEO_ERROR_CODE_UNSPECIFIED;
            }
            if (i == 1) {
                return OPENGL_RENDERING_FAILED;
            }
            if (i == 2) {
                return CACHE_LOAD_FAILED;
            }
            if (i != 3) {
                return null;
            }
            return ANDROID_TARGET_API_TOO_LOW;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f6953g + " name=" + name() + '>';
        }
    }

    public static final class b extends C2934xea.a<Fpa, b> implements C2014kfa {
        private b() {
            super(Fpa.zzcfx);
        }

        /* synthetic */ b(C1468cpa cpa) {
            this();
        }
    }

    static {
        Fpa fpa = new Fpa();
        zzcfx = fpa;
        C2934xea.a(Fpa.class, fpa);
    }

    private Fpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new Fpa();
            case 2:
                return new b((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcfx, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzdt", "zzcfw", a.a()});
            case 4:
                return zzcfx;
            case 5:
                C2440qfa<Fpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Fpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcfx);
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
