package c.a.a.g;

public final class a implements c, b {

    /* renamed from: a  reason: collision with root package name */
    private final c f3569a;

    /* renamed from: b  reason: collision with root package name */
    private b f3570b;

    /* renamed from: c  reason: collision with root package name */
    private b f3571c;

    public a(c cVar) {
        this.f3569a = cVar;
    }

    private boolean g() {
        c cVar = this.f3569a;
        return cVar == null || cVar.f(this);
    }

    private boolean g(b bVar) {
        return bVar.equals(this.f3570b) || (this.f3570b.c() && bVar.equals(this.f3571c));
    }

    private boolean h() {
        c cVar = this.f3569a;
        return cVar == null || cVar.c(this);
    }

    private boolean i() {
        c cVar = this.f3569a;
        return cVar == null || cVar.d(this);
    }

    private boolean j() {
        c cVar = this.f3569a;
        return cVar != null && cVar.d();
    }

    public void a() {
        this.f3570b.a();
        this.f3571c.a();
    }

    public void a(b bVar, b bVar2) {
        this.f3570b = bVar;
        this.f3571c = bVar2;
    }

    public boolean a(b bVar) {
        if (!(bVar instanceof a)) {
            return false;
        }
        a aVar = (a) bVar;
        return this.f3570b.a(aVar.f3570b) && this.f3571c.a(aVar.f3571c);
    }

    public void b(b bVar) {
        if (bVar.equals(this.f3571c)) {
            c cVar = this.f3569a;
            if (cVar != null) {
                cVar.b(this);
            }
        } else if (!this.f3571c.isRunning()) {
            this.f3571c.f();
        }
    }

    public boolean b() {
        return (this.f3570b.c() ? this.f3571c : this.f3570b).b();
    }

    public boolean c() {
        return this.f3570b.c() && this.f3571c.c();
    }

    public boolean c(b bVar) {
        return h() && g(bVar);
    }

    public void clear() {
        this.f3570b.clear();
        if (this.f3571c.isRunning()) {
            this.f3571c.clear();
        }
    }

    public boolean d() {
        return j() || b();
    }

    public boolean d(b bVar) {
        return i() && g(bVar);
    }

    public void e(b bVar) {
        c cVar = this.f3569a;
        if (cVar != null) {
            cVar.e(this);
        }
    }

    public boolean e() {
        return (this.f3570b.c() ? this.f3571c : this.f3570b).e();
    }

    public void f() {
        if (!this.f3570b.isRunning()) {
            this.f3570b.f();
        }
    }

    public boolean f(b bVar) {
        return g() && g(bVar);
    }

    public boolean isComplete() {
        return (this.f3570b.c() ? this.f3571c : this.f3570b).isComplete();
    }

    public boolean isRunning() {
        return (this.f3570b.c() ? this.f3571c : this.f3570b).isRunning();
    }
}
