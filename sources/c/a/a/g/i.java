package c.a.a.g;

public class i implements c, b {

    /* renamed from: a  reason: collision with root package name */
    private final c f3613a;

    /* renamed from: b  reason: collision with root package name */
    private b f3614b;

    /* renamed from: c  reason: collision with root package name */
    private b f3615c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3616d;

    i() {
        this((c) null);
    }

    public i(c cVar) {
        this.f3613a = cVar;
    }

    private boolean g() {
        c cVar = this.f3613a;
        return cVar == null || cVar.f(this);
    }

    private boolean h() {
        c cVar = this.f3613a;
        return cVar == null || cVar.c(this);
    }

    private boolean i() {
        c cVar = this.f3613a;
        return cVar == null || cVar.d(this);
    }

    private boolean j() {
        c cVar = this.f3613a;
        return cVar != null && cVar.d();
    }

    public void a() {
        this.f3614b.a();
        this.f3615c.a();
    }

    public void a(b bVar, b bVar2) {
        this.f3614b = bVar;
        this.f3615c = bVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(c.a.a.g.b r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof c.a.a.g.i
            r1 = 0
            if (r0 == 0) goto L_0x002a
            c.a.a.g.i r4 = (c.a.a.g.i) r4
            c.a.a.g.b r0 = r3.f3614b
            if (r0 != 0) goto L_0x0010
            c.a.a.g.b r0 = r4.f3614b
            if (r0 != 0) goto L_0x002a
            goto L_0x0018
        L_0x0010:
            c.a.a.g.b r2 = r4.f3614b
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto L_0x002a
        L_0x0018:
            c.a.a.g.b r0 = r3.f3615c
            if (r0 != 0) goto L_0x0021
            c.a.a.g.b r4 = r4.f3615c
            if (r4 != 0) goto L_0x002a
            goto L_0x0029
        L_0x0021:
            c.a.a.g.b r4 = r4.f3615c
            boolean r4 = r0.a(r4)
            if (r4 == 0) goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.g.i.a(c.a.a.g.b):boolean");
    }

    public void b(b bVar) {
        c cVar;
        if (bVar.equals(this.f3614b) && (cVar = this.f3613a) != null) {
            cVar.b(this);
        }
    }

    public boolean b() {
        return this.f3614b.b() || this.f3615c.b();
    }

    public boolean c() {
        return this.f3614b.c();
    }

    public boolean c(b bVar) {
        return h() && bVar.equals(this.f3614b) && !d();
    }

    public void clear() {
        this.f3616d = false;
        this.f3615c.clear();
        this.f3614b.clear();
    }

    public boolean d() {
        return j() || b();
    }

    public boolean d(b bVar) {
        return i() && (bVar.equals(this.f3614b) || !this.f3614b.b());
    }

    public void e(b bVar) {
        if (!bVar.equals(this.f3615c)) {
            c cVar = this.f3613a;
            if (cVar != null) {
                cVar.e(this);
            }
            if (!this.f3615c.isComplete()) {
                this.f3615c.clear();
            }
        }
    }

    public boolean e() {
        return this.f3614b.e();
    }

    public void f() {
        this.f3616d = true;
        if (!this.f3614b.isComplete() && !this.f3615c.isRunning()) {
            this.f3615c.f();
        }
        if (this.f3616d && !this.f3614b.isRunning()) {
            this.f3614b.f();
        }
    }

    public boolean f(b bVar) {
        return g() && bVar.equals(this.f3614b);
    }

    public boolean isComplete() {
        return this.f3614b.isComplete() || this.f3615c.isComplete();
    }

    public boolean isRunning() {
        return this.f3614b.isRunning();
    }
}
