package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class MV extends C2934xea<MV, b> implements C2014kfa {
    private static volatile C2440qfa<MV> zzei;
    private static final Dea<Integer, a> zzhqn = new LV();
    /* access modifiers changed from: private */
    public static final MV zzhqr;
    private int zzdt;
    private Eea zzhqm = C2934xea.l();
    private String zzhqo = BuildConfig.FLAVOR;
    private String zzhqp = BuildConfig.FLAVOR;
    private String zzhqq = BuildConfig.FLAVOR;

    public enum a implements C3076zea {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        

        /* renamed from: c  reason: collision with root package name */
        private static final Cea<a> f7852c = null;

        /* renamed from: e  reason: collision with root package name */
        private final int f7854e;

        static {
            f7852c = new PV();
        }

        private a(int i) {
            this.f7854e = i;
        }

        public static a a(int i) {
            if (i == 1) {
                return BLOCKED_REASON_UNKNOWN;
            }
            if (i != 2) {
                return null;
            }
            return BLOCKED_REASON_BACKGROUND;
        }

        public static Bea c() {
            return OV.f8096a;
        }

        public final int a() {
            return this.f7854e;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f7854e + " name=" + name() + '>';
        }
    }

    public static final class b extends C2934xea.a<MV, b> implements C2014kfa {
        private b() {
            super(MV.zzhqr);
        }

        /* synthetic */ b(LV lv) {
            this();
        }

        public final b a(a aVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((MV) this.f12784b).a(aVar);
            return this;
        }

        public final b a(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((MV) this.f12784b).a(str);
            return this;
        }
    }

    static {
        MV mv = new MV();
        zzhqr = mv;
        C2934xea.a(MV.class, mv);
    }

    private MV() {
    }

    /* access modifiers changed from: private */
    public final void a(a aVar) {
        aVar.getClass();
        Eea eea = this.zzhqm;
        if (!eea.n()) {
            this.zzhqm = C2934xea.a(eea);
        }
        this.zzhqm.e(aVar.a());
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzdt |= 1;
        this.zzhqo = str;
    }

    public static b o() {
        return (b) zzhqr.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (NV.f7975a[i - 1]) {
            case 1:
                return new MV();
            case 2:
                return new b((LV) null);
            case 3:
                return C2934xea.a((C1872ifa) zzhqr, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzdt", "zzhqm", a.c(), "zzhqo", "zzhqp", "zzhqq"});
            case 4:
                return zzhqr;
            case 5:
                C2440qfa<MV> qfa = zzei;
                if (qfa == null) {
                    synchronized (MV.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzhqr);
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
