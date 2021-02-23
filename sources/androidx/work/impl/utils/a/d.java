package androidx.work.impl.utils.a;

import java.util.concurrent.Executor;

enum d implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
