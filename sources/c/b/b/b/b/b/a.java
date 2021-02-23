package c.b.b.b.b.b;

import java.util.concurrent.ScheduledExecutorService;

@Deprecated
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static C0059a f3867a;

    /* renamed from: c.b.b.b.b.b.a$a  reason: collision with other inner class name */
    public interface C0059a {
        @Deprecated
        ScheduledExecutorService a();
    }

    @Deprecated
    public static synchronized C0059a a() {
        C0059a aVar;
        synchronized (a.class) {
            if (f3867a == null) {
                f3867a = new b();
            }
            aVar = f3867a;
        }
        return aVar;
    }
}
