package c.a.a.c.b.b;

import c.a.a.i.i;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f3074a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final b f3075b = new b();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final Lock f3076a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        int f3077b;

        a() {
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<a> f3078a = new ArrayDeque();

        b() {
        }

        /* access modifiers changed from: package-private */
        public a a() {
            a poll;
            synchronized (this.f3078a) {
                poll = this.f3078a.poll();
            }
            return poll == null ? new a() : poll;
        }

        /* access modifiers changed from: package-private */
        public void a(a aVar) {
            synchronized (this.f3078a) {
                if (this.f3078a.size() < 10) {
                    this.f3078a.offer(aVar);
                }
            }
        }
    }

    c() {
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.f3074a.get(str);
            if (aVar == null) {
                aVar = this.f3075b.a();
                this.f3074a.put(str, aVar);
            }
            aVar.f3077b++;
        }
        aVar.f3076a.lock();
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        a aVar;
        synchronized (this) {
            a aVar2 = this.f3074a.get(str);
            i.a(aVar2);
            aVar = aVar2;
            if (aVar.f3077b >= 1) {
                aVar.f3077b--;
                if (aVar.f3077b == 0) {
                    a remove = this.f3074a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f3075b.a(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f3077b);
            }
        }
        aVar.f3076a.unlock();
    }
}
