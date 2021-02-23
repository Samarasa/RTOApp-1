package com.google.android.gms.common.api.internal;

import c.b.b.b.b.d;
import c.b.b.b.g.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0525e;

public final class O extends M<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    private final C0529i<?> f5820c;

    public O(C0529i<?> iVar, j<Boolean> jVar) {
        super(4, jVar);
        this.f5820c = iVar;
    }

    public final /* bridge */ /* synthetic */ void a(Status status) {
        super.a(status);
    }

    public final /* bridge */ /* synthetic */ void a(U u, boolean z) {
    }

    public final /* bridge */ /* synthetic */ void a(RuntimeException runtimeException) {
        super.a(runtimeException);
    }

    public final d[] b(C0525e.a<?> aVar) {
        C c2 = aVar.i().get(this.f5820c);
        if (c2 == null) {
            return null;
        }
        return c2.f5798a.b();
    }

    public final boolean c(C0525e.a<?> aVar) {
        C c2 = aVar.i().get(this.f5820c);
        return c2 != null && c2.f5798a.c();
    }

    public final void d(C0525e.a<?> aVar) {
        C remove = aVar.i().remove(this.f5820c);
        if (remove != null) {
            remove.f5799b.a(aVar.f(), this.f5816b);
            remove.f5798a.a();
            return;
        }
        this.f5816b.b(false);
    }
}
