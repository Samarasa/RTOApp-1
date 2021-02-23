package c.b.b.a.a.c;

import android.content.Context;
import c.b.b.a.a.c.a.C0248d;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;
import d.a.b;
import d.a.d;
import f.a.a;

public final class i implements b<t> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f3795a;

    /* renamed from: b  reason: collision with root package name */
    private final a<C0248d> f3796b;

    /* renamed from: c  reason: collision with root package name */
    private final a<h> f3797c;

    /* renamed from: d  reason: collision with root package name */
    private final a<c.b.b.a.a.e.a> f3798d;

    public i(a<Context> aVar, a<C0248d> aVar2, a<h> aVar3, a<c.b.b.a.a.e.a> aVar4) {
        this.f3795a = aVar;
        this.f3796b = aVar2;
        this.f3797c = aVar3;
        this.f3798d = aVar4;
    }

    public static i a(a<Context> aVar, a<C0248d> aVar2, a<h> aVar3, a<c.b.b.a.a.e.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static t a(Context context, C0248d dVar, h hVar, c.b.b.a.a.e.a aVar) {
        t a2 = h.a(context, dVar, hVar, aVar);
        d.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public t get() {
        return a(this.f3795a.get(), this.f3796b.get(), this.f3797c.get(), this.f3798d.get());
    }
}
