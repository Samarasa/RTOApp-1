package b.f.a.a;

public class q extends r {

    /* renamed from: c  reason: collision with root package name */
    float f2319c = 0.0f;

    public void a(int i) {
        if (this.f2321b == 0 || this.f2319c != ((float) i)) {
            this.f2319c = (float) i;
            if (this.f2321b == 1) {
                b();
            }
            a();
        }
    }

    public void d() {
        super.d();
        this.f2319c = 0.0f;
    }

    public void f() {
        this.f2321b = 2;
    }
}
