package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.xca  reason: case insensitive filesystem */
public final class C2930xca extends C2934xea<C2930xca, a> implements C2014kfa {
    private static volatile C2440qfa<C2930xca> zzei;
    /* access modifiers changed from: private */
    public static final C2930xca zzift;
    private int zziaz;
    private Lda zziba = Lda.f7691a;

    /* renamed from: com.google.android.gms.internal.ads.xca$a */
    public static final class a extends C2934xea.a<C2930xca, a> implements C2014kfa {
        private a() {
            super(C2930xca.zzift);
        }

        /* synthetic */ a(C3001yca yca) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2930xca) this.f12784b).b(0);
            return this;
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2930xca) this.f12784b).a(lda);
            return this;
        }
    }

    static {
        C2930xca xca = new C2930xca();
        zzift = xca;
        C2934xea.a(C2930xca.class, xca);
    }

    private C2930xca() {
    }

    public static C2930xca a(Lda lda, C2012kea kea) {
        return (C2930xca) C2934xea.a(zzift, lda, kea);
    }

    /* access modifiers changed from: private */
    public final void a(Lda lda) {
        lda.getClass();
        this.zziba = lda;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zziaz = i;
    }

    public static a q() {
        return (a) zzift.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C3001yca.f12934a[i - 1]) {
            case 1:
                return new C2930xca();
            case 2:
                return new a((C3001yca) null);
            case 3:
                return C2934xea.a((C1872ifa) zzift, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zziaz", "zziba"});
            case 4:
                return zzift;
            case 5:
                C2440qfa<C2930xca> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2930xca.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzift);
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

    public final Lda p() {
        return this.zziba;
    }
}
