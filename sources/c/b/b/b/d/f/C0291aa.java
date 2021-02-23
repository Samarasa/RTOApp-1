package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import java.util.List;

/* renamed from: c.b.b.b.d.f.aa  reason: case insensitive filesystem */
public final class C0291aa extends Lb<C0291aa, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final C0291aa zzf;
    private static volatile Dc<C0291aa> zzg;
    private int zzc;
    private int zzd;
    private Ub zze = Lb.m();

    /* renamed from: c.b.b.b.d.f.aa$a */
    public static final class a extends Lb.b<C0291aa, a> implements C0459yc {
        private a() {
            super(C0291aa.zzf);
        }

        /* synthetic */ a(C0305ca caVar) {
            this();
        }

        public final a a(int i) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0291aa) this.f4209b).c(i);
            return this;
        }

        public final a a(long j) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0291aa) this.f4209b).a(j);
            return this;
        }

        public final a a(Iterable<? extends Long> iterable) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0291aa) this.f4209b).a(iterable);
            return this;
        }

        public final a k() {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((C0291aa) this.f4209b).v();
            return this;
        }
    }

    static {
        C0291aa aaVar = new C0291aa();
        zzf = aaVar;
        Lb.a(C0291aa.class, aaVar);
    }

    private C0291aa() {
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        u();
        this.zze.a(j);
    }

    /* access modifiers changed from: private */
    public final void a(Iterable<? extends Long> iterable) {
        u();
        Xa.a(iterable, this.zze);
    }

    /* access modifiers changed from: private */
    public final void c(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    public static a s() {
        return (a) zzf.i();
    }

    private final void u() {
        if (!this.zze.a()) {
            this.zze = Lb.a(this.zze);
        }
    }

    /* access modifiers changed from: private */
    public final void v() {
        this.zze = Lb.m();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0305ca.f4387a[i - 1]) {
            case 1:
                return new C0291aa();
            case 2:
                return new a((C0305ca) null);
            case 3:
                return Lb.a((C0445wc) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                Dc<C0291aa> dc = zzg;
                if (dc == null) {
                    synchronized (C0291aa.class) {
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

    public final long b(int i) {
        return this.zze.b(i);
    }

    public final boolean o() {
        return (this.zzc & 1) != 0;
    }

    public final int p() {
        return this.zzd;
    }

    public final List<Long> q() {
        return this.zze;
    }

    public final int r() {
        return this.zze.size();
    }
}
