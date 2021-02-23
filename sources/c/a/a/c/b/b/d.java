package c.a.a.c.b.b;

import c.a.a.c.b.b.a;
import java.io.File;

public class d implements a.C0046a {

    /* renamed from: a  reason: collision with root package name */
    private final long f3079a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3080b;

    public interface a {
        File a();
    }

    public d(a aVar, long j) {
        this.f3079a = j;
        this.f3080b = aVar;
    }

    public a build() {
        File a2 = this.f3080b.a();
        if (a2 == null) {
            return null;
        }
        if (a2.mkdirs() || (a2.exists() && a2.isDirectory())) {
            return e.a(a2, this.f3079a);
        }
        return null;
    }
}
