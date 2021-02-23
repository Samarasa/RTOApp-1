package c.b.b.b.g;

import java.util.concurrent.Executor;

final class C implements Executor {
    C() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
