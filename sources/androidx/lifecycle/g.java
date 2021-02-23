package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    AtomicReference<Object> f1222a = new AtomicReference<>();

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean a(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public abstract b a();

    public abstract void a(j jVar);

    public abstract void b(j jVar);
}
