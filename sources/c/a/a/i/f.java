package c.a.a.i;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class f<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<T, Y> f3650a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    private final long f3651b;

    /* renamed from: c  reason: collision with root package name */
    private long f3652c;

    /* renamed from: d  reason: collision with root package name */
    private long f3653d;

    public f(long j) {
        this.f3651b = j;
        this.f3652c = j;
    }

    private void c() {
        a(this.f3652c);
    }

    public synchronized Y a(T t) {
        return this.f3650a.get(t);
    }

    public void a() {
        a(0);
    }

    /* access modifiers changed from: protected */
    public synchronized void a(long j) {
        while (this.f3653d > j) {
            Iterator<Map.Entry<T, Y>> it = this.f3650a.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.f3653d -= (long) b(value);
            Object key = next.getKey();
            it.remove();
            a(key, value);
        }
    }

    /* access modifiers changed from: protected */
    public void a(T t, Y y) {
    }

    /* access modifiers changed from: protected */
    public int b(Y y) {
        return 1;
    }

    public synchronized long b() {
        return this.f3652c;
    }

    public synchronized Y b(T t, Y y) {
        long b2 = (long) b(y);
        if (b2 >= this.f3652c) {
            a(t, y);
            return null;
        }
        if (y != null) {
            this.f3653d += b2;
        }
        Y put = this.f3650a.put(t, y);
        if (put != null) {
            this.f3653d -= (long) b(put);
            if (!put.equals(y)) {
                a(t, put);
            }
        }
        c();
        return put;
    }

    public synchronized Y c(T t) {
        Y remove;
        remove = this.f3650a.remove(t);
        if (remove != null) {
            this.f3653d -= (long) b(remove);
        }
        return remove;
    }
}
