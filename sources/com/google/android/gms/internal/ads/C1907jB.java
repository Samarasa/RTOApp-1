package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.jB  reason: case insensitive filesystem */
public final class C1907jB extends C2934xea<C1907jB, a> implements C2014kfa {
    private static volatile C2440qfa<C1907jB> zzei;
    /* access modifiers changed from: private */
    public static final C1907jB zzlh;
    private int zzdt;
    private Lda zzld;
    private Lda zzle;
    private Lda zzlf;
    private Lda zzlg;

    /* renamed from: com.google.android.gms.internal.ads.jB$a */
    public static final class a extends C2934xea.a<C1907jB, a> implements C2014kfa {
        private a() {
            super(C1907jB.zzlh);
        }

        /* synthetic */ a(HA ha) {
            this();
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1907jB) this.f12784b).a(lda);
            return this;
        }

        public final a b(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1907jB) this.f12784b).b(lda);
            return this;
        }

        public final a c(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1907jB) this.f12784b).c(lda);
            return this;
        }

        public final a d(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1907jB) this.f12784b).d(lda);
            return this;
        }
    }

    static {
        C1907jB jBVar = new C1907jB();
        zzlh = jBVar;
        C2934xea.a(C1907jB.class, jBVar);
    }

    private C1907jB() {
        Lda lda = Lda.f7691a;
        this.zzld = lda;
        this.zzle = lda;
        this.zzlf = lda;
        this.zzlg = lda;
    }

    public static C1907jB a(byte[] bArr, C2012kea kea) {
        return (C1907jB) C2934xea.a(zzlh, bArr, kea);
    }

    /* access modifiers changed from: private */
    public final void a(Lda lda) {
        lda.getClass();
        this.zzdt |= 1;
        this.zzld = lda;
    }

    /* access modifiers changed from: private */
    public final void b(Lda lda) {
        lda.getClass();
        this.zzdt |= 2;
        this.zzle = lda;
    }

    /* access modifiers changed from: private */
    public final void c(Lda lda) {
        lda.getClass();
        this.zzdt |= 4;
        this.zzlf = lda;
    }

    /* access modifiers changed from: private */
    public final void d(Lda lda) {
        lda.getClass();
        this.zzdt |= 8;
        this.zzlg = lda;
    }

    public static a s() {
        return (a) zzlh.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (HA.f7115a[i - 1]) {
            case 1:
                return new C1907jB();
            case 2:
                return new a((HA) null);
            case 3:
                return C2934xea.a((C1872ifa) zzlh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzdt", "zzld", "zzle", "zzlf", "zzlg"});
            case 4:
                return zzlh;
            case 5:
                C2440qfa<C1907jB> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1907jB.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzlh);
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

    public final Lda o() {
        return this.zzld;
    }

    public final Lda p() {
        return this.zzle;
    }

    public final Lda q() {
        return this.zzlf;
    }

    public final Lda r() {
        return this.zzlg;
    }
}
