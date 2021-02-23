package androidx.work.impl.b.a;

import androidx.work.impl.b.b.f;
import androidx.work.impl.c.o;
import java.util.ArrayList;
import java.util.List;

public abstract class c<T> implements androidx.work.impl.b.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f1753a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private T f1754b;

    /* renamed from: c  reason: collision with root package name */
    private f<T> f1755c;

    /* renamed from: d  reason: collision with root package name */
    private a f1756d;

    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    c(f<T> fVar) {
        this.f1755c = fVar;
    }

    private void b() {
        if (!this.f1753a.isEmpty() && this.f1756d != null) {
            T t = this.f1754b;
            if (t == null || b(t)) {
                this.f1756d.b(this.f1753a);
            } else {
                this.f1756d.a(this.f1753a);
            }
        }
    }

    public void a() {
        if (!this.f1753a.isEmpty()) {
            this.f1753a.clear();
            this.f1755c.b(this);
        }
    }

    public void a(a aVar) {
        if (this.f1756d != aVar) {
            this.f1756d = aVar;
            b();
        }
    }

    public void a(T t) {
        this.f1754b = t;
        b();
    }

    public void a(List<o> list) {
        this.f1753a.clear();
        for (o next : list) {
            if (a(next)) {
                this.f1753a.add(next.f1890c);
            }
        }
        if (this.f1753a.isEmpty()) {
            this.f1755c.b(this);
        } else {
            this.f1755c.a(this);
        }
        b();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean a(o oVar);

    public boolean a(String str) {
        T t = this.f1754b;
        return t != null && b(t) && this.f1753a.contains(str);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean b(T t);
}
