package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.ica  reason: case insensitive filesystem */
public final class C1867ica extends C2934xea<C1867ica, a> implements C2014kfa {
    private static volatile C2440qfa<C1867ica> zzei;
    /* access modifiers changed from: private */
    public static final C1867ica zziey;
    private int zzieq;
    private Fea<b> zziex = C2934xea.n();

    /* renamed from: com.google.android.gms.internal.ads.ica$a */
    public static final class a extends C2934xea.a<C1867ica, a> implements C2014kfa {
        private a() {
            super(C1867ica.zziey);
        }

        /* synthetic */ a(C1937jca jca) {
            this();
        }

        public final a a(int i) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1867ica) this.f12784b).b(i);
            return this;
        }

        public final a a(b bVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((C1867ica) this.f12784b).a(bVar);
            return this;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ica$b */
    public static final class b extends C2934xea<b, a> implements C2014kfa {
        private static volatile C2440qfa<b> zzei;
        /* access modifiers changed from: private */
        public static final b zziez;
        private String zzids = BuildConfig.FLAVOR;
        private int zziej;
        private int zzieu;
        private int zziev;

        /* renamed from: com.google.android.gms.internal.ads.ica$b$a */
        public static final class a extends C2934xea.a<b, a> implements C2014kfa {
            private a() {
                super(b.zziez);
            }

            /* synthetic */ a(C1937jca jca) {
                this();
            }

            public final a a(int i) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((b) this.f12784b).b(i);
                return this;
            }

            public final a a(C1371bca bca) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((b) this.f12784b).a(bca);
                return this;
            }

            public final a a(C2717uca uca) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((b) this.f12784b).a(uca);
                return this;
            }

            public final a a(String str) {
                if (this.f12785c) {
                    h();
                    this.f12785c = false;
                }
                ((b) this.f12784b).a(str);
                return this;
            }
        }

        static {
            b bVar = new b();
            zziez = bVar;
            C2934xea.a(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: private */
        public final void a(C1371bca bca) {
            this.zzieu = bca.a();
        }

        /* access modifiers changed from: private */
        public final void a(C2717uca uca) {
            this.zziej = uca.a();
        }

        /* access modifiers changed from: private */
        public final void a(String str) {
            str.getClass();
            this.zzids = str;
        }

        /* access modifiers changed from: private */
        public final void b(int i) {
            this.zziev = i;
        }

        public static a o() {
            return (a) zziez.j();
        }

        /* access modifiers changed from: protected */
        public final Object a(int i, Object obj, Object obj2) {
            switch (C1937jca.f10959a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a((C1937jca) null);
                case 3:
                    return C2934xea.a((C1872ifa) zziez, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzids", "zzieu", "zziev", "zziej"});
                case 4:
                    return zziez;
                case 5:
                    C2440qfa<b> qfa = zzei;
                    if (qfa == null) {
                        synchronized (b.class) {
                            qfa = zzei;
                            if (qfa == null) {
                                qfa = new C2934xea.c<>(zziez);
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

    static {
        C1867ica ica = new C1867ica();
        zziey = ica;
        C2934xea.a(C1867ica.class, ica);
    }

    private C1867ica() {
    }

    /* access modifiers changed from: private */
    public final void a(b bVar) {
        bVar.getClass();
        Fea<b> fea = this.zziex;
        if (!fea.n()) {
            this.zziex = C2934xea.a(fea);
        }
        this.zziex.add(bVar);
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zzieq = i;
    }

    public static a o() {
        return (a) zziey.j();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C1937jca.f10959a[i - 1]) {
            case 1:
                return new C1867ica();
            case 2:
                return new a((C1937jca) null);
            case 3:
                return C2934xea.a((C1872ifa) zziey, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzieq", "zziex", b.class});
            case 4:
                return zziey;
            case 5:
                C2440qfa<C1867ica> qfa = zzei;
                if (qfa == null) {
                    synchronized (C1867ica.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zziey);
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
