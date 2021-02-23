package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;

/* renamed from: com.google.android.gms.internal.ads.lca  reason: case insensitive filesystem */
public final class C2079lca extends C2934xea<C2079lca, a> implements C2014kfa {
    private static volatile C2440qfa<C2079lca> zzei;
    /* access modifiers changed from: private */
    public static final C2079lca zzifb;
    private int zziaz;
    private C2150mca zzifa;

    /* renamed from: com.google.android.gms.internal.ads.lca$a */
    public static final class a extends C2934xea.a<C2079lca, a> implements C2014kfa {
        private a() {
            super(C2079lca.zzifb);
        }

        /* synthetic */ a(C2008kca kca) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2079lca) this.f12784b).b(0);
            return this;
        }

        public final a a(C2150mca mca) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C2079lca) this.f12784b).a(mca);
            return this;
        }
    }

    static {
        C2079lca lca = new C2079lca();
        zzifb = lca;
        C2934xea.a(C2079lca.class, lca);
    }

    private C2079lca() {
    }

    public static C2079lca a(Lda lda, C2012kea kea) {
        return (C2079lca) C2934xea.a(zzifb, lda, kea);
    }

    /* access modifiers changed from: private */
    public final void a(C2150mca mca) {
        mca.getClass();
        this.zzifa = mca;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zziaz = i;
    }

    public static a q() {
        return (a) zzifb.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C2008kca.f11068a[i - 1]) {
            case 1:
                return new C2079lca();
            case 2:
                return new a((C2008kca) null);
            case 3:
                return C2934xea.a((C1872ifa) zzifb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zziaz", "zzifa"});
            case 4:
                return zzifb;
            case 5:
                C2440qfa<C2079lca> qfa = zzei;
                if (qfa == null) {
                    synchronized (C2079lca.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzifb);
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

    public final C2150mca p() {
        C2150mca mca = this.zzifa;
        return mca == null ? C2150mca.p() : mca;
    }
}
