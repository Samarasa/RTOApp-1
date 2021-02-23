package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.hca  reason: case insensitive filesystem */
public final class C1796hca extends C2934xea<C1796hca, b> implements C2014kfa {
    private static volatile C2440qfa<C1796hca> zzei;
    /* access modifiers changed from: private */
    public static final C1796hca zzies;
    private int zzieq;
    private Fea<a> zzier = C2934xea.n();

    /* renamed from: com.google.android.gms.internal.ads.hca$a */
    public static final class a extends C2934xea<a, C0080a> implements C2014kfa {
        private static volatile C2440qfa<a> zzei;
        /* access modifiers changed from: private */
        public static final a zziew;
        private int zziej;
        private Yba zziet;
        private int zzieu;
        private int zziev;

        /* renamed from: com.google.android.gms.internal.ads.hca$a$a  reason: collision with other inner class name */
        public static final class C0080a extends C2934xea.a<a, C0080a> implements C2014kfa {
            private C0080a() {
                super(a.zziew);
            }

            /* synthetic */ C0080a(C1725gca gca) {
                this();
            }
        }

        static {
            a aVar = new a();
            zziew = aVar;
            C2934xea.a(a.class, aVar);
        }

        private a() {
        }

        /* access modifiers changed from: protected */
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1725gca.f10553a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0080a((C1725gca) null);
                case 3:
                    return C2934xea.a((C1872ifa) zziew, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zziet", "zzieu", "zziev", "zziej"});
                case 4:
                    return zziew;
                case 5:
                    C2440qfa<a> qfa = zzei;
                    if (qfa == null) {
                        synchronized (a.class) {
                            qfa = zzei;
                            if (qfa == null) {
                                qfa = new C2934xea.c<>(zziew);
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

        public final C1371bca o() {
            C1371bca a2 = C1371bca.a(this.zzieu);
            return a2 == null ? C1371bca.UNRECOGNIZED : a2;
        }

        public final C2717uca p() {
            C2717uca a2 = C2717uca.a(this.zziej);
            return a2 == null ? C2717uca.UNRECOGNIZED : a2;
        }

        public final boolean q() {
            return this.zziet != null;
        }

        public final Yba r() {
            Yba yba = this.zziet;
            return yba == null ? Yba.s() : yba;
        }

        public final int s() {
            return this.zziev;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.hca$b */
    public static final class b extends C2934xea.a<C1796hca, b> implements C2014kfa {
        private b() {
            super(C1796hca.zzies);
        }

        /* synthetic */ b(C1725gca gca) {
            this();
        }
    }

    static {
        C1796hca hca = new C1796hca();
        zzies = hca;
        C2934xea.a(C1796hca.class, hca);
    }

    private C1796hca() {
    }

    public static C1796hca a(byte[] bArr, C2012kea kea) {
        return (C1796hca) C2934xea.a(zzies, bArr, kea);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1725gca.f10553a[i - 1]) {
            case 1:
                return new C1796hca();
            case 2:
                return new b((C1725gca) null);
            case 3:
                return C2934xea.a((C1872ifa) zzies, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzieq", "zzier", a.class});
            case 4:
                return zzies;
            case 5:
                C2440qfa<C1796hca> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1796hca.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzies);
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
        return this.zzieq;
    }

    public final List<a> p() {
        return this.zzier;
    }

    public final int q() {
        return this.zzier.size();
    }
}
