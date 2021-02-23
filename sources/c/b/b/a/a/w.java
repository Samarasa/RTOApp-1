package c.b.b.a.a;

import c.b.b.a.a.c.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import d.a.b;
import f.a.a;

public final class w implements b<u> {

    /* renamed from: a  reason: collision with root package name */
    private final a<c.b.b.a.a.e.a> f3845a;

    /* renamed from: b  reason: collision with root package name */
    private final a<c.b.b.a.a.e.a> f3846b;

    /* renamed from: c  reason: collision with root package name */
    private final a<e> f3847c;

    /* renamed from: d  reason: collision with root package name */
    private final a<n> f3848d;

    /* renamed from: e  reason: collision with root package name */
    private final a<r> f3849e;

    public w(a<c.b.b.a.a.e.a> aVar, a<c.b.b.a.a.e.a> aVar2, a<e> aVar3, a<n> aVar4, a<r> aVar5) {
        this.f3845a = aVar;
        this.f3846b = aVar2;
        this.f3847c = aVar3;
        this.f3848d = aVar4;
        this.f3849e = aVar5;
    }

    public static w a(a<c.b.b.a.a.e.a> aVar, a<c.b.b.a.a.e.a> aVar2, a<e> aVar3, a<n> aVar4, a<r> aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public u get() {
        return new u(this.f3845a.get(), this.f3846b.get(), this.f3847c.get(), this.f3848d.get(), this.f3849e.get());
    }
}
