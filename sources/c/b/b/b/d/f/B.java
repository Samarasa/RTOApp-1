package c.b.b.b.d.f;

import c.b.b.b.d.f.C;
import c.b.b.b.d.f.F;
import c.b.b.b.d.f.Lb;
import java.util.List;

public final class B extends Lb<B, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final B zzi;
    private static volatile Dc<B> zzj;
    private int zzc;
    private int zzd;
    private Tb<F> zze = Lb.n();
    private Tb<C> zzf = Lb.n();
    private boolean zzg;
    private boolean zzh;

    public static final class a extends Lb.b<B, a> implements C0459yc {
        private a() {
            super(B.zzi);
        }

        /* synthetic */ a(H h2) {
            this();
        }

        public final a a(int i, C.a aVar) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((B) this.f4209b).a(i, (C) aVar.j());
            return this;
        }

        public final a a(int i, F.a aVar) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((B) this.f4209b).a(i, (F) aVar.j());
            return this;
        }

        public final F a(int i) {
            return ((B) this.f4209b).b(i);
        }

        public final C b(int i) {
            return ((B) this.f4209b).c(i);
        }

        public final int k() {
            return ((B) this.f4209b).r();
        }

        public final int l() {
            return ((B) this.f4209b).t();
        }
    }

    static {
        B b2 = new B();
        zzi = b2;
        Lb.a(B.class, b2);
    }

    private B() {
    }

    /* access modifiers changed from: private */
    public final void a(int i, C c2) {
        c2.getClass();
        if (!this.zzf.a()) {
            this.zzf = Lb.a(this.zzf);
        }
        this.zzf.set(i, c2);
    }

    /* access modifiers changed from: private */
    public final void a(int i, F f2) {
        f2.getClass();
        if (!this.zze.a()) {
            this.zze = Lb.a(this.zze);
        }
        this.zze.set(i, f2);
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (H.f4177a[i - 1]) {
            case 1:
                return new B();
            case 2:
                return new a((H) null);
            case 3:
                return Lb.a((C0445wc) zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0007\u0001\u0005\u0007\u0002", new Object[]{"zzc", "zzd", "zze", F.class, "zzf", C.class, "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                Dc<B> dc = zzj;
                if (dc == null) {
                    synchronized (B.class) {
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

    public final F b(int i) {
        return this.zze.get(i);
    }

    public final C c(int i) {
        return this.zzf.get(i);
    }

    public final boolean o() {
        return (this.zzc & 1) != 0;
    }

    public final int p() {
        return this.zzd;
    }

    public final List<F> q() {
        return this.zze;
    }

    public final int r() {
        return this.zze.size();
    }

    public final List<C> s() {
        return this.zzf;
    }

    public final int t() {
        return this.zzf.size();
    }
}
