package c.a.a;

import android.content.Context;
import b.e.b;
import c.a.a.c.b.a.e;
import c.a.a.c.b.a.f;
import c.a.a.c.b.a.k;
import c.a.a.c.b.b.a;
import c.a.a.c.b.b.h;
import c.a.a.c.b.b.i;
import c.a.a.c.b.b.j;
import c.a.a.c.b.s;
import c.a.a.d.g;
import c.a.a.d.n;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, o<?, ?>> f3501a = new b();

    /* renamed from: b  reason: collision with root package name */
    private s f3502b;

    /* renamed from: c  reason: collision with root package name */
    private e f3503c;

    /* renamed from: d  reason: collision with root package name */
    private c.a.a.c.b.a.b f3504d;

    /* renamed from: e  reason: collision with root package name */
    private i f3505e;

    /* renamed from: f  reason: collision with root package name */
    private c.a.a.c.b.c.b f3506f;

    /* renamed from: g  reason: collision with root package name */
    private c.a.a.c.b.c.b f3507g;

    /* renamed from: h  reason: collision with root package name */
    private a.C0046a f3508h;
    private j i;
    private c.a.a.d.d j;
    private int k = 4;
    private c.a.a.g.e l = new c.a.a.g.e();
    private n.a m;
    private c.a.a.c.b.c.b n;
    private boolean o;

    /* access modifiers changed from: package-private */
    public c a(Context context) {
        if (this.f3506f == null) {
            this.f3506f = c.a.a.c.b.c.b.d();
        }
        if (this.f3507g == null) {
            this.f3507g = c.a.a.c.b.c.b.c();
        }
        if (this.n == null) {
            this.n = c.a.a.c.b.c.b.b();
        }
        if (this.i == null) {
            this.i = new j.a(context).a();
        }
        if (this.j == null) {
            this.j = new g();
        }
        if (this.f3503c == null) {
            int b2 = this.i.b();
            if (b2 > 0) {
                this.f3503c = new k((long) b2);
            } else {
                this.f3503c = new f();
            }
        }
        if (this.f3504d == null) {
            this.f3504d = new c.a.a.c.b.a.j(this.i.a());
        }
        if (this.f3505e == null) {
            this.f3505e = new h((long) this.i.c());
        }
        if (this.f3508h == null) {
            this.f3508h = new c.a.a.c.b.b.g(context);
        }
        if (this.f3502b == null) {
            this.f3502b = new s(this.f3505e, this.f3508h, this.f3507g, this.f3506f, c.a.a.c.b.c.b.e(), c.a.a.c.b.c.b.b(), this.o);
        }
        n nVar = new n(this.m);
        s sVar = this.f3502b;
        i iVar = this.f3505e;
        e eVar = this.f3503c;
        c.a.a.c.b.a.b bVar = this.f3504d;
        c.a.a.d.d dVar = this.j;
        int i2 = this.k;
        c.a.a.g.e eVar2 = this.l;
        eVar2.D();
        return new c(context, sVar, iVar, eVar, bVar, nVar, dVar, i2, eVar2, this.f3501a);
    }

    /* access modifiers changed from: package-private */
    public void a(n.a aVar) {
        this.m = aVar;
    }
}
