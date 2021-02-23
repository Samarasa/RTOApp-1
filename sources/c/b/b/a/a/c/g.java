package c.b.b.a.a.c;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.h;
import d.a.b;
import d.a.d;
import f.a.a;

public final class g implements b<h> {

    /* renamed from: a  reason: collision with root package name */
    private final a<c.b.b.a.a.e.a> f3794a;

    public g(a<c.b.b.a.a.e.a> aVar) {
        this.f3794a = aVar;
    }

    public static g a(a<c.b.b.a.a.e.a> aVar) {
        return new g(aVar);
    }

    public static h a(c.b.b.a.a.e.a aVar) {
        h a2 = f.a(aVar);
        d.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public h get() {
        return a(this.f3794a.get());
    }
}
