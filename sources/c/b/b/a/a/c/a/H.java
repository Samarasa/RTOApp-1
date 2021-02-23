package c.b.b.a.a.c.a;

import android.content.Context;
import d.a.b;
import f.a.a;

public final class H implements b<G> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f3741a;

    /* renamed from: b  reason: collision with root package name */
    private final a<Integer> f3742b;

    public H(a<Context> aVar, a<Integer> aVar2) {
        this.f3741a = aVar;
        this.f3742b = aVar2;
    }

    public static H a(a<Context> aVar, a<Integer> aVar2) {
        return new H(aVar, aVar2);
    }

    public G get() {
        return new G(this.f3741a.get(), this.f3742b.get().intValue());
    }
}
