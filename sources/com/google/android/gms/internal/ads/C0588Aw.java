package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Aw  reason: case insensitive filesystem */
public final class C0588Aw extends C2934xea<C0588Aw, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C0588Aw zzeh;
    private static volatile C2440qfa<C0588Aw> zzei;
    private int zzdt;
    private String zzdu = BuildConfig.FLAVOR;
    private long zzdv;
    private String zzdw = BuildConfig.FLAVOR;
    private String zzdx = BuildConfig.FLAVOR;
    private String zzdy = BuildConfig.FLAVOR;
    private long zzdz;
    private long zzea;
    private String zzeb = BuildConfig.FLAVOR;
    private long zzec;
    private String zzed = BuildConfig.FLAVOR;
    private String zzee = BuildConfig.FLAVOR;
    private Fea<b> zzef = C2934xea.n();
    private int zzeg;

    /* renamed from: com.google.android.gms.internal.ads.Aw$a */
    public static final class a extends C2934xea.a<C0588Aw, a> implements C2014kfa {
        private a() {
            super(C0588Aw.zzeh);
        }

        /* synthetic */ a(C1263_v _vVar) {
            this();
        }

        public final a a(long j) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C0588Aw) this.f12784b).a(j);
            return this;
        }

        public final a a(c cVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C0588Aw) this.f12784b).a(cVar);
            return this;
        }

        public final a a(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C0588Aw) this.f12784b).a(str);
            return this;
        }

        public final a b(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C0588Aw) this.f12784b).b(str);
            return this;
        }

        public final a c(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C0588Aw) this.f12784b).c(str);
            return this;
        }

        public final a d(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C0588Aw) this.f12784b).d(str);
            return this;
        }

        public final a e(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C0588Aw) this.f12784b).e(str);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.Aw$b */
    public static final class b extends C2934xea<b, a> implements C2014kfa {
        private static volatile C2440qfa<b> zzei;
        /* access modifiers changed from: private */
        public static final b zzel;
        private int zzdt;
        private String zzej = BuildConfig.FLAVOR;
        private String zzek = BuildConfig.FLAVOR;

        /* renamed from: com.google.android.gms.internal.ads.Aw$b$a */
        public static final class a extends C2934xea.a<b, a> implements C2014kfa {
            private a() {
                super(b.zzel);
            }

            /* synthetic */ a(C1263_v _vVar) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzel = bVar;
            C2934xea.a(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: protected */
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1263_v.f9748a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a((C1263_v) null);
                case 3:
                    return C2934xea.a((C1872ifa) zzel, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzdt", "zzej", "zzek"});
                case 4:
                    return zzel;
                case 5:
                    C2440qfa<b> qfa = zzei;
                    if (qfa == null) {
                        synchronized (b.class) {
                            qfa = zzei;
                            if (qfa == null) {
                                qfa = new C2934xea.c<>(zzel);
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

    /* renamed from: com.google.android.gms.internal.ads.Aw$c */
    public enum c implements C3076zea {
        UNKNOWN(0),
        ENABLED(1),
        DISABLED(2);
        

        /* renamed from: d  reason: collision with root package name */
        private static final Cea<c> f6228d = null;

        /* renamed from: f  reason: collision with root package name */
        private final int f6230f;

        static {
            f6228d = new C1336ax();
        }

        private c(int i) {
            this.f6230f = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ENABLED;
            }
            if (i != 2) {
                return null;
            }
            return DISABLED;
        }

        public static Bea c() {
            return C1549dy.f10215a;
        }

        public final int a() {
            return this.f6230f;
        }

        public final String toString() {
            return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f6230f + " name=" + name() + '>';
        }
    }

    static {
        C0588Aw aw = new C0588Aw();
        zzeh = aw;
        C2934xea.a(C0588Aw.class, aw);
    }

    private C0588Aw() {
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzdt |= 2;
        this.zzdv = j;
    }

    /* access modifiers changed from: private */
    public final void a(c cVar) {
        this.zzeg = cVar.a();
        this.zzdt |= 2048;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzdt |= 1;
        this.zzdu = str;
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        str.getClass();
        this.zzdt |= 4;
        this.zzdw = str;
    }

    /* access modifiers changed from: private */
    public final void c(String str) {
        str.getClass();
        this.zzdt |= 8;
        this.zzdx = str;
    }

    /* access modifiers changed from: private */
    public final void d(String str) {
        str.getClass();
        this.zzdt |= 16;
        this.zzdy = str;
    }

    /* access modifiers changed from: private */
    public final void e(String str) {
        str.getClass();
        this.zzdt |= 1024;
        this.zzee = str;
    }

    public static a o() {
        return (a) zzeh.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1263_v.f9748a[i - 1]) {
            case 1:
                return new C0588Aw();
            case 2:
                return new a((C1263_v) null);
            case 3:
                return C2934xea.a((C1872ifa) zzeh, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzdt", "zzdu", "zzdv", "zzdw", "zzdx", "zzdy", "zzdz", "zzea", "zzeb", "zzec", "zzed", "zzee", "zzef", b.class, "zzeg", c.c()});
            case 4:
                return zzeh;
            case 5:
                C2440qfa<C0588Aw> qfa = zzei;
                if (qfa == null) {
                    synchronized (C0588Aw.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzeh);
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
