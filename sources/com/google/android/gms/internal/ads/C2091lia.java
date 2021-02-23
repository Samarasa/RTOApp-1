package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.lia  reason: case insensitive filesystem */
public final class C2091lia extends C2934xea<C2091lia, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C2091lia zzabz;
    private static volatile C2440qfa<C2091lia> zzei;
    private C2375pia zzabw;
    private Lda zzabx;
    private Lda zzaby;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.lia$a */
    public static final class a extends C2934xea.a<C2091lia, a> implements C2014kfa {
        private a() {
            super(C2091lia.zzabz);
        }

        /* synthetic */ a(C2233nia nia) {
            this();
        }
    }

    static {
        C2091lia lia = new C2091lia();
        zzabz = lia;
        C2934xea.a(C2091lia.class, lia);
    }

    private C2091lia() {
        Lda lda = Lda.f7691a;
        this.zzabx = lda;
        this.zzaby = lda;
    }

    public static C2091lia a(Lda lda, C2012kea kea) {
        return (C2091lia) C2934xea.a(zzabz, lda, kea);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2233nia.f11490a[i - 1]) {
            case 1:
                return new C2091lia();
            case 2:
                return new a((C2233nia) null);
            case 3:
                return C2934xea.a((C1872ifa) zzabz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdt", "zzabw", "zzabx", "zzaby"});
            case 4:
                return zzabz;
            case 5:
                C2440qfa<C2091lia> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2091lia.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzabz);
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

    public final C2375pia o() {
        C2375pia pia = this.zzabw;
        return pia == null ? C2375pia.u() : pia;
    }

    public final Lda p() {
        return this.zzabx;
    }

    public final Lda q() {
        return this.zzaby;
    }
}
