package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.jpa  reason: case insensitive filesystem */
public final class C1963jpa extends C2934xea<C1963jpa, c> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C1963jpa zzbyz;
    private static volatile C2440qfa<C1963jpa> zzei;
    private Fea<a> zzbyy = C2934xea.n();

    /* renamed from: com.google.android.gms.internal.ads.jpa$a */
    public static final class a extends C2934xea<a, C0081a> implements C2014kfa {
        /* access modifiers changed from: private */
        public static final a zzbzd;
        private static volatile C2440qfa<a> zzei;
        private int zzbza;
        private d zzbzb;
        private e zzbzc;
        private int zzdt;

        /* renamed from: com.google.android.gms.internal.ads.jpa$a$a  reason: collision with other inner class name */
        public static final class C0081a extends C2934xea.a<a, C0081a> implements C2014kfa {
            private C0081a() {
                super(a.zzbzd);
            }

            /* synthetic */ C0081a(C1468cpa cpa) {
                this();
            }

            public final C0081a a(b bVar) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).a(bVar);
                return this;
            }

            public final C0081a a(d.a aVar) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).a((d) aVar.k());
                return this;
            }

            public final C0081a a(e.a aVar) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((a) this.f12784b).a((e) aVar.k());
                return this;
            }
        }

        static {
            a aVar = new a();
            zzbzd = aVar;
            C2934xea.a(a.class, aVar);
        }

        private a() {
        }

        /* access modifiers changed from: private */
        public final void a(b bVar) {
            this.zzbza = bVar.a();
            this.zzdt |= 1;
        }

        /* access modifiers changed from: private */
        public final void a(d dVar) {
            dVar.getClass();
            this.zzbzb = dVar;
            this.zzdt |= 2;
        }

        /* access modifiers changed from: private */
        public final void a(e eVar) {
            eVar.getClass();
            this.zzbzc = eVar;
            this.zzdt |= 4;
        }

        public static C0081a o() {
            return (C0081a) zzbzd.j();
        }

        /* access modifiers changed from: protected */
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1468cpa.f10089a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0081a((C1468cpa) null);
                case 3:
                    return C2934xea.a((C1872ifa) zzbzd, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdt", "zzbza", b.c(), "zzbzb", "zzbzc"});
                case 4:
                    return zzbzd;
                case 5:
                    C2440qfa<a> qfa = zzei;
                    if (qfa == null) {
                        synchronized (a.class) {
                            qfa = zzei;
                            if (qfa == null) {
                                qfa = new C2934xea.c<>(zzbzd);
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

    /* renamed from: com.google.android.gms.internal.ads.jpa$b */
    public enum b implements C3076zea {
        UNSPECIFIED(0),
        IN_MEMORY(1);
        

        /* renamed from: c  reason: collision with root package name */
        private static final Cea<b> f11010c = null;

        /* renamed from: e  reason: collision with root package name */
        private final int f11012e;

        static {
            f11010c = new Lpa();
        }

        private b(int i) {
            this.f11012e = i;
        }

        public static b a(int i) {
            if (i == 0) {
                return UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return IN_MEMORY;
        }

        public static Bea c() {
            return Kpa.f7624a;
        }

        public final int a() {
            return this.f11012e;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11012e + " name=" + name() + '>';
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.jpa$c */
    public static final class c extends C2934xea.a<C1963jpa, c> implements C2014kfa {
        private c() {
            super(C1963jpa.zzbyz);
        }

        /* synthetic */ c(C1468cpa cpa) {
            this();
        }

        public final c a(a.C0081a aVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1963jpa) this.f12784b).a((a) aVar.k());
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.jpa$d */
    public static final class d extends C2934xea<d, a> implements C2014kfa {
        /* access modifiers changed from: private */
        public static final d zzbzj;
        private static volatile C2440qfa<d> zzei;
        private boolean zzbzh;
        private int zzbzi;
        private int zzdt;

        /* renamed from: com.google.android.gms.internal.ads.jpa$d$a */
        public static final class a extends C2934xea.a<d, a> implements C2014kfa {
            private a() {
                super(d.zzbzj);
            }

            /* synthetic */ a(C1468cpa cpa) {
                this();
            }

            public final a a(int i) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((d) this.f12784b).b(i);
                return this;
            }

            public final a a(boolean z) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((d) this.f12784b).a(z);
                return this;
            }
        }

        static {
            d dVar = new d();
            zzbzj = dVar;
            C2934xea.a(d.class, dVar);
        }

        private d() {
        }

        /* access modifiers changed from: private */
        public final void a(boolean z) {
            this.zzdt |= 1;
            this.zzbzh = z;
        }

        /* access modifiers changed from: private */
        public final void b(int i) {
            this.zzdt |= 2;
            this.zzbzi = i;
        }

        public static a o() {
            return (a) zzbzj.j();
        }

        /* access modifiers changed from: protected */
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1468cpa.f10089a[i - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new a((C1468cpa) null);
                case 3:
                    return C2934xea.a((C1872ifa) zzbzj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzdt", "zzbzh", "zzbzi"});
                case 4:
                    return zzbzj;
                case 5:
                    C2440qfa<d> qfa = zzei;
                    if (qfa == null) {
                        synchronized (d.class) {
                            qfa = zzei;
                            if (qfa == null) {
                                qfa = new C2934xea.c<>(zzbzj);
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

    /* renamed from: com.google.android.gms.internal.ads.jpa$e */
    public static final class e extends C2934xea<e, a> implements C2014kfa {
        /* access modifiers changed from: private */
        public static final e zzbzm;
        private static volatile C2440qfa<e> zzei;
        private int zzbzi;
        private boolean zzbzk;
        private boolean zzbzl;
        private int zzdt;

        /* renamed from: com.google.android.gms.internal.ads.jpa$e$a */
        public static final class a extends C2934xea.a<e, a> implements C2014kfa {
            private a() {
                super(e.zzbzm);
            }

            /* synthetic */ a(C1468cpa cpa) {
                this();
            }

            public final a a(int i) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((e) this.f12784b).b(i);
                return this;
            }

            public final a a(boolean z) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((e) this.f12784b).a(z);
                return this;
            }

            public final a b(boolean z) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((e) this.f12784b).b(z);
                return this;
            }
        }

        static {
            e eVar = new e();
            zzbzm = eVar;
            C2934xea.a(e.class, eVar);
        }

        private e() {
        }

        /* access modifiers changed from: private */
        public final void a(boolean z) {
            this.zzdt |= 1;
            this.zzbzk = z;
        }

        /* access modifiers changed from: private */
        public final void b(int i) {
            this.zzdt |= 4;
            this.zzbzi = i;
        }

        /* access modifiers changed from: private */
        public final void b(boolean z) {
            this.zzdt |= 2;
            this.zzbzl = z;
        }

        public static a o() {
            return (a) zzbzm.j();
        }

        /* access modifiers changed from: protected */
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1468cpa.f10089a[i - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new a((C1468cpa) null);
                case 3:
                    return C2934xea.a((C1872ifa) zzbzm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzdt", "zzbzk", "zzbzl", "zzbzi"});
                case 4:
                    return zzbzm;
                case 5:
                    C2440qfa<e> qfa = zzei;
                    if (qfa == null) {
                        synchronized (e.class) {
                            qfa = zzei;
                            if (qfa == null) {
                                qfa = new C2934xea.c<>(zzbzm);
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

    static {
        C1963jpa jpa = new C1963jpa();
        zzbyz = jpa;
        C2934xea.a(C1963jpa.class, jpa);
    }

    private C1963jpa() {
    }

    /* access modifiers changed from: private */
    public final void a(a aVar) {
        aVar.getClass();
        Fea<a> fea = this.zzbyy;
        if (!fea.n()) {
            this.zzbyy = C2934xea.a(fea);
        }
        this.zzbyy.add(aVar);
    }

    public static c o() {
        return (c) zzbyz.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C1963jpa();
            case 2:
                return new c((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzbyz, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbyy", a.class});
            case 4:
                return zzbyz;
            case 5:
                C2440qfa<C1963jpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1963jpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzbyz);
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
