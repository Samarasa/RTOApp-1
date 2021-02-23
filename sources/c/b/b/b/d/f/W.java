package c.b.b.b.d.f;

import c.b.b.b.d.f.Lb;
import c.b.b.b.d.f.X;
import java.util.List;

public final class W extends Lb<W, a> implements C0459yc {
    /* access modifiers changed from: private */
    public static final W zzd;
    private static volatile Dc<W> zze;
    private Tb<X> zzc = Lb.n();

    public static final class a extends Lb.b<W, a> implements C0459yc {
        private a() {
            super(W.zzd);
        }

        /* synthetic */ a(C0305ca caVar) {
            this();
        }

        public final a a(X.a aVar) {
            if (this.f4210c) {
                g();
                this.f4210c = false;
            }
            ((W) this.f4209b).a((X) aVar.j());
            return this;
        }

        public final X a(int i) {
            return ((W) this.f4209b).b(0);
        }
    }

    static {
        W w = new W();
        zzd = w;
        Lb.a(W.class, w);
    }

    private W() {
    }

    /* access modifiers changed from: private */
    public final void a(X x) {
        x.getClass();
        if (!this.zzc.a()) {
            this.zzc = Lb.a(this.zzc);
        }
        this.zzc.add(x);
    }

    public static a p() {
        return (a) zzd.i();
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj, Object obj2) {
        switch (C0305ca.f4387a[i - 1]) {
            case 1:
                return new W();
            case 2:
                return new a((C0305ca) null);
            case 3:
                return Lb.a((C0445wc) zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", X.class});
            case 4:
                return zzd;
            case 5:
                Dc<W> dc = zze;
                if (dc == null) {
                    synchronized (W.class) {
                        dc = zze;
                        if (dc == null) {
                            dc = new Lb.a<>(zzd);
                            zze = dc;
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

    public final X b(int i) {
        return this.zzc.get(0);
    }

    public final List<X> o() {
        return this.zzc;
    }
}
