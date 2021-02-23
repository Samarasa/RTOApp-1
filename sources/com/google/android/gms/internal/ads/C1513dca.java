package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.dca  reason: case insensitive filesystem */
public final class C1513dca extends C2934xea<C1513dca, a> implements C2014kfa {
    private static volatile C2440qfa<C1513dca> zzei;
    /* access modifiers changed from: private */
    public static final C1513dca zziek;
    private String zzids = BuildConfig.FLAVOR;
    private Lda zzidt = Lda.f7691a;
    private int zziej;

    /* renamed from: com.google.android.gms.internal.ads.dca$a */
    public static final class a extends C2934xea.a<C1513dca, a> implements C2014kfa {
        private a() {
            super(C1513dca.zziek);
        }

        /* synthetic */ a(C1442cca cca) {
            this();
        }
    }

    static {
        C1513dca dca = new C1513dca();
        zziek = dca;
        C2934xea.a(C1513dca.class, dca);
    }

    private C1513dca() {
    }

    public static C1513dca q() {
        return zziek;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1442cca.f10056a[i - 1]) {
            case 1:
                return new C1513dca();
            case 2:
                return new a((C1442cca) null);
            case 3:
                return C2934xea.a((C1872ifa) zziek, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzids", "zzidt", "zziej"});
            case 4:
                return zziek;
            case 5:
                C2440qfa<C1513dca> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1513dca.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zziek);
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
        return this.zzids;
    }

    public final Lda p() {
        return this.zzidt;
    }
}
