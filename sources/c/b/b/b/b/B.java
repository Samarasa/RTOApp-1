package c.b.b.b.b;

import java.util.concurrent.Callable;

final class B extends z {

    /* renamed from: e  reason: collision with root package name */
    private final Callable<String> f3855e;

    private B(Callable<String> callable) {
        super(false, (String) null, (Throwable) null);
        this.f3855e = callable;
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        try {
            return this.f3855e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
