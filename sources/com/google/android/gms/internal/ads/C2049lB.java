package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.lB  reason: case insensitive filesystem */
public final class C2049lB extends C2934xea<C2049lB, a> implements C2014kfa {
    private static volatile C2440qfa<C2049lB> zzei;
    /* access modifiers changed from: private */
    public static final C2049lB zzmc;
    private int zzdt;
    private String zzfi = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.ads.lB$a */
    public static final class a extends C2934xea.a<C2049lB, a> implements C2014kfa {
        private a() {
            super(C2049lB.zzmc);
        }

        /* synthetic */ a(HA ha) {
            this();
        }
    }

    static {
        C2049lB lBVar = new C2049lB();
        zzmc = lBVar;
        C2934xea.a(C2049lB.class, lBVar);
    }

    private C2049lB() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (HA.f7115a[i - 1]) {
            case 1:
                return new C2049lB();
            case 2:
                return new a((HA) null);
            case 3:
                return C2934xea.a((C1872ifa) zzmc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzdt", "zzfi"});
            case 4:
                return zzmc;
            case 5:
                C2440qfa<C2049lB> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2049lB.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzmc);
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
