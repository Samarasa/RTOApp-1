package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class F extends Lb<F, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final F zzj;
    private static volatile Dc<F> zzk;
    private int zzc;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private D zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public static final class a extends Lb.b<F, a> implements C0459yc {
        private a() {
            super(F.zzj);
        }

        /* synthetic */ a(H h2) {
            this();
        }

        public final a a(String str) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((F) this.f4209b).a(str);
            return this;
        }
    }

    static {
        F f2 = new F();
        zzj = f2;
        Lb.a(F.class, f2);
    }

    private F() {
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 2;
        this.zze = str;
    }

    public static a w() {
        return (a) zzj.i();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (H.f4177a[i - 1]) {
            case 1:
                return new F();
            case 2:
                return new a((H) null);
            case 3:
                return Lb.a((C0445wc) zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                Dc<F> dc = zzk;
                if (dc == null) {
                    synchronized (F.class) {
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

    public final int p() {
        return this.zzd;
    }

    public final String q() {
        return this.zze;
    }

    public final D r() {
        D d2 = this.zzf;
        return d2 == null ? D.v() : d2;
    }

    public final boolean s() {
        return this.zzg;
    }

    public final boolean t() {
        return this.zzh;
    }

    public final boolean u() {
        return (this.zzc & 32) != 0;
    }

    public final boolean v() {
        return this.zzi;
    }
}
