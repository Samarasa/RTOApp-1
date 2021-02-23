package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.rpa  reason: case insensitive filesystem */
public final class C2530rpa extends C2934xea<C2530rpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2530rpa zzcch;
    private static volatile C2440qfa<C2530rpa> zzei;
    private String zzccd = BuildConfig.FLAVOR;
    private int zzcce;
    private Eea zzccf = C2934xea.l();
    private Bpa zzccg;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.rpa$a */
    public static final class a extends C2934xea.a<C2530rpa, a> implements C2014kfa {
        private a() {
            super(C2530rpa.zzcch);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        C2530rpa rpa = new C2530rpa();
        zzcch = rpa;
        C2934xea.a(C2530rpa.class, rpa);
    }

    private C2530rpa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C2530rpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcch, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzdt", "zzccd", "zzcce", Rpa.c(), "zzccf", "zzccg"});
            case 4:
                return zzcch;
            case 5:
                C2440qfa<C2530rpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2530rpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcch);
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
