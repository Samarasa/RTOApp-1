package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import c.b.b.b.b.d;
import c.b.b.b.g.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.C0525e;

public final class N<ResultT> extends C0539t {

    /* renamed from: b  reason: collision with root package name */
    private final C0534n<a.b, ResultT> f5817b;

    /* renamed from: c  reason: collision with root package name */
    private final j<ResultT> f5818c;

    /* renamed from: d  reason: collision with root package name */
    private final C0533m f5819d;

    public N(int i, C0534n<a.b, ResultT> nVar, j<ResultT> jVar, C0533m mVar) {
        super(i);
        this.f5818c = jVar;
        this.f5817b = nVar;
        this.f5819d = mVar;
    }

    public final void a(Status status) {
        this.f5818c.b(this.f5819d.a(status));
    }

    public final void a(U u, boolean z) {
        u.a(this.f5818c, z);
    }

    public final void a(C0525e.a<?> aVar) {
        try {
            this.f5817b.a(aVar.f(), this.f5818c);
        } catch (DeadObjectException e2) {
            throw e2;
        } catch (RemoteException e3) {
            a(D.b(e3));
        } catch (RuntimeException e4) {
            a(e4);
        }
    }

    public final void a(RuntimeException runtimeException) {
        this.f5818c.b((Exception) runtimeException);
    }

    public final d[] b(C0525e.a<?> aVar) {
        return this.f5817b.c();
    }

    public final boolean c(C0525e.a<?> aVar) {
        return this.f5817b.b();
    }
}
