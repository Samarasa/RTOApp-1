package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.google.android.gms.internal.ads.MV;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class QV extends C2934xea<QV, a> implements C2014kfa {
    private static volatile C2440qfa<QV> zzei;
    /* access modifiers changed from: private */
    public static final QV zzhqy;
    private int zzdt;
    private String zzdu = BuildConfig.FLAVOR;
    private int zzhqv;
    private String zzhqw = BuildConfig.FLAVOR;
    private MV zzhqx;

    public static final class a extends C2934xea.a<QV, a> implements C2014kfa {
        private a() {
            super(QV.zzhqy);
        }

        /* synthetic */ a(RV rv) {
            this();
        }

        public final a a(MV.b bVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((QV) this.f12784b).a((MV) bVar.k());
            return this;
        }

        public final a a(b bVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((QV) this.f12784b).a(bVar);
            return this;
        }

        public final a a(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((QV) this.f12784b).a(str);
            return this;
        }
    }

    public enum b implements C3076zea {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        

        /* renamed from: c  reason: collision with root package name */
        private static final Cea<b> f8351c = null;

        /* renamed from: e  reason: collision with root package name */
        private final int f8353e;

        static {
            f8351c = new SV();
        }

        private b(int i) {
            this.f8353e = i;
        }

        public static b a(int i) {
            if (i == 0) {
                return EVENT_TYPE_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }

        public static Bea c() {
            return UV.f8908a;
        }

        public final int a() {
            return this.f8353e;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8353e + " name=" + name() + '>';
        }
    }

    static {
        QV qv = new QV();
        zzhqy = qv;
        C2934xea.a(QV.class, qv);
    }

    private QV() {
    }

    /* access modifiers changed from: private */
    public final void a(MV mv) {
        mv.getClass();
        this.zzhqx = mv;
        this.zzdt |= 8;
    }

    /* access modifiers changed from: private */
    public final void a(b bVar) {
        this.zzhqv = bVar.a();
        this.zzdt |= 1;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzdt |= 2;
        this.zzdu = str;
    }

    public static a o() {
        return (a) zzhqy.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (RV.f8474a[i - 1]) {
            case 1:
                return new QV();
            case 2:
                return new a((RV) null);
            case 3:
                return C2934xea.a((C1872ifa) zzhqy, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzdt", "zzhqv", b.c(), "zzdu", "zzhqw", "zzhqx"});
            case 4:
                return zzhqy;
            case 5:
                C2440qfa<QV> qfa = zzei;
                if (qfa == null) {
                    synchronized (QV.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzhqy);
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
