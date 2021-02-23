package c.b.b.b.g;

import java.util.concurrent.Callable;

final class H implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ D f4708a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Callable f4709b;

    H(D d2, Callable callable) {
        this.f4708a = d2;
        this.f4709b = callable;
    }

    public final void run() {
        try {
            this.f4708a.a(this.f4709b.call());
        } catch (Exception e2) {
            this.f4708a.a(e2);
        }
    }
}
