package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import c.b.b.b.d.f.Z;

public final class Q extends Lb<Q, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final Q zzh;
    private static volatile Dc<Q> zzi;
    private int zzc;
    private int zzd;
    private Z zze;
    private Z zzf;
    private boolean zzg;

    public static final class a extends Lb.b<Q, a> implements C0459yc {
        private a() {
            super(Q.zzh);
        }

        /* synthetic */ a(C0305ca caVar) {
            this();
        }

        public final a a(int i) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Q) this.f4209b).b(i);
            return this;
        }

        public final a a(Z.a aVar) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Q) this.f4209b).a((Z) aVar.j());
            return this;
        }

        public final a a(Z z) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Q) this.f4209b).b(z);
            return this;
        }

        public final a a(boolean z) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((Q) this.f4209b).a(z);
            return this;
        }

        public final boolean k() {
            return ((Q) this.f4209b).r();
        }

        public final Z l() {
            return ((Q) this.f4209b).s();
        }
    }

    static {
        Q q = new Q();
        zzh = q;
        Lb.a(Q.class, q);
    }

    private Q() {
    }

    /* access modifiers changed from: private */
    public final void a(Z z) {
        z.getClass();
        this.zze = z;
        this.zzc |= 2;
    }

    /* access modifiers changed from: private */
    public final void a(boolean z) {
        this.zzc |= 8;
        this.zzg = z;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    /* access modifiers changed from: private */
    public final void b(Z z) {
        z.getClass();
        this.zzf = z;
        this.zzc |= 4;
    }

    public static a v() {
        return (a) zzh.i();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0305ca.f4387a[i - 1]) {
            case 1:
                return new Q();
            case 2:
                return new a((C0305ca) null);
            case 3:
                return Lb.a((C0445wc) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\t\u0002\u0004\u0007\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                Dc<Q> dc = zzi;
                if (dc == null) {
                    synchronized (Q.class) {
                        dc = zzi;
                        if (dc == null) {
                            dc = new Lb.a<>(zzh);
                            zzi = dc;
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

    public final int p() {
        return this.zzd;
    }

    public final Z q() {
        Z z = this.zze;
        return z == null ? Z.x() : z;
    }

    public final boolean r() {
        return (this.zzc & 4) != 0;
    }

    public final Z s() {
        Z z = this.zzf;
        return z == null ? Z.x() : z;
    }

    public final boolean t() {
        return (this.zzc & 8) != 0;
    }

    public final boolean u() {
        return this.zzg;
    }
}
