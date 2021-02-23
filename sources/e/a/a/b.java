package e.a.a;

import c.b.e.C0481f;
import c.b.e.C0483h;
import c.b.e.C0487l;
import c.b.e.n;
import c.b.e.u;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;

public final class b extends C0487l<b, a> implements c {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final b f14817d = new b();

    /* renamed from: e  reason: collision with root package name */
    private static volatile u<b> f14818e;

    /* renamed from: f  reason: collision with root package name */
    private String f14819f = BuildConfig.FLAVOR;

    public static final class a extends C0487l.a<b, a> implements c {
        private a() {
            super(b.f14817d);
        }

        /* synthetic */ a(a aVar) {
            this();
        }
    }

    static {
        f14817d.f();
    }

    private b() {
    }

    public static u<b> i() {
        return f14817d.c();
    }

    /* access modifiers changed from: protected */
    public final Object a(C0487l.i iVar, Object obj, Object obj2) {
        switch (a.f14816a[iVar.ordinal()]) {
            case 1:
                return new b();
            case 2:
                return f14817d;
            case 3:
                return null;
            case 4:
                return new a((a) null);
            case 5:
                b bVar = (b) obj2;
                this.f14819f = ((C0487l.j) obj).a(!this.f14819f.isEmpty(), this.f14819f, true ^ bVar.f14819f.isEmpty(), bVar.f14819f);
                C0487l.h hVar = C0487l.h.f5045a;
                return this;
            case 6:
                C0481f fVar = (C0481f) obj;
                C0483h hVar2 = (C0483h) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int q = fVar.q();
                        if (q != 0) {
                            if (q == 10) {
                                this.f14819f = fVar.p();
                            } else if (!fVar.d(q)) {
                            }
                        }
                        z = true;
                    } catch (n e2) {
                        e2.a(this);
                        throw new RuntimeException(e2);
                    } catch (IOException e3) {
                        n nVar = new n(e3.getMessage());
                        nVar.a(this);
                        throw new RuntimeException(nVar);
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f14818e == null) {
                    synchronized (b.class) {
                        if (f14818e == null) {
                            f14818e = new C0487l.b(f14817d);
                        }
                    }
                }
                return f14818e;
            default:
                throw new UnsupportedOperationException();
        }
        return f14817d;
    }
}
