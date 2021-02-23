package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.bba  reason: case insensitive filesystem */
public final class C1369bba extends C2934xea<C1369bba, a> implements C2014kfa {
    private static volatile C2440qfa<C1369bba> zzei;
    /* access modifiers changed from: private */
    public static final C1369bba zzibo;
    private int zziaz;
    private Lda zziba = Lda.f7691a;
    private C1652fba zzibn;

    /* renamed from: com.google.android.gms.internal.ads.bba$a */
    public static final class a extends C2934xea.a<C1369bba, a> implements C2014kfa {
        private a() {
            super(C1369bba.zzibo);
        }

        /* synthetic */ a(C1298aba aba) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1369bba) this.f12784b).b(0);
            return this;
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1369bba) this.f12784b).a(lda);
            return this;
        }

        public final a a(C1652fba fba) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1369bba) this.f12784b).a(fba);
            return this;
        }
    }

    static {
        C1369bba bba = new C1369bba();
        zzibo = bba;
        C2934xea.a(C1369bba.class, bba);
    }

    private C1369bba() {
    }

    public static C1369bba a(Lda lda, C2012kea kea) {
        return (C1369bba) C2934xea.a(zzibo, lda, kea);
    }

    /* access modifiers changed from: private */
    public final void a(Lda lda) {
        lda.getClass();
        this.zziba = lda;
    }

    /* access modifiers changed from: private */
    public final void a(C1652fba fba) {
        fba.getClass();
        this.zzibn = fba;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zziaz = i;
    }

    public static a r() {
        return (a) zzibo.j();
    }

    public static C1369bba s() {
        return zzibo;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1298aba.f9801a[i - 1]) {
            case 1:
                return new C1369bba();
            case 2:
                return new a((C1298aba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibo, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zziaz", "zzibn", "zziba"});
            case 4:
                return zzibo;
            case 5:
                C2440qfa<C1369bba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1369bba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibo);
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

    public final C1652fba q() {
        C1652fba fba = this.zzibn;
        return fba == null ? C1652fba.p() : fba;
    }
}
