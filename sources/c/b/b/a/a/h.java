package c.b.b.a.a;

import android.content.Context;
import c.b.b.a.a.c.a.B;
import c.b.b.a.a.c.a.C;
import c.b.b.a.a.c.a.C0248d;
import c.b.b.a.a.c.a.C0251g;
import c.b.b.a.a.c.a.C0252h;
import c.b.b.a.a.c.a.H;
import c.b.b.a.a.c.c;
import c.b.b.a.a.c.g;
import c.b.b.a.a.c.i;
import c.b.b.a.a.v;
import com.google.android.datatransport.runtime.backends.k;
import com.google.android.datatransport.runtime.backends.m;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import d.a.d;
import java.util.concurrent.Executor;

final class h extends v {

    /* renamed from: a  reason: collision with root package name */
    private f.a.a<Executor> f3819a;

    /* renamed from: b  reason: collision with root package name */
    private f.a.a<Context> f3820b;

    /* renamed from: c  reason: collision with root package name */
    private f.a.a f3821c;

    /* renamed from: d  reason: collision with root package name */
    private f.a.a f3822d;

    /* renamed from: e  reason: collision with root package name */
    private f.a.a f3823e;

    /* renamed from: f  reason: collision with root package name */
    private f.a.a<B> f3824f;

    /* renamed from: g  reason: collision with root package name */
    private f.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.h> f3825g;

    /* renamed from: h  reason: collision with root package name */
    private f.a.a<t> f3826h;
    private f.a.a<c> i;
    private f.a.a<n> j;
    private f.a.a<r> k;
    private f.a.a<u> l;

    private static final class a implements v.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f3827a;

        private a() {
        }

        public a a(Context context) {
            d.a(context);
            this.f3827a = context;
            return this;
        }

        public v build() {
            d.a(this.f3827a, Context.class);
            return new h(this.f3827a);
        }
    }

    private h(Context context) {
        a(context);
    }

    private void a(Context context) {
        this.f3819a = d.a.a.a(n.a());
        this.f3820b = d.a.c.a(context);
        this.f3821c = k.a(this.f3820b, c.b.b.a.a.e.c.a(), c.b.b.a.a.e.d.a());
        this.f3822d = d.a.a.a(m.a(this.f3820b, this.f3821c));
        this.f3823e = H.a(this.f3820b, C0251g.a());
        this.f3824f = d.a.a.a(C.a(c.b.b.a.a.e.c.a(), c.b.b.a.a.e.d.a(), C0252h.a(), this.f3823e));
        this.f3825g = g.a((f.a.a<c.b.b.a.a.e.a>) c.b.b.a.a.e.c.a());
        this.f3826h = i.a(this.f3820b, (f.a.a<C0248d>) this.f3824f, this.f3825g, (f.a.a<c.b.b.a.a.e.a>) c.b.b.a.a.e.d.a());
        f.a.a<Executor> aVar = this.f3819a;
        f.a.a aVar2 = this.f3822d;
        f.a.a<t> aVar3 = this.f3826h;
        f.a.a<B> aVar4 = this.f3824f;
        this.i = c.b.b.a.a.c.d.a(aVar, aVar2, aVar3, aVar4, aVar4);
        f.a.a<Context> aVar5 = this.f3820b;
        f.a.a aVar6 = this.f3822d;
        f.a.a<B> aVar7 = this.f3824f;
        this.j = o.a(aVar5, aVar6, aVar7, this.f3826h, this.f3819a, aVar7, c.b.b.a.a.e.c.a());
        f.a.a<Executor> aVar8 = this.f3819a;
        f.a.a<B> aVar9 = this.f3824f;
        this.k = s.a(aVar8, aVar9, this.f3826h, aVar9);
        this.l = d.a.a.a(w.a(c.b.b.a.a.e.c.a(), c.b.b.a.a.e.d.a(), this.i, this.j, this.k));
    }

    public static v.a s() {
        return new a();
    }

    /* access modifiers changed from: package-private */
    public C0248d a() {
        return this.f3824f.get();
    }

    /* access modifiers changed from: package-private */
    public u r() {
        return this.l.get();
    }
}
