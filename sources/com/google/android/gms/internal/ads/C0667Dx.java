package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.Dx  reason: case insensitive filesystem */
public final class C0667Dx extends C2934xea<C0667Dx, a> implements C2014kfa {
    private static volatile C2440qfa<C0667Dx> zzei;
    /* access modifiers changed from: private */
    public static final C0667Dx zzfj;
    private int zzdt;
    private String zzfd = BuildConfig.FLAVOR;
    private String zzfe = BuildConfig.FLAVOR;
    private String zzff = BuildConfig.FLAVOR;
    private String zzfg = BuildConfig.FLAVOR;
    private String zzfh = BuildConfig.FLAVOR;
    private String zzfi = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.ads.Dx$a */
    public static final class a extends C2934xea.a<C0667Dx, a> implements C2014kfa {
        private a() {
            super(C0667Dx.zzfj);
        }

        /* synthetic */ a(C0720Fy fy) {
            this();
        }
    }

    static {
        C0667Dx dx = new C0667Dx();
        zzfj = dx;
        C2934xea.a(C0667Dx.class, dx);
    }

    private C0667Dx() {
    }

    public static C0667Dx p() {
        return zzfj;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0720Fy.f6970a[i - 1]) {
            case 1:
                return new C0667Dx();
            case 2:
                return new a((C0720Fy) null);
            case 3:
                return C2934xea.a((C1872ifa) zzfj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzdt", "zzfd", "zzfe", "zzff", "zzfg", "zzfh", "zzfi"});
            case 4:
                return zzfj;
            case 5:
                C2440qfa<C0667Dx> qfa = zzei;
                if (qfa == null) {
                    synchronized (C0667Dx.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzfj);
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
        return this.zzfd;
    }
}
