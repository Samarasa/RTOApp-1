package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import c.b.b.b.g.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.C0525e;

abstract class M<T> extends C0539t {

    /* renamed from: b  reason: collision with root package name */
    protected final j<T> f5816b;

    public M(int i, j<T> jVar) {
        super(i);
        this.f5816b = jVar;
    }

    public void a(Status status) {
        this.f5816b.b((Exception) new b(status));
    }

    public final void a(C0525e.a<?> aVar) {
        try {
            d(aVar);
        } catch (DeadObjectException e2) {
            a(D.b(e2));
            throw e2;
        } catch (RemoteException e3) {
            a(D.b(e3));
        } catch (RuntimeException e4) {
            a(e4);
        }
    }

    public void a(RuntimeException runtimeException) {
        this.f5816b.b((Exception) runtimeException);
    }

    /* access modifiers changed from: protected */
    public abstract void d(C0525e.a<?> aVar);
}
