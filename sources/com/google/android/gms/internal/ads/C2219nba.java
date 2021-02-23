package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.nba  reason: case insensitive filesystem */
public final class C2219nba extends C2934xea<C2219nba, a> implements C2014kfa {
    private static volatile C2440qfa<C2219nba> zzei;
    /* access modifiers changed from: private */
    public static final C2219nba zzibw;
    private int zziaz;
    private Lda zziba = Lda.f7691a;

    /* renamed from: com.google.android.gms.internal.ads.nba$a */
    public static final class a extends C2934xea.a<C2219nba, a> implements C2014kfa {
        private a() {
            super(C2219nba.zzibw);
        }

        /* synthetic */ a(C2148mba mba) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2219nba) this.f12784b).b(0);
            return this;
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2219nba) this.f12784b).a(lda);
            return this;
        }
    }

    static {
        C2219nba nba = new C2219nba();
        zzibw = nba;
        C2934xea.a(C2219nba.class, nba);
    }

    private C2219nba() {
    }

    public static C2219nba a(Lda lda, C2012kea kea) {
        return (C2219nba) C2934xea.a(zzibw, lda, kea);
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
        return (a) zzibw.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2148mba.f11327a[i - 1]) {
            case 1:
                return new C2219nba();
            case 2:
                return new a((C2148mba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibw, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zziaz", "zziba"});
            case 4:
                return zzibw;
            case 5:
                C2440qfa<C2219nba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2219nba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibw);
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
