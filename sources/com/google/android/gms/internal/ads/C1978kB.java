package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.kB  reason: case insensitive filesystem */
public final class C1978kB extends C2934xea<C1978kB, a> implements C2014kfa {
    private static volatile C2440qfa<C1978kB> zzei;
    /* access modifiers changed from: private */
    public static final C1978kB zzmb;
    private int zzdt;
    private long zzkx;
    private String zzlz = BuildConfig.FLAVOR;
    private Lda zzma = Lda.f7691a;

    /* renamed from: com.google.android.gms.internal.ads.kB$a */
    public static final class a extends C2934xea.a<C1978kB, a> implements C2014kfa {
        private a() {
            super(C1978kB.zzmb);
        }

        /* synthetic */ a(HA ha) {
            this();
        }
    }

    static {
        C1978kB kBVar = new C1978kB();
        zzmb = kBVar;
        C2934xea.a(C1978kB.class, kBVar);
    }

    private C1978kB() {
    }

    public static C1978kB q() {
        return zzmb;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (HA.f7115a[i - 1]) {
            case 1:
                return new C1978kB();
            case 2:
                return new a((HA) null);
            case 3:
                return C2934xea.a((C1872ifa) zzmb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzdt", "zzkx", "zzlz", "zzma"});
            case 4:
                return zzmb;
            case 5:
                C2440qfa<C1978kB> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1978kB.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzmb);
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

    public final boolean o() {
        return (this.zzdt & 1) != 0;
    }

    public final long p() {
        return this.zzkx;
    }
}
