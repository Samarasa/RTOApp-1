package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class E extends Lb<E, b> implements C0459yc {
    /* access modifiers changed from: private */
    public static final E zzi;
    private static volatile Dc<E> zzj;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;

    public enum a implements Qb {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        

        /* renamed from: f  reason: collision with root package name */
        private static final Pb<a> f4130f = null;

        /* renamed from: h  reason: collision with root package name */
        private final int f4132h;

        static {
            f4130f = new J();
        }

        private a(int i) {
            this.f4132h = i;
        }

        public static a a(int i) {
            if (i == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i == 1) {
                return LESS_THAN;
            }
            if (i == 2) {
                return GREATER_THAN;
            }
            if (i == 3) {
                return EQUAL;
            }
            if (i != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static Sb b() {
            return I.f4181a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4132h + " name=" + name() + '>';
        }
    }

    public static final class b extends Lb.b<E, b> implements C0459yc {
        private b() {
            super(E.zzi);
        }

        /* synthetic */ b(H h2) {
            this();
        }
    }

    static {
        E e2 = new E();
        zzi = e2;
        Lb.a(E.class, e2);
    }

    private E() {
    }

    public static E y() {
        return zzi;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (H.f4177a[i - 1]) {
            case 1:
                return new E();
            case 2:
                return new b((H) null);
            case 3:
                return Lb.a((C0445wc) zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"zzc", "zzd", a.b(), "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                Dc<E> dc = zzj;
                if (dc == null) {
                    synchronized (E.class) {
                        dc = zzj;
                        if (dc == null) {
                            dc = new Lb.a<>(zzi);
                            zzj = dc;
                        }
                    }
                }
                return dc;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean o() {
        return (this.zzc & 1) != 0;
    }

    public final a p() {
        a a2 = a.a(this.zzd);
        return a2 == null ? a.UNKNOWN_COMPARISON_TYPE : a2;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final boolean r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzc & 4) != 0;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzc & 8) != 0;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzc & 16) != 0;
    }

    public final String x() {
        return this.zzh;
    }
}
