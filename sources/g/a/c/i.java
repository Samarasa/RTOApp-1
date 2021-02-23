package g.a.c;

import g.C;
import g.M;
import g.z;
import h.g;

public final class i extends M {

    /* renamed from: a  reason: collision with root package name */
    private final z f14998a;

    /* renamed from: b  reason: collision with root package name */
    private final g f14999b;

    public i(z zVar, g gVar) {
        this.f14998a = zVar;
        this.f14999b = gVar;
    }

    public long a() {
        return f.a(this.f14998a);
    }

    public C r() {
        String a2 = this.f14998a.a("Content-Type");
        if (a2 != null) {
            return C.a(a2);
        }
        return null;
    }

    public g s() {
        return this.f14999b;
    }
}
