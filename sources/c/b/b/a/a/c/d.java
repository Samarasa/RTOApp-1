package c.b.b.a.a.c;

import c.b.b.a.a.c.a.C0248d;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import d.a.b;
import f.a.a;
import java.util.concurrent.Executor;

public final class d implements b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Executor> f3789a;

    /* renamed from: b  reason: collision with root package name */
    private final a<f> f3790b;

    /* renamed from: c  reason: collision with root package name */
    private final a<t> f3791c;

    /* renamed from: d  reason: collision with root package name */
    private final a<C0248d> f3792d;

    /* renamed from: e  reason: collision with root package name */
    private final a<c.b.b.a.a.d.b> f3793e;

    public d(a<Executor> aVar, a<f> aVar2, a<t> aVar3, a<C0248d> aVar4, a<c.b.b.a.a.d.b> aVar5) {
        this.f3789a = aVar;
        this.f3790b = aVar2;
        this.f3791c = aVar3;
        this.f3792d = aVar4;
        this.f3793e = aVar5;
    }

    public static d a(a<Executor> aVar, a<f> aVar2, a<t> aVar3, a<C0248d> aVar4, a<c.b.b.a.a.d.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public c get() {
        return new c(this.f3789a.get(), this.f3790b.get(), this.f3791c.get(), this.f3792d.get(), this.f3793e.get());
    }
}
