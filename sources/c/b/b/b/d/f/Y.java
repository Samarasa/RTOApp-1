package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;

public final class Y extends Lb<Y, b> implements C0459yc {
    /* access modifiers changed from: private */
    public static final Y zzf;
    private static volatile Dc<Y> zzg;
    private int zzc;
    private int zzd = 1;
    private Tb<U> zze = Lb.n();

    public enum a implements Qb {
        RADS(1),
        PROVISIONING(2);
        

        /* renamed from: c  reason: collision with root package name */
        private static final Pb<a> f4341c = null;

        /* renamed from: e  reason: collision with root package name */
        private final int f4343e;

        static {
            f4341c = new C0319ea();
        }

        private a(int i) {
            this.f4343e = i;
        }

        public static a a(int i) {
            if (i == 1) {
                return RADS;
            }
            if (i != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static Sb b() {
            return C0312da.f4398a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f4343e + " name=" + name() + '>';
        }
    }

    public static final class b extends Lb.b<Y, b> implements C0459yc {
        private b() {
            super(Y.zzf);
        }

        /* synthetic */ b(C0305ca caVar) {
            this();
        }
    }

    static {
        Y y = new Y();
        zzf = y;
        Lb.a(Y.class, y);
    }

    private Y() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0305ca.f4387a[i - 1]) {
            case 1:
                return new Y();
            case 2:
                return new b((C0305ca) null);
            case 3:
                return Lb.a((C0445wc) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zzc", "zzd", a.b(), "zze", U.class});
            case 4:
                return zzf;
            case 5:
                Dc<Y> dc = zzg;
                if (dc == null) {
                    synchronized (Y.class) {
                        dc = zzg;
                        if (dc == null) {
                            dc = new Lb.a<>(zzf);
                            zzg = dc;
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
}
