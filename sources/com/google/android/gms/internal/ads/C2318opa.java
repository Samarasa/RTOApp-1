package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.opa  reason: case insensitive filesystem */
public final class C2318opa extends C2934xea<C2318opa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2318opa zzcbb;
    private static volatile C2440qfa<C2318opa> zzei;
    private String zzcat = BuildConfig.FLAVOR;
    private Bpa zzcau;
    private int zzcav;
    private Cpa zzcaw;
    private int zzcax;
    private int zzcay = 1000;
    private int zzcaz = 1000;
    private int zzcba = 1000;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.opa$a */
    public static final class a extends C2934xea.a<C2318opa, a> implements C2014kfa {
        private a() {
            super(C2318opa.zzcbb);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }

        public final a a(Cpa cpa) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2318opa) this.f12784b).a(cpa);
            return this;
        }

        public final a a(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2318opa) this.f12784b).a(str);
            return this;
        }
    }

    static {
        C2318opa opa = new C2318opa();
        zzcbb = opa;
        C2934xea.a(C2318opa.class, opa);
    }

    private C2318opa() {
    }

    /* access modifiers changed from: private */
    public final void a(Cpa cpa) {
        cpa.getClass();
        this.zzcaw = cpa;
        this.zzdt |= 8;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzdt |= 1;
        this.zzcat = str;
    }

    public static C2318opa o() {
        return zzcbb;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2318opa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcbb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzdt", "zzcat", "zzcau", "zzcav", "zzcaw", "zzcax", "zzcay", Rpa.c(), "zzcaz", Rpa.c(), "zzcba", Rpa.c()});
            case 4:
                return zzcbb;
            case 5:
                C2440qfa<C2318opa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2318opa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcbb);
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
