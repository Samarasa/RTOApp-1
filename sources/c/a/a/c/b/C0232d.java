package c.a.a.c.b;

import c.a.a.c.a;
import c.a.a.c.a.d;
import c.a.a.c.b.C0235g;
import c.a.a.c.c.u;
import c.a.a.c.h;
import java.io.File;
import java.util.List;

/* renamed from: c.a.a.c.b.d  reason: case insensitive filesystem */
class C0232d implements C0235g, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final List<h> f3131a;

    /* renamed from: b  reason: collision with root package name */
    private final C0236h<?> f3132b;

    /* renamed from: c  reason: collision with root package name */
    private final C0235g.a f3133c;

    /* renamed from: d  reason: collision with root package name */
    private int f3134d;

    /* renamed from: e  reason: collision with root package name */
    private h f3135e;

    /* renamed from: f  reason: collision with root package name */
    private List<u<File, ?>> f3136f;

    /* renamed from: g  reason: collision with root package name */
    private int f3137g;

    /* renamed from: h  reason: collision with root package name */
    private volatile u.a<?> f3138h;
    private File i;

    C0232d(C0236h<?> hVar, C0235g.a aVar) {
        this(hVar.c(), hVar, aVar);
    }

    C0232d(List<h> list, C0236h<?> hVar, C0235g.a aVar) {
        this.f3134d = -1;
        this.f3131a = list;
        this.f3132b = hVar;
        this.f3133c = aVar;
    }

    private boolean b() {
        return this.f3137g < this.f3136f.size();
    }

    public void a(Exception exc) {
        this.f3133c.a(this.f3135e, exc, this.f3138h.f3328c, a.DATA_DISK_CACHE);
    }

    public void a(Object obj) {
        this.f3133c.a(this.f3135e, obj, this.f3138h.f3328c, a.DATA_DISK_CACHE, this.f3135e);
    }

    public boolean a() {
        while (true) {
            boolean z = false;
            if (this.f3136f == null || !b()) {
                this.f3134d++;
                if (this.f3134d >= this.f3131a.size()) {
                    return false;
                }
                h hVar = this.f3131a.get(this.f3134d);
                this.i = this.f3132b.d().a(new C0233e(hVar, this.f3132b.k()));
                File file = this.i;
                if (file != null) {
                    this.f3135e = hVar;
                    this.f3136f = this.f3132b.a(file);
                    this.f3137g = 0;
                }
            } else {
                this.f3138h = null;
                while (!z && b()) {
                    List<u<File, ?>> list = this.f3136f;
                    int i2 = this.f3137g;
                    this.f3137g = i2 + 1;
                    this.f3138h = list.get(i2).a(this.i, this.f3132b.m(), this.f3132b.f(), this.f3132b.h());
                    if (this.f3138h != null && this.f3132b.c(this.f3138h.f3328c.a())) {
                        this.f3138h.f3328c.a(this.f3132b.i(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    public void cancel() {
        u.a<?> aVar = this.f3138h;
        if (aVar != null) {
            aVar.f3328c.cancel();
        }
    }
}
