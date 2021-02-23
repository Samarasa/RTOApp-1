package c.b.b.a.a;

import c.b.b.a.a.o;
import c.b.b.a.b;
import c.b.b.a.c;
import c.b.b.a.e;
import c.b.b.a.f;
import c.b.b.a.h;

final class s<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p f3835a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3836b;

    /* renamed from: c  reason: collision with root package name */
    private final b f3837c;

    /* renamed from: d  reason: collision with root package name */
    private final e<T, byte[]> f3838d;

    /* renamed from: e  reason: collision with root package name */
    private final t f3839e;

    s(p pVar, String str, b bVar, e<T, byte[]> eVar, t tVar) {
        this.f3835a = pVar;
        this.f3836b = str;
        this.f3837c = bVar;
        this.f3838d = eVar;
        this.f3839e = tVar;
    }

    static /* synthetic */ void a(Exception exc) {
    }

    public void a(c<T> cVar) {
        a(cVar, r.a());
    }

    public void a(c<T> cVar, h hVar) {
        t tVar = this.f3839e;
        o.a a2 = o.a();
        a2.a(this.f3835a);
        a2.a((c<?>) cVar);
        a2.a(this.f3836b);
        a2.a((e<?, byte[]>) this.f3838d);
        a2.a(this.f3837c);
        tVar.a(a2.a(), hVar);
    }
}
