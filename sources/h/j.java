package h;

import java.util.concurrent.TimeUnit;

public class j extends y {

    /* renamed from: e  reason: collision with root package name */
    private y f15335e;

    public j(y yVar) {
        if (yVar != null) {
            this.f15335e = yVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final j a(y yVar) {
        if (yVar != null) {
            this.f15335e = yVar;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public y a() {
        return this.f15335e.a();
    }

    public y a(long j) {
        return this.f15335e.a(j);
    }

    public y a(long j, TimeUnit timeUnit) {
        return this.f15335e.a(j, timeUnit);
    }

    public y b() {
        return this.f15335e.b();
    }

    public long c() {
        return this.f15335e.c();
    }

    public boolean d() {
        return this.f15335e.d();
    }

    public void e() {
        this.f15335e.e();
    }

    public final y g() {
        return this.f15335e;
    }
}
