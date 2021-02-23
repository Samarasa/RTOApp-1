package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class U extends Lb<U, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final U zzf;
    private static volatile Dc<U> zzg;
    private int zzc;
    private String zzd = BuildConfig.FLAVOR;
    private long zze;

    public static final class a extends Lb.b<U, a> implements C0459yc {
        private a() {
            super(U.zzf);
        }

        /* synthetic */ a(C0305ca caVar) {
            this();
        }
    }

    static {
        U u = new U();
        zzf = u;
        Lb.a(U.class, u);
    }

    private U() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0305ca.f4387a[i - 1]) {
            case 1:
                return new U();
            case 2:
                return new a((C0305ca) null);
            case 3:
                return Lb.a((C0445wc) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                Dc<U> dc = zzg;
                if (dc == null) {
                    synchronized (U.class) {
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
}
