package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.pca  reason: case insensitive filesystem */
public final class C2363pca extends C2934xea<C2363pca, a> implements C2014kfa {
    private static volatile C2440qfa<C2363pca> zzei;
    /* access modifiers changed from: private */
    public static final C2363pca zziff;
    private int zziaz;
    private C2504rca zzife;

    /* renamed from: com.google.android.gms.internal.ads.pca$a */
    public static final class a extends C2934xea.a<C2363pca, a> implements C2014kfa {
        private a() {
            super(C2363pca.zziff);
        }

        /* synthetic */ a(C2292oca oca) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2363pca) this.f12784b).b(0);
            return this;
        }

        public final a a(C2504rca rca) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2363pca) this.f12784b).a(rca);
            return this;
        }
    }

    static {
        C2363pca pca = new C2363pca();
        zziff = pca;
        C2934xea.a(C2363pca.class, pca);
    }

    private C2363pca() {
    }

    public static C2363pca a(Lda lda, C2012kea kea) {
        return (C2363pca) C2934xea.a(zziff, lda, kea);
    }

    /* access modifiers changed from: private */
    public final void a(C2504rca rca) {
        rca.getClass();
        this.zzife = rca;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zziaz = i;
    }

    public static a q() {
        return (a) zziff.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2292oca.f11596a[i - 1]) {
            case 1:
                return new C2363pca();
            case 2:
                return new a((C2292oca) null);
            case 3:
                return C2934xea.a((C1872ifa) zziff, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zziaz", "zzife"});
            case 4:
                return zziff;
            case 5:
                C2440qfa<C2363pca> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2363pca.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zziff);
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

    public final int o() {
        return this.zziaz;
    }

    public final C2504rca p() {
        C2504rca rca = this.zzife;
        return rca == null ? C2504rca.q() : rca;
    }
}
