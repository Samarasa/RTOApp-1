package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class V extends Lb<V, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final V zzj;
    private static volatile Dc<V> zzk;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private long zzf;
    private float zzg;
    private double zzh;
    private Tb<V> zzi = Lb.n();

    public static final class a extends Lb.b<V, a> implements C0459yc {
        private a() {
            super(V.zzj);
        }

        /* synthetic */ a(C0305ca caVar) {
            this();
        }

        public final a a(double d2) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((V) this.f4209b).a(d2);
            return this;
        }

        public final a a(long j) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((V) this.f4209b).a(j);
            return this;
        }

        public final a a(String str) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((V) this.f4209b).a(str);
            return this;
        }

        public final a b(String str) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((V) this.f4209b).b(str);
            return this;
        }

        public final a k() {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((V) this.f4209b).x();
            return this;
        }

        public final a l() {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((V) this.f4209b).y();
            return this;
        }

        public final a m() {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((V) this.f4209b).z();
            return this;
        }
    }

    static {
        V v = new V();
        zzj = v;
        Lb.a(V.class, v);
    }

    private V() {
    }

    /* access modifiers changed from: private */
    public final void a(double d2) {
        this.zzc |= 16;
        this.zzh = d2;
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a v() {
        return (a) zzj.i();
    }

    /* access modifiers changed from: private */
    public final void x() {
        this.zzc &= -3;
        this.zze = zzj.zze;
    }

    /* access modifiers changed from: private */
    public final void y() {
        this.zzc &= -5;
        this.zzf = 0;
    }

    /* access modifiers changed from: private */
    public final void z() {
        this.zzc &= -17;
        this.zzh = 0.0d;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0305ca.f4387a[i - 1]) {
            case 1:
                return new V();
            case 2:
                return new a((C0305ca) null);
            case 3:
                return Lb.a((C0445wc) zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0001\u0003\u0005\u0000\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", V.class});
            case 4:
                return zzj;
            case 5:
                Dc<V> dc = zzk;
                if (dc == null) {
                    synchronized (V.class) {
                        dc = zzk;
                        if (dc == null) {
                            dc = new Lb.a<>(zzj);
                            zzk = dc;
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

    public final String o() {
        return this.zzd;
    }

    public final boolean p() {
        return (this.zzc & 2) != 0;
    }

    public final String q() {
        return this.zze;
    }

    public final boolean r() {
        return (this.zzc & 4) != 0;
    }

    public final long s() {
        return this.zzf;
    }

    public final boolean t() {
        return (this.zzc & 16) != 0;
    }

    public final double u() {
        return this.zzh;
    }
}
