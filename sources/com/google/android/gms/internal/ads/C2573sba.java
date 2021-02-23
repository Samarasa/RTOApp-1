package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.sba  reason: case insensitive filesystem */
public final class C2573sba extends C2934xea<C2573sba, a> implements C2014kfa {
    private static volatile C2440qfa<C2573sba> zzei;
    /* access modifiers changed from: private */
    public static final C2573sba zziby;
    private int zziaz;
    private Lda zziba = Lda.f7691a;

    /* renamed from: com.google.android.gms.internal.ads.sba$a */
    public static final class a extends C2934xea.a<C2573sba, a> implements C2014kfa {
        private a() {
            super(C2573sba.zziby);
        }

        /* synthetic */ a(C2502rba rba) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2573sba) this.f12784b).b(0);
            return this;
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2573sba) this.f12784b).a(lda);
            return this;
        }
    }

    static {
        C2573sba sba = new C2573sba();
        zziby = sba;
        C2934xea.a(C2573sba.class, sba);
    }

    private C2573sba() {
    }

    public static C2573sba a(Lda lda, C2012kea kea) {
        return (C2573sba) C2934xea.a(zziby, lda, kea);
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
        return (a) zziby.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2502rba.f11992a[i - 1]) {
            case 1:
                return new C2573sba();
            case 2:
                return new a((C2502rba) null);
            case 3:
                return C2934xea.a((C1872ifa) zziby, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zziaz", "zziba"});
            case 4:
                return zziby;
            case 5:
                C2440qfa<C2573sba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2573sba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zziby);
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
