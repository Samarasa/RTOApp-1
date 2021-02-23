package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class N extends Lb<N, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final N zzf;
    private static volatile Dc<N> zzg;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;

    public static final class a extends Lb.b<N, a> implements C0459yc {
        private a() {
            super(N.zzf);
        }

        /* synthetic */ a(P p) {
            this();
        }
    }

    static {
        N n = new N();
        zzf = n;
        Lb.a(N.class, n);
    }

    private N() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (P.f4261a[i - 1]) {
            case 1:
                return new N();
            case 2:
                return new a((P) null);
            case 3:
                return Lb.a((C0445wc) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                Dc<N> dc = zzg;
                if (dc == null) {
                    synchronized (N.class) {
                        dc = zzg;
                        if (dc == null) {
                            dc = new Lb.a<>(zzf);
                            zzg = dc;
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

    public final String p() {
        return this.zze;
    }
}
