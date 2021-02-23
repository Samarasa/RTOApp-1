package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import c.b.b.b.d.f.V;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Collections;
import java.util.List;

public final class T extends Lb<T, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final T zzi;
    private static volatile Dc<T> zzj;
    private int zzc;
    private Tb<V> zzd = Lb.n();
    private String zze = BuildConfig.FLAVOR;
    private long zzf;
    private long zzg;
    private int zzh;

    public static final class a extends Lb.b<T, a> implements C0459yc {
        private a() {
            super(T.zzi);
        }

        /* synthetic */ a(C0305ca caVar) {
            this();
        }

        public final a a(int i, V.a aVar) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((T) this.f4209b).a(i, (V) aVar.j());
            return this;
        }

        public final a a(int i, V v) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((T) this.f4209b).a(i, v);
            return this;
        }

        public final a a(long j) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((T) this.f4209b).a(j);
            return this;
        }

        public final a a(V.a aVar) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((T) this.f4209b).a((V) aVar.j());
            return this;
        }

        public final a a(V v) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((T) this.f4209b).a(v);
            return this;
        }

        public final a a(Iterable<? extends V> iterable) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((T) this.f4209b).a(iterable);
            return this;
        }

        public final a a(String str) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((T) this.f4209b).a(str);
            return this;
        }

        public final V a(int i) {
            return ((T) this.f4209b).b(i);
        }

        public final a b(int i) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((T) this.f4209b).c(i);
            return this;
        }

        public final a b(long j) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((T) this.f4209b).b(j);
            return this;
        }

        public final List<V> k() {
            return Collections.unmodifiableList(((T) this.f4209b).o());
        }

        public final int l() {
            return ((T) this.f4209b).p();
        }

        public final a m() {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((T) this.f4209b).A();
            return this;
        }

        public final String n() {
            return ((T) this.f4209b).q();
        }

        public final long o() {
            return ((T) this.f4209b).s();
        }

        public final long p() {
            return ((T) this.f4209b).u();
        }
    }

    static {
        T t = new T();
        zzi = t;
        Lb.a(T.class, t);
    }

    private T() {
    }

    /* access modifiers changed from: private */
    public final void A() {
        this.zzd = Lb.n();
    }

    /* access modifiers changed from: private */
    public final void a(int i, V v) {
        v.getClass();
        z();
        this.zzd.set(i, v);
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 2;
        this.zzf = j;
    }

    /* access modifiers changed from: private */
    public final void a(V v) {
        v.getClass();
        z();
        this.zzd.add(v);
    }

    /* access modifiers changed from: private */
    public final void a(Iterable<? extends V> iterable) {
        z();
        Xa.a(iterable, this.zzd);
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        str.getClass();
        this.zzc |= 1;
        this.zze = str;
    }

    /* access modifiers changed from: private */
    public final void b(long j) {
        this.zzc |= 4;
        this.zzg = j;
    }

    /* access modifiers changed from: private */
    public final void c(int i) {
        z();
        this.zzd.remove(i);
    }

    public static a x() {
        return (a) zzi.i();
    }

    private final void z() {
        if (!this.zzd.a()) {
            this.zzd = Lb.a(this.zzd);
        }
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0305ca.f4387a[i - 1]) {
            case 1:
                return new T();
            case 2:
                return new a((C0305ca) null);
            case 3:
                return Lb.a((C0445wc) zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002\u0005\u0004\u0003", new Object[]{"zzc", "zzd", V.class, "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                Dc<T> dc = zzj;
                if (dc == null) {
                    synchronized (T.class) {
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

    public final V b(int i) {
        return this.zzd.get(i);
    }

    public final List<V> o() {
        return this.zzd;
    }

    public final int p() {
        return this.zzd.size();
    }

    public final String q() {
        return this.zze;
    }

    public final boolean r() {
        return (this.zzc & 2) != 0;
    }

    public final long s() {
        return this.zzf;
    }

    public final boolean t() {
        return (this.zzc & 4) != 0;
    }

    public final long u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zzc & 8) != 0;
    }

    public final int w() {
        return this.zzh;
    }
}
