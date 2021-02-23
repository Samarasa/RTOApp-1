package c.b.b.a.a.c;

import c.b.b.a.a.l;
import c.b.b.a.a.p;
import c.b.b.a.h;

final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f3716a;

    /* renamed from: b  reason: collision with root package name */
    private final p f3717b;

    /* renamed from: c  reason: collision with root package name */
    private final h f3718c;

    /* renamed from: d  reason: collision with root package name */
    private final l f3719d;

    private a(c cVar, p pVar, h hVar, l lVar) {
        this.f3716a = cVar;
        this.f3717b = pVar;
        this.f3718c = hVar;
        this.f3719d = lVar;
    }

    public static Runnable a(c cVar, p pVar, h hVar, l lVar) {
        return new a(cVar, pVar, hVar, lVar);
    }

    public void run() {
        c.a(this.f3716a, this.f3717b, this.f3718c, this.f3719d);
    }
}
