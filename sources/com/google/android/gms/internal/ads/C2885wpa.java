package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2034kpa;
import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.wpa  reason: case insensitive filesystem */
public final class C2885wpa extends C2934xea<C2885wpa, b> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2885wpa zzcdg;
    private static volatile C2440qfa<C2885wpa> zzei;
    private Fea<a> zzbyy = C2934xea.n();
    private int zzcdb;
    private int zzcdc;
    private long zzcdd;
    private String zzcde = BuildConfig.FLAVOR;
    private long zzcdf;
    private int zzdt;
    private String zzdu = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.ads.wpa$a */
    public static final class a extends C2934xea<a, C0085a> implements C2014kfa {
        private static final Dea<Integer, C2034kpa.a> zzcdm = new Xpa();
        /* access modifiers changed from: private */
        public static final a zzcdu;
        private static volatile C2440qfa<a> zzei;
        private long zzcdh;
        private int zzcdi;
        private long zzcdj;
        private long zzcdk;
        private Eea zzcdl = C2934xea.l();
        private C2743upa zzcdn;
        private int zzcdo;
        private int zzcdp;
        private int zzcdq;
        private int zzcdr;
        private int zzcds;
        private int zzcdt;
        private int zzdt;

        /* renamed from: com.google.android.gms.internal.ads.wpa$a$a  reason: collision with other inner class name */
        public static final class C0085a extends C2934xea.a<a, C0085a> implements C2014kfa {
            private C0085a() {
                super(a.zzcdu);
            }

            /* synthetic */ C0085a(C1468cpa cpa) {
                this();
            }

            public final C0085a a(int i) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).b(i);
                return this;
            }

            public final C0085a a(long j) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).a(j);
                return this;
            }

            public final C0085a a(Rpa rpa) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).a(rpa);
                return this;
            }

            public final C0085a a(C2743upa upa) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).a(upa);
                return this;
            }

            public final C0085a a(c cVar) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).a(cVar);
                return this;
            }

            public final C0085a a(Iterable<? extends C2034kpa.a> iterable) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).a(iterable);
                return this;
            }

            public final C0085a b(long j) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).b(j);
                return this;
            }

            public final C0085a b(Rpa rpa) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).b(rpa);
                return this;
            }

            public final C0085a c(long j) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).c(j);
                return this;
            }

            public final C0085a c(Rpa rpa) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).c(rpa);
                return this;
            }

            public final C0085a d(Rpa rpa) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).d(rpa);
                return this;
            }

            public final C0085a e(Rpa rpa) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).e(rpa);
                return this;
            }
        }

        static {
            a aVar = new a();
            zzcdu = aVar;
            C2934xea.a(a.class, aVar);
        }

        private a() {
        }

        public static a a(byte[] bArr) {
            return (a) C2934xea.a(zzcdu, bArr);
        }

        /* access modifiers changed from: private */
        public final void a(long j) {
            this.zzdt |= 1;
            this.zzcdh = j;
        }

        /* access modifiers changed from: private */
        public final void a(Rpa rpa) {
            this.zzcdi = rpa.a();
            this.zzdt |= 2;
        }

        /* access modifiers changed from: private */
        public final void a(C2743upa upa) {
            upa.getClass();
            this.zzcdn = upa;
            this.zzdt |= 16;
        }

        /* access modifiers changed from: private */
        public final void a(c cVar) {
            this.zzcdt = cVar.a();
            this.zzdt |= 1024;
        }

        /* access modifiers changed from: private */
        public final void a(Iterable<? extends C2034kpa.a> iterable) {
            Eea eea = this.zzcdl;
            if (!eea.n()) {
                this.zzcdl = C2934xea.a(eea);
            }
            for (C2034kpa.a a2 : iterable) {
                this.zzcdl.e(a2.a());
            }
        }

        /* access modifiers changed from: private */
        public final void b(int i) {
            this.zzdt |= 256;
            this.zzcdr = i;
        }

        /* access modifiers changed from: private */
        public final void b(long j) {
            this.zzdt |= 4;
            this.zzcdj = j;
        }

        /* access modifiers changed from: private */
        public final void b(Rpa rpa) {
            this.zzcdo = rpa.a();
            this.zzdt |= 32;
        }

        /* access modifiers changed from: private */
        public final void c(long j) {
            this.zzdt |= 8;
            this.zzcdk = j;
        }

        /* access modifiers changed from: private */
        public final void c(Rpa rpa) {
            this.zzcdp = rpa.a();
            this.zzdt |= 64;
        }

        /* access modifiers changed from: private */
        public final void d(Rpa rpa) {
            this.zzcdq = rpa.a();
            this.zzdt |= 128;
        }

        /* access modifiers changed from: private */
        public final void e(Rpa rpa) {
            this.zzcds = rpa.a();
            this.zzdt |= 512;
        }

        public static C0085a q() {
            return (C0085a) zzcdu.j();
        }

        /* access modifiers changed from: protected */
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1468cpa.f10089a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0085a((C1468cpa) null);
                case 3:
                    return C2934xea.a((C1872ifa) zzcdu, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzdt", "zzcdh", "zzcdi", Rpa.c(), "zzcdj", "zzcdk", "zzcdl", C2034kpa.a.c(), "zzcdn", "zzcdo", Rpa.c(), "zzcdp", Rpa.c(), "zzcdq", Rpa.c(), "zzcdr", "zzcds", Rpa.c(), "zzcdt", c.c()});
                case 4:
                    return zzcdu;
                case 5:
                    C2440qfa<a> qfa = zzei;
                    if (qfa == null) {
                        synchronized (a.class) {
                            qfa = zzei;
                            if (qfa == null) {
                                qfa = new C2934xea.c<>(zzcdu);
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

        public final long o() {
            return this.zzcdh;
        }

        public final Rpa p() {
            Rpa a2 = Rpa.a(this.zzcdi);
            return a2 == null ? Rpa.ENUM_FALSE : a2;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.wpa$b */
    public static final class b extends C2934xea.a<C2885wpa, b> implements C2014kfa {
        private b() {
            super(C2885wpa.zzcdg);
        }

        /* synthetic */ b(C1468cpa cpa) {
            this();
        }

        public final b a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2885wpa) this.f12784b).b(i);
            return this;
        }

        public final b a(long j) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2885wpa) this.f12784b).a(j);
            return this;
        }

        public final b a(Iterable<? extends a> iterable) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2885wpa) this.f12784b).a(iterable);
            return this;
        }

        public final b a(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2885wpa) this.f12784b).b(str);
            return this;
        }

        public final b b(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2885wpa) this.f12784b).c(i);
            return this;
        }

        public final b b(long j) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2885wpa) this.f12784b).b(j);
            return this;
        }

        public final b b(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2885wpa) this.f12784b).a(str);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.wpa$c */
    public enum c implements C3076zea {
        UNSPECIFIED(0),
        CONNECTING(1),
        CONNECTED(2),
        DISCONNECTING(3),
        DISCONNECTED(4),
        SUSPENDED(5);
        

        /* renamed from: g  reason: collision with root package name */
        private static final Cea<c> f12712g = null;
        private final int i;

        static {
            f12712g = new Ypa();
        }

        private c(int i2) {
            this.i = i2;
        }

        public static c a(int i2) {
            if (i2 == 0) {
                return UNSPECIFIED;
            }
            if (i2 == 1) {
                return CONNECTING;
            }
            if (i2 == 2) {
                return CONNECTED;
            }
            if (i2 == 3) {
                return DISCONNECTING;
            }
            if (i2 == 4) {
                return DISCONNECTED;
            }
            if (i2 != 5) {
                return null;
            }
            return SUSPENDED;
        }

        public static Bea c() {
            return Zpa.f9592a;
        }

        public final int a() {
            return this.i;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.i + " name=" + name() + '>';
        }
    }

    static {
        C2885wpa wpa = new C2885wpa();
        zzcdg = wpa;
        C2934xea.a(C2885wpa.class, wpa);
    }

    private C2885wpa() {
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzdt |= 4;
        this.zzcdd = j;
    }

    /* access modifiers changed from: private */
    public final void a(Iterable<? extends a> iterable) {
        Fea<a> fea = this.zzbyy;
        if (!fea.n()) {
            this.zzbyy = C2934xea.a(fea);
        }
        Cda.a(iterable, this.zzbyy);
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzdt |= 16;
        this.zzcde = str;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zzdt |= 1;
        this.zzcdb = i;
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        this.zzdt |= 32;
        this.zzcdf = j;
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        str.getClass();
        this.zzdt |= 8;
        this.zzdu = str;
    }

    /* access modifiers changed from: private */
    public final void c(int i) {
        this.zzdt |= 2;
        this.zzcdc = i;
    }

    public static b o() {
        return (b) zzcdg.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2885wpa();
            case 2:
                return new b((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcdg, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzdt", "zzbyy", a.class, "zzcdb", "zzcdc", "zzcdd", "zzdu", "zzcde", "zzcdf"});
            case 4:
                return zzcdg;
            case 5:
                C2440qfa<C2885wpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2885wpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcdg);
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
