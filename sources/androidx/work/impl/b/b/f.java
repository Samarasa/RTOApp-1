package androidx.work.impl.b.b;

import android.content.Context;
import androidx.work.h;
import androidx.work.impl.utils.b.a;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class f<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1768a = h.a("ConstraintTracker");

    /* renamed from: b  reason: collision with root package name */
    protected final a f1769b;

    /* renamed from: c  reason: collision with root package name */
    protected final Context f1770c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f1771d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Set<androidx.work.impl.b.a<T>> f1772e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    T f1773f;

    f(Context context, a aVar) {
        this.f1770c = context.getApplicationContext();
        this.f1769b = aVar;
    }

    public abstract T a();

    public void a(androidx.work.impl.b.a<T> aVar) {
        synchronized (this.f1771d) {
            if (this.f1772e.add(aVar)) {
                if (this.f1772e.size() == 1) {
                    this.f1773f = a();
                    h.a().a(f1768a, String.format("%s: initial state = %s", new Object[]{getClass().getSimpleName(), this.f1773f}), new Throwable[0]);
                    b();
                }
                aVar.a(this.f1773f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1771d
            monitor-enter(r0)
            T r1 = r3.f1773f     // Catch:{ all -> 0x002f }
            if (r1 == r4) goto L_0x002d
            T r1 = r3.f1773f     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            T r1 = r3.f1773f     // Catch:{ all -> 0x002f }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            r3.f1773f = r4     // Catch:{ all -> 0x002f }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            java.util.Set<androidx.work.impl.b.a<T>> r1 = r3.f1772e     // Catch:{ all -> 0x002f }
            r4.<init>(r1)     // Catch:{ all -> 0x002f }
            androidx.work.impl.utils.b.a r1 = r3.f1769b     // Catch:{ all -> 0x002f }
            java.util.concurrent.Executor r1 = r1.a()     // Catch:{ all -> 0x002f }
            androidx.work.impl.b.b.e r2 = new androidx.work.impl.b.b.e     // Catch:{ all -> 0x002f }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x002f }
            r1.execute(r2)     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.b.b.f.a(java.lang.Object):void");
    }

    public abstract void b();

    public void b(androidx.work.impl.b.a<T> aVar) {
        synchronized (this.f1771d) {
            if (this.f1772e.remove(aVar) && this.f1772e.isEmpty()) {
                c();
            }
        }
    }

    public abstract void c();
}
