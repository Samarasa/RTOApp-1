package b.f.a.a;

import java.util.HashSet;
import java.util.Iterator;

public class r {

    /* renamed from: a  reason: collision with root package name */
    HashSet<r> f2320a = new HashSet<>(2);

    /* renamed from: b  reason: collision with root package name */
    int f2321b = 0;

    public void a() {
        this.f2321b = 1;
        Iterator<r> it = this.f2320a.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public void a(r rVar) {
        this.f2320a.add(rVar);
    }

    public void b() {
        this.f2321b = 0;
        Iterator<r> it = this.f2320a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public boolean c() {
        return this.f2321b == 1;
    }

    public void d() {
        this.f2321b = 0;
        this.f2320a.clear();
    }

    public void e() {
    }
}
