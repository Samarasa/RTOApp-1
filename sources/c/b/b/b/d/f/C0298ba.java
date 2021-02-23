package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

/* renamed from: c.b.b.b.d.f.ba  reason: case insensitive filesystem */
public final class C0298ba extends Lb<C0298ba, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final C0298ba zzj;
    private static volatile Dc<C0298ba> zzk;
    private int zzc;
    private long zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private float zzh;
    private double zzi;

    /* renamed from: c.b.b.b.d.f.ba$a */
    public static final class a extends Lb.b<C0298ba, a> implements C0459yc {
        private a() {
            super(C0298ba.zzj);
        }

        /* synthetic */ a(C0305ca caVar) {
            this();
        }

        public final a a(double d2) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0298ba) this.f4209b).a(d2);
            return this;
        }

        public final a a(long j) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0298ba) this.f4209b).a(j);
            return this;
        }

        public final a a(String str) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0298ba) this.f4209b).a(str);
            return this;
        }

        public final a b(long j) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0298ba) this.f4209b).b(j);
            return this;
        }

        public final a b(String str) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0298ba) this.f4209b).b(str);
            return this;
        }

        public final a k() {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0298ba) this.f4209b).z();
            return this;
        }

        public final a l() {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0298ba) this.f4209b).A();
            return this;
        }

        public final a m() {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0298ba) this.f4209b).B();
            return this;
        }
    }

    static {
        C0298ba baVar = new C0298ba();
        zzj = baVar;
        Lb.a(C0298ba.class, baVar);
    }

    private C0298ba() {
    }

    /* access modifiers changed from: private */
    public final void A() {
        this.zzc &= -9;
        this.zzg = 0;
    }

    /* access modifiers changed from: private */
    public final void B() {
        this.zzc &= -33;
        this.zzi = 0.0d;
    }

    /* access modifiers changed from: private */
    public final void a(double d2) {
        this.zzc |= 32;
        this.zzi = d2;
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 1;
        this.zzd = j;
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    /* access modifiers changed from: private */
    public final void b(String str) {
        str.getClass();
        this.zzc |= 4;
        this.zzf = str;
    }

    public static a x() {
        return (a) zzj.i();
    }

    /* access modifiers changed from: private */
    public final void z() {
        this.zzc &= -5;
        this.zzf = zzj.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0305ca.f4387a[i - 1]) {
            case 1:
                return new C0298ba();
            case 2:
                return new a((C0305ca) null);
            case 3:
                return Lb.a((C0445wc) zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u0001\u0004\u0006\u0000\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                Dc<C0298ba> dc = zzk;
                if (dc == null) {
                    synchronized (C0298ba.class) {
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

    public final boolean o() {
        return (this.zzc & 1) != 0;
    }

    public final long p() {
        return this.zzd;
    }

    public final String q() {
        return this.zze;
    }

    public final boolean r() {
        return (this.zzc & 4) != 0;
    }

    public final String s() {
        return this.zzf;
    }

    public final boolean t() {
        return (this.zzc & 8) != 0;
    }

    public final long u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zzc & 32) != 0;
    }

    public final double w() {
        return this.zzi;
    }
}
