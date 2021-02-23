package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import java.util.List;

public final class Z extends Lb<Z, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final Z zzg;
    private static volatile Dc<Z> zzh;
    private Ub zzc = Lb.m();
    private Ub zzd = Lb.m();
    private Tb<S> zze = Lb.n();
    private Tb<C0291aa> zzf = Lb.n();

    public static final class a extends Lb.b<Z, a> implements C0459yc {
        private a() {
            super(Z.zzg);
        }

        /* synthetic */ a(C0305ca caVar) {
            this();
        }

        public final a a(int i) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Z) this.f4209b).d(i);
            return this;
        }

        public final a a(Iterable<? extends Long> iterable) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Z) this.f4209b).a(iterable);
            return this;
        }

        public final a b(int i) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Z) this.f4209b).e(i);
            return this;
        }

        public final a b(Iterable<? extends Long> iterable) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Z) this.f4209b).b(iterable);
            return this;
        }

        public final a c(Iterable<? extends S> iterable) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Z) this.f4209b).c(iterable);
            return this;
        }

        public final a d(Iterable<? extends C0291aa> iterable) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Z) this.f4209b).d(iterable);
            return this;
        }

        public final a k() {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Z) this.f4209b).z();
            return this;
        }

        public final a l() {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Z) this.f4209b).A();
            return this;
        }
    }

    static {
        Z z = new Z();
        zzg = z;
        Lb.a(Z.class, z);
    }

    private Z() {
    }

    /* access modifiers changed from: private */
    public final void A() {
        this.zzd = Lb.m();
    }

    private final void B() {
        if (!this.zze.a()) {
            this.zze = Lb.a(this.zze);
        }
    }

    private final void C() {
        if (!this.zzf.a()) {
            this.zzf = Lb.a(this.zzf);
        }
    }

    /* access modifiers changed from: private */
    public final void a(Iterable<? extends Long> iterable) {
        if (!this.zzc.a()) {
            this.zzc = Lb.a(this.zzc);
        }
        Xa.a(iterable, this.zzc);
    }

    /* access modifiers changed from: private */
    public final void b(Iterable<? extends Long> iterable) {
        if (!this.zzd.a()) {
            this.zzd = Lb.a(this.zzd);
        }
        Xa.a(iterable, this.zzd);
    }

    /* access modifiers changed from: private */
    public final void c(Iterable<? extends S> iterable) {
        B();
        Xa.a(iterable, this.zze);
    }

    /* access modifiers changed from: private */
    public final void d(int i) {
        B();
        this.zze.remove(i);
    }

    /* access modifiers changed from: private */
    public final void d(Iterable<? extends C0291aa> iterable) {
        C();
        Xa.a(iterable, this.zzf);
    }

    /* access modifiers changed from: private */
    public final void e(int i) {
        C();
        this.zzf.remove(i);
    }

    public static a w() {
        return (a) zzg.i();
    }

    public static Z x() {
        return zzg;
    }

    /* access modifiers changed from: private */
    public final void z() {
        this.zzc = Lb.m();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0305ca.f4387a[i - 1]) {
            case 1:
                return new Z();
            case 2:
                return new a((C0305ca) null);
            case 3:
                return Lb.a((C0445wc) zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", S.class, "zzf", C0291aa.class});
            case 4:
                return zzg;
            case 5:
                Dc<Z> dc = zzh;
                if (dc == null) {
                    synchronized (Z.class) {
                        dc = zzh;
                        if (dc == null) {
                            dc = new Lb.a<>(zzg);
                            zzh = dc;
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

    public final S b(int i) {
        return this.zze.get(i);
    }

    public final C0291aa c(int i) {
        return this.zzf.get(i);
    }

    public final List<Long> o() {
        return this.zzc;
    }

    public final int p() {
        return this.zzc.size();
    }

    public final List<Long> q() {
        return this.zzd;
    }

    public final int r() {
        return this.zzd.size();
    }

    public final List<S> s() {
        return this.zze;
    }

    public final int t() {
        return this.zze.size();
    }

    public final List<C0291aa> u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }
}
