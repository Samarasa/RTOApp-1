package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.List;

public final class C extends Lb<C, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final C zzl;
    private static volatile Dc<C> zzm;
    private int zzc;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private Tb<D> zzf = Lb.n();
    private boolean zzg;
    private E zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends Lb.b<C, a> implements C0459yc {
        private a() {
            super(C.zzl);
        }

        /* synthetic */ a(H h2) {
            this();
        }

        public final a a(int i, D d2) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C) this.f4209b).a(i, d2);
            return this;
        }

        public final a a(String str) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C) this.f4209b).a(str);
            return this;
        }

        public final D a(int i) {
            return ((C) this.f4209b).b(i);
        }

        public final String k() {
            return ((C) this.f4209b).q();
        }

        public final int l() {
            return ((C) this.f4209b).s();
        }
    }

    static {
        C c2 = new C();
        zzl = c2;
        Lb.a(C.class, c2);
    }

    private C() {
    }

    /* access modifiers changed from: private */
    public final void a(int i, D d2) {
        d2.getClass();
        if (!this.zzf.a()) {
            this.zzf = Lb.a(this.zzf);
        }
        this.zzf.set(i, d2);
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a z() {
        return (a) zzl.i();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (H.f4177a[i - 1]) {
            case 1:
                return new C();
            case 2:
                return new a((H) null);
            case 3:
                return Lb.a((C0445wc) zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b\u0004\u0007\u0002\u0005\t\u0003\u0006\u0007\u0004\u0007\u0007\u0005\b\u0007\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", D.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzl;
            case 5:
                Dc<C> dc = zzm;
                if (dc == null) {
                    synchronized (C.class) {
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

    public final D b(int i) {
        return this.zzf.get(i);
    }

    public final boolean o() {
        return (this.zzc & 1) != 0;
    }

    public final int p() {
        return this.zzd;
    }

    public final String q() {
        return this.zze;
    }

    public final List<D> r() {
        return this.zzf;
    }

    public final int s() {
        return this.zzf.size();
    }

    public final boolean t() {
        return (this.zzc & 8) != 0;
    }

    public final E u() {
        E e2 = this.zzh;
        return e2 == null ? E.y() : e2;
    }

    public final boolean v() {
        return this.zzi;
    }

    public final boolean w() {
        return this.zzj;
    }

    public final boolean x() {
        return (this.zzc & 64) != 0;
    }

    public final boolean y() {
        return this.zzk;
    }
}
