package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1538dpa;
import com.google.android.gms.internal.ads.C2318opa;
import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.qpa  reason: case insensitive filesystem */
public final class C2460qpa extends C2934xea<C2460qpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2460qpa zzccc;
    private static volatile C2440qfa<C2460qpa> zzei;
    private int zzcbp;
    private String zzcbq = BuildConfig.FLAVOR;
    private int zzcbr;
    private int zzcbs = 1000;
    private Cpa zzcbt;
    private Gea zzcbu = C2934xea.m();
    private C2318opa zzcbv;
    private C2389ppa zzcbw;
    private C2743upa zzcbx;
    private C1538dpa zzcby;
    private C2885wpa zzcbz;
    private C1892ipa zzcca;
    private C1963jpa zzccb;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.qpa$a */
    public static final class a extends C2934xea.a<C2460qpa, a> implements C2014kfa {
        private a() {
            super(C2460qpa.zzccc);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }

        public final a a(C1538dpa.b bVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2460qpa) this.f12784b).a((C1538dpa) bVar.k());
            return this;
        }

        public final a a(C1892ipa ipa) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2460qpa) this.f12784b).a(ipa);
            return this;
        }

        public final a a(C1963jpa jpa) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2460qpa) this.f12784b).a(jpa);
            return this;
        }

        public final a a(C2318opa.a aVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2460qpa) this.f12784b).a((C2318opa) aVar.k());
            return this;
        }

        public final a a(C2885wpa wpa) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2460qpa) this.f12784b).a(wpa);
            return this;
        }

        public final a a(Iterable<? extends Long> iterable) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2460qpa) this.f12784b).a(iterable);
            return this;
        }

        public final a a(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2460qpa) this.f12784b).a(str);
            return this;
        }

        public final String l() {
            return ((C2460qpa) this.f12784b).o();
        }

        public final C2318opa m() {
            return ((C2460qpa) this.f12784b).p();
        }

        public final C1538dpa n() {
            return ((C2460qpa) this.f12784b).q();
        }

        public final a o() {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2460qpa) this.f12784b).t();
            return this;
        }
    }

    static {
        C2460qpa qpa = new C2460qpa();
        zzccc = qpa;
        C2934xea.a(C2460qpa.class, qpa);
    }

    private C2460qpa() {
    }

    /* access modifiers changed from: private */
    public final void a(C1538dpa dpa) {
        dpa.getClass();
        this.zzcby = dpa;
        this.zzdt |= 256;
    }

    /* access modifiers changed from: private */
    public final void a(C1892ipa ipa) {
        ipa.getClass();
        this.zzcca = ipa;
        this.zzdt |= 1024;
    }

    /* access modifiers changed from: private */
    public final void a(C1963jpa jpa) {
        jpa.getClass();
        this.zzccb = jpa;
        this.zzdt |= 2048;
    }

    /* access modifiers changed from: private */
    public final void a(C2318opa opa) {
        opa.getClass();
        this.zzcbv = opa;
        this.zzdt |= 32;
    }

    /* access modifiers changed from: private */
    public final void a(C2885wpa wpa) {
        wpa.getClass();
        this.zzcbz = wpa;
        this.zzdt |= 512;
    }

    /* access modifiers changed from: private */
    public final void a(Iterable<? extends Long> iterable) {
        Gea gea = this.zzcbu;
        if (!gea.n()) {
            int size = gea.size();
            this.zzcbu = gea.g(size == 0 ? 10 : size << 1);
        }
        Cda.a(iterable, this.zzcbu);
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzdt |= 2;
        this.zzcbq = str;
    }

    public static a r() {
        return (a) zzccc.j();
    }

    /* access modifiers changed from: private */
    public final void t() {
        this.zzcbu = C2934xea.m();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2460qpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzccc, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzdt", "zzcbp", "zzcbq", "zzcbr", "zzcbs", Rpa.c(), "zzcbt", "zzcbu", "zzcbv", "zzcbw", "zzcbx", "zzcby", "zzcbz", "zzcca", "zzccb"});
            case 4:
                return zzccc;
            case 5:
                C2440qfa<C2460qpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2460qpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzccc);
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

    public final String o() {
        return this.zzcbq;
    }

    public final C2318opa p() {
        C2318opa opa = this.zzcbv;
        return opa == null ? C2318opa.o() : opa;
    }

    public final C1538dpa q() {
        C1538dpa dpa = this.zzcby;
        return dpa == null ? C1538dpa.p() : dpa;
    }
}
