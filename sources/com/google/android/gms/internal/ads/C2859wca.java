package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.wca  reason: case insensitive filesystem */
public final class C2859wca extends C2934xea<C2859wca, a> implements C2014kfa {
    private static volatile C2440qfa<C2859wca> zzei;
    /* access modifiers changed from: private */
    public static final C2859wca zzifs;
    private String zzifq = BuildConfig.FLAVOR;
    private Fea<C1583eca> zzifr = C2934xea.n();

    /* renamed from: com.google.android.gms.internal.ads.wca$a */
    public static final class a extends C2934xea.a<C2859wca, a> implements C2014kfa {
        private a() {
            super(C2859wca.zzifs);
        }

        /* synthetic */ a(C2788vca vca) {
            this();
        }
    }

    static {
        C2859wca wca = new C2859wca();
        zzifs = wca;
        C2934xea.a(C2859wca.class, wca);
    }

    private C2859wca() {
    }

    public static C2859wca p() {
        return zzifs;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2788vca.f12510a[i - 1]) {
            case 1:
                return new C2859wca();
            case 2:
                return new a((C2788vca) null);
            case 3:
                return C2934xea.a((C1872ifa) zzifs, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzifq", "zzifr", C1583eca.class});
            case 4:
                return zzifs;
            case 5:
                C2440qfa<C2859wca> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2859wca.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzifs);
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

    public final List<C1583eca> o() {
        return this.zzifr;
    }
}
