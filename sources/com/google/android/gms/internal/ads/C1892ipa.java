package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.ipa  reason: case insensitive filesystem */
public final class C1892ipa extends C2934xea<C1892ipa, a> implements C2014kfa {
    /* access modifiers changed from: private */
    public static final C1892ipa zzcgo;
    private static volatile C2440qfa<C1892ipa> zzei;
    private boolean zzcgm;
    private int zzcgn;
    private int zzdt;

    /* renamed from: com.google.android.gms.internal.ads.ipa$a */
    public static final class a extends C2934xea.a<C1892ipa, a> implements C2014kfa {
        private a() {
            super(C1892ipa.zzcgo);
        }

        /* synthetic */ a(C1468cpa cpa) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1892ipa) this.f12784b).b(i);
            return this;
        }

        public final a a(boolean z) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1892ipa) this.f12784b).a(z);
            return this;
        }

        public final boolean l() {
            return ((C1892ipa) this.f12784b).o();
        }
    }

    static {
        C1892ipa ipa = new C1892ipa();
        zzcgo = ipa;
        C2934xea.a(C1892ipa.class, ipa);
    }

    private C1892ipa() {
    }

    /* access modifiers changed from: private */
    public final void a(boolean z) {
        this.zzdt |= 1;
        this.zzcgm = z;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zzdt |= 2;
        this.zzcgn = i;
    }

    public static a p() {
        return (a) zzcgo.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1468cpa.f10089a[i - 1]) {
            case 1:
                return new C1892ipa();
            case 2:
                return new a((C1468cpa) null);
            case 3:
                return C2934xea.a((C1872ifa) zzcgo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzdt", "zzcgm", "zzcgn"});
            case 4:
                return zzcgo;
            case 5:
                C2440qfa<C1892ipa> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1892ipa.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzcgo);
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

    public final boolean o() {
        return this.zzcgm;
    }
}
