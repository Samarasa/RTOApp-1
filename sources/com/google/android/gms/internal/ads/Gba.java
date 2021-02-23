package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

public final class Gba extends C2934xea<Gba, a> implements C2014kfa {
    private static volatile C2440qfa<Gba> zzei;
    /* access modifiers changed from: private */
    public static final Gba zzicp;
    private Lba zzicm;
    private Cba zzicn;
    private int zzico;

    public static final class a extends C2934xea.a<Gba, a> implements C2014kfa {
        private a() {
            super(Gba.zzicp);
        }

        /* synthetic */ a(Fba fba) {
            this();
        }
    }

    static {
        Gba gba = new Gba();
        zzicp = gba;
        C2934xea.a(Gba.class, gba);
    }

    private Gba() {
    }

    public static Gba r() {
        return zzicp;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Fba.f6872a[i - 1]) {
            case 1:
                return new Gba();
            case 2:
                return new a((Fba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzicp, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzicm", "zzicn", "zzico"});
            case 4:
                return zzicp;
            case 5:
                C2440qfa<Gba> qfa = zzei;
                if (qfa == null) {
                    synchronized (Gba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzicp);
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

    public final Lba o() {
        Lba lba = this.zzicm;
        return lba == null ? Lba.r() : lba;
    }

    public final Cba p() {
        Cba cba = this.zzicn;
        return cba == null ? Cba.p() : cba;
    }

    public final Aba q() {
        Aba a2 = Aba.a(this.zzico);
        return a2 == null ? Aba.UNRECOGNIZED : a2;
    }
}
