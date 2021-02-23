package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2934xea;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class Yba extends C2934xea<Yba, a> implements C2014kfa {
    private static volatile C2440qfa<Yba> zzei;
    /* access modifiers changed from: private */
    public static final Yba zzidv;
    private String zzids = BuildConfig.FLAVOR;
    private Lda zzidt = Lda.f7691a;
    private int zzidu;

    public static final class a extends C2934xea.a<Yba, a> implements C2014kfa {
        private a() {
            super(Yba.zzidv);
        }

        /* synthetic */ a(Zba zba) {
            this();
        }

        public final a a(Lda lda) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Yba) this.f12784b).a(lda);
            return this;
        }

        public final a a(b bVar) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Yba) this.f12784b).a(bVar);
            return this;
        }

        public final a a(String str) {
            if (this.f12785c) {
                h();
                this.f12785c = false;
            }
            ((Yba) this.f12784b).a(str);
            return this;
        }
    }

    public enum b implements C3076zea {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: g  reason: collision with root package name */
        private static final Cea<b> f9409g = null;
        private final int i;

        static {
            f9409g = new _ba();
        }

        private b(int i2) {
            this.i = i2;
        }

        public static b a(int i2) {
            if (i2 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i2 == 1) {
                return SYMMETRIC;
            }
            if (i2 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i2 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i2 != 4) {
                return null;
            }
            return REMOTE;
        }

        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.i;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(b.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(a());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }
    }

    static {
        Yba yba = new Yba();
        zzidv = yba;
        C2934xea.a(Yba.class, yba);
    }

    private Yba() {
    }

    /* access modifiers changed from: private */
    public final void a(Lda lda) {
        lda.getClass();
        this.zzidt = lda;
    }

    /* access modifiers changed from: private */
    public final void a(b bVar) {
        this.zzidu = bVar.a();
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzids = str;
    }

    public static a r() {
        return (a) zzidv.j();
    }

    public static Yba s() {
        return zzidv;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (Zba.f9557a[i - 1]) {
            case 1:
                return new Yba();
            case 2:
                return new a((Zba) null);
            case 3:
                return C2934xea.a((C1872ifa) zzidv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzids", "zzidt", "zzidu"});
            case 4:
                return zzidv;
            case 5:
                C2440qfa<Yba> qfa = zzei;
                if (qfa == null) {
                    synchronized (Yba.class) {
                        qfa = zzei;
                        if (qfa == null) {
                            qfa = new C2934xea.c<>(zzidv);
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

    public final String o() {
        return this.zzids;
    }

    public final Lda p() {
        return this.zzidt;
    }

    public final b q() {
        b a2 = b.a(this.zzidu);
        return a2 == null ? b.UNRECOGNIZED : a2;
    }
}
