package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.mB  reason: case insensitive filesystem */
public final class C2120mB extends C2934xea<C2120mB, a> implements C2014kfa {
    private static volatile C2440qfa<C2120mB> zzei;
    /* access modifiers changed from: private */
    public static final C2120mB zzme;
    private int zzdt;
    private int zzhs = 1;
    private int zzht = 1;
    private Lda zzle = Lda.f7691a;
    private Fea<Lda> zzmd = C2934xea.n();

    /* renamed from: com.google.android.gms.internal.ads.mB$a */
    public static final class a extends C2934xea.a<C2120mB, a> implements C2014kfa {
        private a() {
            super(C2120mB.zzme);
        }

        /* synthetic */ a(HA ha) {
            this();
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2120mB) this.f12784b).b(lda);
            return this;
        }

        public final a a(QE qe) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2120mB) this.f12784b).a(qe);
            return this;
        }

        public final a b(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2120mB) this.f12784b).a(lda);
            return this;
        }
    }

    static {
        C2120mB mBVar = new C2120mB();
        zzme = mBVar;
        C2934xea.a(C2120mB.class, mBVar);
    }

    private C2120mB() {
    }

    /* access modifiers changed from: private */
    public final void a(Lda lda) {
        lda.getClass();
        this.zzdt |= 1;
        this.zzle = lda;
    }

    /* access modifiers changed from: private */
    public final void a(QE qe) {
        this.zzhs = qe.a();
        this.zzdt |= 4;
    }

    /* access modifiers changed from: private */
    public final void b(Lda lda) {
        lda.getClass();
        Fea<Lda> fea = this.zzmd;
        if (!fea.n()) {
            this.zzmd = C2934xea.a(fea);
        }
        this.zzmd.add(lda);
    }

    public static a o() {
        return (a) zzme.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (HA.f7115a[i - 1]) {
            case 1:
                return new C2120mB();
            case 2:
                return new a((HA) null);
            case 3:
                return C2934xea.a((C1872ifa) zzme, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzdt", "zzmd", "zzle", "zzht", TH.a(), "zzhs", QE.c()});
            case 4:
                return zzme;
            case 5:
                C2440qfa<C2120mB> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2120mB.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzme);
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
}
