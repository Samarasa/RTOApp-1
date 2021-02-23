package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.wba  reason: case insensitive filesystem */
public final class C2857wba extends C2934xea<C2857wba, a> implements C2014kfa {
    private static volatile C2440qfa<C2857wba> zzei;
    /* access modifiers changed from: private */
    public static final C2857wba zzica;
    private int zziaz;
    private Lda zziba = Lda.f7691a;

    /* renamed from: com.google.android.gms.internal.ads.wba$a */
    public static final class a extends C2934xea.a<C2857wba, a> implements C2014kfa {
        private a() {
            super(C2857wba.zzica);
        }

        /* synthetic */ a(C2786vba vba) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2857wba) this.f12784b).b(0);
            return this;
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2857wba) this.f12784b).a(lda);
            return this;
        }
    }

    static {
        C2857wba wba = new C2857wba();
        zzica = wba;
        C2934xea.a(C2857wba.class, wba);
    }

    private C2857wba() {
    }

    public static C2857wba a(Lda lda, C2012kea kea) {
        return (C2857wba) C2934xea.a(zzica, lda, kea);
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
        return (a) zzica.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2786vba.f12508a[i - 1]) {
            case 1:
                return new C2857wba();
            case 2:
                return new a((C2786vba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzica, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zziaz", "zziba"});
            case 4:
                return zzica;
            case 5:
                C2440qfa<C2857wba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2857wba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzica);
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
