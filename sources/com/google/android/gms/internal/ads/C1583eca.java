package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.eca  reason: case insensitive filesystem */
public final class C1583eca extends C2934xea<C1583eca, a> implements C2014kfa {
    private static volatile C2440qfa<C1583eca> zzei;
    /* access modifiers changed from: private */
    public static final C1583eca zziep;
    private String zzids = BuildConfig.FLAVOR;
    private String zziel = BuildConfig.FLAVOR;
    private int zziem;
    private boolean zzien;
    private String zzieo = BuildConfig.FLAVOR;

    /* renamed from: com.google.android.gms.internal.ads.eca$a */
    public static final class a extends C2934xea.a<C1583eca, a> implements C2014kfa {
        private a() {
            super(C1583eca.zziep);
        }

        /* synthetic */ a(C1654fca fca) {
            this();
        }
    }

    static {
        C1583eca eca = new C1583eca();
        zziep = eca;
        C2934xea.a(C1583eca.class, eca);
    }

    private C1583eca() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1654fca.f10418a[i - 1]) {
            case 1:
                return new C1583eca();
            case 2:
                return new a((C1654fca) null);
            case 3:
                return C2934xea.a((C1872ifa) zziep, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zziel", "zzids", "zziem", "zzien", "zzieo"});
            case 4:
                return zziep;
            case 5:
                C2440qfa<C1583eca> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1583eca.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zziep);
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

    public final String p() {
        return this.zziel;
    }

    public final int q() {
        return this.zziem;
    }

    public final boolean r() {
        return this.zzien;
    }

    public final String s() {
        return this.zzieo;
    }
}
