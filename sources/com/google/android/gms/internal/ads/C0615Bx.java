package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.Bx  reason: case insensitive filesystem */
public final class C0615Bx extends C2934xea<C0615Bx, a> implements C2014kfa {
    private static volatile C2440qfa<C0615Bx> zzei;
    /* access modifiers changed from: private */
    public static final C0615Bx zzeu;
    private int zzdt;
    private C0641Cx zzes;
    private C0667Dx zzet;

    /* renamed from: com.google.android.gms.internal.ads.Bx$a */
    public static final class a extends C2934xea.a<C0615Bx, a> implements C2014kfa {
        private a() {
            super(C0615Bx.zzeu);
        }

        /* synthetic */ a(C0720Fy fy) {
            this();
        }
    }

    static {
        C0615Bx bx = new C0615Bx();
        zzeu = bx;
        C2934xea.a(C0615Bx.class, bx);
    }

    private C0615Bx() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0720Fy.f6970a[i - 1]) {
            case 1:
                return new C0615Bx();
            case 2:
                return new a((C0720Fy) null);
            case 3:
                return C2934xea.a((C1872ifa) zzeu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzdt", "zzes", "zzet"});
            case 4:
                return zzeu;
            case 5:
                C2440qfa<C0615Bx> qfa = zzei;
                if (qfa == null) {
                    synchronized (C0615Bx.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzeu);
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

    public final C0667Dx o() {
        C0667Dx dx = this.zzet;
        return dx == null ? C0667Dx.p() : dx;
    }

    public final boolean q() {
        return (this.zzdt & 1) != 0;
    }

    public final C0641Cx r() {
        C0641Cx cx = this.zzes;
        return cx == null ? C0641Cx.p() : cx;
    }

    public final boolean s() {
        return (this.zzdt & 2) != 0;
    }
}
