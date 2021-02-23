package c.a.a.c.b;

import c.a.a.c.a;
import c.a.a.c.a.d;
import c.a.a.c.b.C0235g;
import c.a.a.c.c.u;
import c.a.a.c.h;
import java.io.File;
import java.util.List;

class G implements C0235g, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final C0235g.a f3005a;

    /* renamed from: b  reason: collision with root package name */
    private final C0236h<?> f3006b;

    /* renamed from: c  reason: collision with root package name */
    private int f3007c;

    /* renamed from: d  reason: collision with root package name */
    private int f3008d = -1;

    /* renamed from: e  reason: collision with root package name */
    private h f3009e;

    /* renamed from: f  reason: collision with root package name */
    private List<u<File, ?>> f3010f;

    /* renamed from: g  reason: collision with root package name */
    private int f3011g;

    /* renamed from: h  reason: collision with root package name */
    private volatile u.a<?> f3012h;
    private File i;
    private H j;

    G(C0236h<?> hVar, C0235g.a aVar) {
        this.f3006b = hVar;
        this.f3005a = aVar;
    }

    private boolean b() {
        return this.f3011g < this.f3010f.size();
    }

    public void a(Exception exc) {
        this.f3005a.a(this.j, exc, this.f3012h.f3328c, a.RESOURCE_DISK_CACHE);
    }

    public void a(Object obj) {
        this.f3005a.a(this.f3009e, obj, this.f3012h.f3328c, a.RESOURCE_DISK_CACHE, this.j);
    }

    public boolean a() {
        List<h> c2 = this.f3006b.c();
        boolean z = false;
        if (c2.isEmpty()) {
            return false;
        }
        List<Class<?>> j2 = this.f3006b.j();
        if (j2.isEmpty() && File.class.equals(this.f3006b.l())) {
            return false;
        }
        while (true) {
            if (this.f3010f == null || !b()) {
                this.f3008d++;
                if (this.f3008d >= j2.size()) {
                    this.f3007c++;
                    if (this.f3007c >= c2.size()) {
                        return false;
                    }
                    this.f3008d = 0;
                }
                h hVar = c2.get(this.f3007c);
                Class cls = j2.get(this.f3008d);
                this.j = new H(this.f3006b.b(), hVar, this.f3006b.k(), this.f3006b.m(), this.f3006b.f(), this.f3006b.b(cls), cls, this.f3006b.h());
                this.i = this.f3006b.d().a(this.j);
                File file = this.i;
                if (file != null) {
                    this.f3009e = hVar;
                    this.f3010f = this.f3006b.a(file);
                    this.f3011g = 0;
                }
            } else {
                this.f3012h = null;
                while (!z && b()) {
                    List<u<File, ?>> list = this.f3010f;
                    int i2 = this.f3011g;
                    this.f3011g = i2 + 1;
                    this.f3012h = list.get(i2).a(this.i, this.f3006b.m(), this.f3006b.f(), this.f3006b.h());
                    if (this.f3012h != null && this.f3006b.c(this.f3012h.f3328c.a())) {
                        this.f3012h.f3328c.a(this.f3006b.i(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    public void cancel() {
        u.a<?> aVar = this.f3012h;
        if (aVar != null) {
            aVar.f3328c.cancel();
        }
    }
}
