package b.b.a.a;

import java.util.concurrent.Executor;

public class c extends f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f2137a;

    /* renamed from: b  reason: collision with root package name */
    private static final Executor f2138b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final Executor f2139c = new b();

    /* renamed from: d  reason: collision with root package name */
    private f f2140d = this.f2141e;

    /* renamed from: e  reason: collision with root package name */
    private f f2141e = new e();

    private c() {
    }

    public static Executor b() {
        return f2139c;
    }

    public static c c() {
        if (f2137a != null) {
            return f2137a;
        }
        synchronized (c.class) {
            if (f2137a == null) {
                f2137a = new c();
            }
        }
        return f2137a;
    }

    public void a(Runnable runnable) {
        this.f2140d.a(runnable);
    }

    public boolean a() {
        return this.f2140d.a();
    }

    public void b(Runnable runnable) {
        this.f2140d.b(runnable);
    }
}
