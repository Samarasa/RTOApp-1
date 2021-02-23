package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class B {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f1188a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f1189b = false;

    private static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f1189b = true;
        Map<String, Object> map = this.f1188a;
        if (map != null) {
            synchronized (map) {
                for (Object a2 : this.f1188a.values()) {
                    a(a2);
                }
            }
        }
        b();
    }

    /* access modifiers changed from: protected */
    public void b() {
    }
}
