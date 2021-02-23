package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.mca  reason: case insensitive filesystem */
public final class C2150mca extends C2934xea<C2150mca, a> implements C2014kfa {
    private static volatile C2440qfa<C2150mca> zzei;
    /* access modifiers changed from: private */
    public static final C2150mca zzifd;
    private String zzifc = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.ads.mca$a */
    public static final class a extends C2934xea.a<C2150mca, a> implements C2014kfa {
        private a() {
            super(C2150mca.zzifd);
        }

        /* synthetic */ a(C2221nca nca) {
            this();
        }
    }

    static {
        C2150mca mca = new C2150mca();
        zzifd = mca;
        C2934xea.a(C2150mca.class, mca);
    }

    private C2150mca() {
    }

    public static C2150mca a(Lda lda, C2012kea kea) {
        return (C2150mca) C2934xea.a(zzifd, lda, kea);
    }

    public static C2150mca p() {
        return zzifd;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2221nca.f11476a[i - 1]) {
            case 1:
                return new C2150mca();
            case 2:
                return new a((C2221nca) null);
            case 3:
                return C2934xea.a((C1872ifa) zzifd, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzifc"});
            case 4:
                return zzifd;
            case 5:
                C2440qfa<C2150mca> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2150mca.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzifd);
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
        return this.zzifc;
    }
}
