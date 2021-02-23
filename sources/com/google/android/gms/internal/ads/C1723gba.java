package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.gba  reason: case insensitive filesystem */
public final class C1723gba extends C2934xea<C1723gba, a> implements C2014kfa {
    private static volatile C2440qfa<C1723gba> zzei;
    /* access modifiers changed from: private */
    public static final C1723gba zzibt;
    private int zziaz;
    private Lda zziba = Lda.f7691a;
    private C2006kba zzibs;

    /* renamed from: com.google.android.gms.internal.ads.gba$a */
    public static final class a extends C2934xea.a<C1723gba, a> implements C2014kfa {
        private a() {
            super(C1723gba.zzibt);
        }

        /* synthetic */ a(C1794hba hba) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1723gba) this.f12784b).b(0);
            return this;
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1723gba) this.f12784b).a(lda);
            return this;
        }

        public final a a(C2006kba kba) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1723gba) this.f12784b).a(kba);
            return this;
        }
    }

    static {
        C1723gba gba = new C1723gba();
        zzibt = gba;
        C2934xea.a(C1723gba.class, gba);
    }

    private C1723gba() {
    }

    public static C1723gba a(Lda lda, C2012kea kea) {
        return (C1723gba) C2934xea.a(zzibt, lda, kea);
    }

    /* access modifiers changed from: private */
    public final void a(Lda lda) {
        lda.getClass();
        this.zziba = lda;
    }

    /* access modifiers changed from: private */
    public final void a(C2006kba kba) {
        kba.getClass();
        this.zzibs = kba;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zziaz = i;
    }

    public static a r() {
        return (a) zzibt.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1794hba.f10690a[i - 1]) {
            case 1:
                return new C1723gba();
            case 2:
                return new a((C1794hba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzibt, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zziaz", "zzibs", "zziba"});
            case 4:
                return zzibt;
            case 5:
                C2440qfa<C1723gba> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1723gba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzibt);
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

    public final C2006kba q() {
        C2006kba kba = this.zzibs;
        return kba == null ? C2006kba.p() : kba;
    }
}
