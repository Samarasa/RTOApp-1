package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;

public final class S extends Lb<S, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final S zzf;
    private static volatile Dc<S> zzg;
    private int zzc;
    private int zzd;
    private long zze;

    public static final class a extends Lb.b<S, a> implements C0459yc {
        private a() {
            super(S.zzf);
        }

        /* synthetic */ a(C0305ca caVar) {
            this();
        }

        public final a a(int i) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((S) this.f4209b).b(i);
            return this;
        }

        public final a a(long j) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((S) this.f4209b).a(j);
            return this;
        }
    }

    static {
        S s = new S();
        zzf = s;
        Lb.a(S.class, s);
    }

    private S() {
    }

    /* access modifiers changed from: private */
    public final void a(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    /* access modifiers changed from: private */
    public final void b(int i) {
        this.zzc |= 1;
        this.zzd = i;
    }

    public static a s() {
        return (a) zzf.i();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0305ca.f4387a[i - 1]) {
            case 1:
                return new S();
            case 2:
                return new a((C0305ca) null);
            case 3:
                return Lb.a((C0445wc) zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0002\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                Dc<S> dc = zzg;
                if (dc == null) {
                    synchronized (S.class) {
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

    public final boolean o() {
        return (this.zzc & 1) != 0;
    }

    public final int p() {
        return this.zzd;
    }

    public final boolean q() {
        return (this.zzc & 2) != 0;
    }

    public final long r() {
        return this.zze;
    }
}
