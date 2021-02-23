package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Cpa extends C2934xea<Cpa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final Cpa zzcfb;
    private static volatile C2440qfa<Cpa> zzei;
    private int zzcey;
    private int zzcez;
    private int zzcfa;
    private int zzdt;

    public static final class a extends C2934xea.a<Cpa, a> implements C2014kfa {
        private a() {
            super(Cpa.zzcfb);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Cpa) this.f12784b).b(i);
            return this;
        }

        public final a b(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Cpa) this.f12784b).c(i);
            return this;
        }

        public final a c(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Cpa) this.f12784b).d(i);
            return this;
        }
    }

    static {
        Cpa cpa = new Cpa();
        zzcfb = cpa;
        C2934xea.a(Cpa.class, cpa);
    }

    private Cpa() {
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zzdt |= 1;
        this.zzcey = i;
    }

    /* access modifiers changed from: private */
    public final void c(int i) {
        this.zzdt |= 2;
        this.zzcez = i;
    }

    /* access modifiers changed from: private */
    public final void d(int i) {
        this.zzdt |= 4;
        this.zzcfa = i;
    }

    public static a o() {
        return (a) zzcfb.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new Cpa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcfb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzdt", "zzcey", "zzcez", "zzcfa"});
            case 4:
                return zzcfb;
            case 5:
                C2440qfa<Cpa> qfa = zzei;
                if (qfa == null) {
                    synchronized (Cpa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcfb);
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
