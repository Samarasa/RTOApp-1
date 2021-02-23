package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.lpa  reason: case insensitive filesystem */
public final class C2105lpa extends C2934xea<C2105lpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2105lpa zzcaf;
    private static volatile C2440qfa<C2105lpa> zzei;
    private String zzcac = BuildConfig.FLAVOR;
    private Fea<C2034kpa> zzcad = C2934xea.n();
    private int zzcae;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.lpa$a */
    public static final class a extends C2934xea.a<C2105lpa, a> implements C2014kfa {
        private a() {
            super(C2105lpa.zzcaf);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C2105lpa lpa = new C2105lpa();
        zzcaf = lpa;
        C2934xea.a(C2105lpa.class, lpa);
    }

    private C2105lpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2105lpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcaf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zzdt", "zzcac", "zzcad", C2034kpa.class, "zzcae", Rpa.c()});
            case 4:
                return zzcaf;
            case 5:
                C2440qfa<C2105lpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2105lpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcaf);
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
