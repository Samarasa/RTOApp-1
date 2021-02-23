package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.mpa  reason: case insensitive filesystem */
public final class C2176mpa extends C2934xea<C2176mpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2176mpa zzcal;
    private static volatile C2440qfa<C2176mpa> zzei;
    private String zzcag = BuildConfig.FLAVOR;
    private Fea<C2034kpa> zzcah = C2934xea.n();
    private int zzcai = 1000;
    private int zzcaj = 1000;
    private int zzcak = 1000;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.mpa$a */
    public static final class a extends C2934xea.a<C2176mpa, a> implements C2014kfa {
        private a() {
            super(C2176mpa.zzcal);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }

        public final a a(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2176mpa) this.f12784b).a(str);
            return this;
        }
    }

    static {
        C2176mpa mpa = new C2176mpa();
        zzcal = mpa;
        C2934xea.a(C2176mpa.class, mpa);
    }

    private C2176mpa() {
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzdt |= 1;
        this.zzcag = str;
    }

    public static C2176mpa o() {
        return zzcal;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2176mpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcal, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzdt", "zzcag", "zzcah", C2034kpa.class, "zzcai", Rpa.c(), "zzcaj", Rpa.c(), "zzcak", Rpa.c()});
            case 4:
                return zzcal;
            case 5:
                C2440qfa<C2176mpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2176mpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcal);
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
