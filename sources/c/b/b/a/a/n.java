package c.b.b.a.a;

import d.a.b;
import d.a.d;
import java.util.concurrent.Executor;

public final class n implements b<Executor> {

    /* renamed from: a  reason: collision with root package name */
    private static final n f3830a = new n();

    public static n a() {
        return f3830a;
    }

    public static Executor b() {
        Executor a2 = m.a();
        d.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public Executor get() {
        return b();
    }
}
