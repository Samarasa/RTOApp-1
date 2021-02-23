package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class L extends Lb<L, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final L zzh;
    private static volatile Dc<L> zzi;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public static final class a extends Lb.b<L, a> implements C0459yc {
        private a() {
            super(L.zzh);
        }

        /* synthetic */ a(P p) {
            this();
        }

        public final a a(String str) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((L) this.f4209b).a(str);
            return this;
        }

        public final String k() {
            return ((L) this.f4209b).o();
        }

        public final boolean l() {
            return ((L) this.f4209b).p();
        }

        public final boolean m() {
            return ((L) this.f4209b).q();
        }

        public final boolean n() {
            return ((L) this.f4209b).r();
        }

        public final int o() {
            return ((L) this.f4209b).s();
        }
    }

    static {
        L l = new L();
        zzh = l;
        Lb.a(L.class, l);
    }

    private L() {
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zzd = str;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (P.f4261a[i - 1]) {
            case 1:
                return new L();
            case 2:
                return new a((P) null);
            case 3:
                return Lb.a((C0445wc) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0004\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                Dc<L> dc = zzi;
                if (dc == null) {
                    synchronized (L.class) {
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

    public final String o() {
        return this.zzd;
    }

    public final boolean p() {
        return this.zze;
    }

    public final boolean q() {
        return this.zzf;
    }

    public final boolean r() {
        return (this.zzc & 8) != 0;
    }

    public final int s() {
        return this.zzg;
    }
}
