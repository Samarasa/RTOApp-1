package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class D extends Lb<D, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final D zzh;
    private static volatile Dc<D> zzi;
    private int zzc;
    private G zzd;
    private E zze;
    private boolean zzf;
    private String zzg = BuildConfig.FLAVOR;

    public static final class a extends Lb.b<D, a> implements C0459yc {
        private a() {
            super(D.zzh);
        }

        /* synthetic */ a(H h2) {
            this();
        }

        public final a a(String str) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((D) this.f4209b).a(str);
            return this;
        }
    }

    static {
        D d2 = new D();
        zzh = d2;
        Lb.a(D.class, d2);
    }

    private D() {
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 8;
        this.zzg = str;
    }

    public static D v() {
        return zzh;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (H.f4177a[i - 1]) {
            case 1:
                return new D();
            case 2:
                return new a((H) null);
            case 3:
                return Lb.a((C0445wc) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\b\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                Dc<D> dc = zzi;
                if (dc == null) {
                    synchronized (D.class) {
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

    public final G p() {
        G g2 = this.zzd;
        return g2 == null ? G.w() : g2;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final E r() {
        E e2 = this.zze;
        return e2 == null ? E.y() : e2;
    }

    public final boolean s() {
        return (this.zzc & 4) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }
}
