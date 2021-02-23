package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class Apa extends C2934xea<Apa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final Apa zzceu;
    private static volatile C2440qfa<Apa> zzei;
    private String zzccd = BuildConfig.FLAVOR;
    private int zzcce;
    private Bpa zzccg;
    private int zzdt;

    public static final class a extends C2934xea.a<Apa, a> implements C2014kfa {
        private a() {
            super(Apa.zzceu);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }
    }

    static {
        Apa apa = new Apa();
        zzceu = apa;
        C2934xea.a(Apa.class, apa);
    }

    private Apa() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new Apa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzceu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzdt", "zzccd", "zzcce", Rpa.c(), "zzccg"});
            case 4:
                return zzceu;
            case 5:
                C2440qfa<Apa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Apa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzceu);
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
