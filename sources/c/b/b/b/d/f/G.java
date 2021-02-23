package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.List;

public final class G extends Lb<G, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final G zzh;
    private static volatile Dc<G> zzi;
    private int zzc;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private boolean zzf;
    private Tb<String> zzg = Lb.n();

    public static final class a extends Lb.b<G, a> implements C0459yc {
        private a() {
            super(G.zzh);
        }

        /* synthetic */ a(H h2) {
            this();
        }
    }

    public enum b implements Qb {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        

        /* renamed from: h  reason: collision with root package name */
        private static final Pb<b> f4167h = null;
        private final int j;

        static {
            f4167h = new K();
        }

        private b(int i2) {
            this.j = i2;
        }

        public static b a(int i2) {
            switch (i2) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static Sb b() {
            return O.f4247a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.j + " name=" + name() + '>';
        }
    }

    static {
        G g2 = new G();
        zzh = g2;
        Lb.a(G.class, g2);
    }

    private G() {
    }

    public static G w() {
        return zzh;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (H.f4177a[i - 1]) {
            case 1:
                return new G();
            case 2:
                return new a((H) null);
            case 3:
                return Lb.a((C0445wc) zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"zzc", "zzd", b.b(), "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                Dc<G> dc = zzi;
                if (dc == null) {
                    synchronized (G.class) {
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

    public final b p() {
        b a2 = b.a(this.zzd);
        return a2 == null ? b.UNKNOWN_MATCH_TYPE : a2;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final String r() {
        return this.zze;
    }

    public final boolean s() {
        return (this.zzc & 4) != 0;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final List<String> u() {
        return this.zzg;
    }

    public final int v() {
        return this.zzg.size();
    }
}
