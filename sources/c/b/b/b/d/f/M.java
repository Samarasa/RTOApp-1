package c.b.b.b.d.f;

import c.b.b.b.d.f.L;
import c.b.b.b.d.f.Lb;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Collections;
import java.util.List;

public final class M extends Lb<M, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final M zzl;
    private static volatile Dc<M> zzm;
    private int zzc;
    private long zzd;
    private String zze = BuildConfig.FLAVOR;
    private int zzf;
    private Tb<N> zzg = Lb.n();
    private Tb<L> zzh = Lb.n();
    private Tb<B> zzi = Lb.n();
    private String zzj = BuildConfig.FLAVOR;
    private boolean zzk;

    public static final class a extends Lb.b<M, a> implements C0459yc {
        private a() {
            super(M.zzl);
        }

        /* synthetic */ a(P p) {
            this();
        }

        public final L a(int i) {
            return ((M) this.f4209b).b(i);
        }

        public final a a(int i, L.a aVar) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((M) this.f4209b).a(i, (L) aVar.j());
            return this;
        }

        public final int k() {
            return ((M) this.f4209b).t();
        }

        public final List<B> l() {
            return Collections.unmodifiableList(((M) this.f4209b).u());
        }

        public final a m() {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((M) this.f4209b).z();
            return this;
        }
    }

    static {
        M m = new M();
        zzl = m;
        Lb.a(M.class, m);
    }

    private M() {
    }

    /* access modifiers changed from: private */
    public final void a(int i, L l) {
        l.getClass();
        if (!this.zzh.a()) {
            this.zzh = Lb.a(this.zzh);
        }
        this.zzh.set(i, l);
    }

    public static a w() {
        return (a) zzl.i();
    }

    public static M x() {
        return zzl;
    }

    /* access modifiers changed from: private */
    public final void z() {
        this.zzi = Lb.n();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (P.f4261a[i - 1]) {
            case 1:
                return new M();
            case 2:
                return new a((P) null);
            case 3:
                return Lb.a((C0445wc) zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\b\u0003\b\u0007\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", N.class, "zzh", L.class, "zzi", B.class, "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                Dc<M> dc = zzm;
                if (dc == null) {
                    synchronized (M.class) {
                        dc = zzm;
                        if (dc == null) {
                            dc = new Lb.a<>(zzl);
                            zzm = dc;
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

    public final L b(int i) {
        return this.zzh.get(i);
    }

    public final boolean o() {
        return (this.zzc & 1) != 0;
    }

    public final long p() {
        return this.zzd;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final String r() {
        return this.zze;
    }

    public final List<N> s() {
        return this.zzg;
    }

    public final int t() {
        return this.zzh.size();
    }

    public final List<B> u() {
        return this.zzi;
    }

    public final boolean v() {
        return this.zzk;
    }
}
