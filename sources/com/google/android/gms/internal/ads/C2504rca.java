package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.rca  reason: case insensitive filesystem */
public final class C2504rca extends C2934xea<C2504rca, a> implements C2014kfa {
    private static volatile C2440qfa<C2504rca> zzei;
    /* access modifiers changed from: private */
    public static final C2504rca zzifi;
    private String zzifg = BuildConfig.FLAVOR;
    private C1513dca zzifh;

    /* renamed from: com.google.android.gms.internal.ads.rca$a */
    public static final class a extends C2934xea.a<C2504rca, a> implements C2014kfa {
        private a() {
            super(C2504rca.zzifi);
        }

        /* synthetic */ a(C2575sca sca) {
            this();
        }
    }

    static {
        C2504rca rca = new C2504rca();
        zzifi = rca;
        C2934xea.a(C2504rca.class, rca);
    }

    private C2504rca() {
    }

    public static C2504rca a(Lda lda, C2012kea kea) {
        return (C2504rca) C2934xea.a(zzifi, lda, kea);
    }

    public static C2504rca q() {
        return zzifi;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2575sca.f12103a[i - 1]) {
            case 1:
                return new C2504rca();
            case 2:
                return new a((C2575sca) null);
            case 3:
                return C2934xea.a((C1872ifa) zzifi, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzifg", "zzifh"});
            case 4:
                return zzifi;
            case 5:
                C2440qfa<C2504rca> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2504rca.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzifi);
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
        return this.zzifg;
    }

    public final C1513dca p() {
        C1513dca dca = this.zzifh;
        return dca == null ? C1513dca.q() : dca;
    }
}
