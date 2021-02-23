package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.upa  reason: case insensitive filesystem */
public final class C2743upa extends C2934xea<C2743upa, b> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2743upa zzcco;
    private static volatile C2440qfa<C2743upa> zzei;
    private int zzbzz;
    private int zzccn;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.upa$a */
    public enum a implements C3076zea {
        CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
        TWO_G(1),
        THREE_G(2),
        LTE(4);
        

        /* renamed from: e  reason: collision with root package name */
        private static final Cea<a> f12434e = null;

        /* renamed from: g  reason: collision with root package name */
        private final int f12436g;

        static {
            f12434e = new Upa();
        }

        private a(int i) {
            this.f12436g = i;
        }

        public static a a(int i) {
            if (i == 0) {
                return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return TWO_G;
            }
            if (i == 2) {
                return THREE_G;
            }
            if (i != 4) {
                return null;
            }
            return LTE;
        }

        public static Bea c() {
            return Tpa.f8835a;
        }

        public final int a() {
            return this.f12436g;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f12436g + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.upa$b */
    public static final class b extends C2934xea.a<C2743upa, b> implements C2014kfa {
        private b() {
            super(C2743upa.zzcco);
        }

        /* synthetic */ b(C1468cpa cpa) {
            this();
        }

        public final b a(a aVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2743upa) this.f12784b).a(aVar);
            return this;
        }

        public final b a(c cVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2743upa) this.f12784b).a(cVar);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.upa$c */
    public enum c implements C3076zea {
        NETWORKTYPE_UNSPECIFIED(0),
        CELL(1),
        WIFI(2);
        

        /* renamed from: d  reason: collision with root package name */
        private static final Cea<c> f12440d = null;

        /* renamed from: f  reason: collision with root package name */
        private final int f12442f;

        static {
            f12440d = new Vpa();
        }

        private c(int i) {
            this.f12442f = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return NETWORKTYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return CELL;
            }
            if (i != 2) {
                return null;
            }
            return WIFI;
        }

        public static Bea c() {
            return Wpa.f9177a;
        }

        public final int a() {
            return this.f12442f;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f12442f + " name=" + name() + '>';
        }
    }

    static {
        C2743upa upa = new C2743upa();
        zzcco = upa;
        C2934xea.a(C2743upa.class, upa);
    }

    private C2743upa() {
    }

    /* access modifiers changed from: private */
    public final void a(a aVar) {
        this.zzccn = aVar.a();
        this.zzdt |= 2;
    }

    /* access modifiers changed from: private */
    public final void a(c cVar) {
        this.zzbzz = cVar.a();
        this.zzdt |= 1;
    }

    public static b o() {
        return (b) zzcco.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2743upa();
            case 2:
                return new b((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcco, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzdt", "zzbzz", c.c(), "zzccn", a.c()});
            case 4:
                return zzcco;
            case 5:
                C2440qfa<C2743upa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2743upa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcco);
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
