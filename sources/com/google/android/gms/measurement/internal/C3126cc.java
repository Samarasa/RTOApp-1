package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0563t;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.cc  reason: case insensitive filesystem */
final class C3126cc<V> extends FutureTask<V> implements Comparable<C3126cc> {

    /* renamed from: a  reason: collision with root package name */
    private final long f13528a = Zb.f13476c.getAndIncrement();

    /* renamed from: b  reason: collision with root package name */
    final boolean f13529b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13530c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Zb f13531d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3126cc(Zb zb, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f13531d = zb;
        C0563t.a(str);
        this.f13530c = str;
        this.f13529b = false;
        if (this.f13528a == Long.MAX_VALUE) {
            zb.h().t().a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3126cc(Zb zb, Callable<V> callable, boolean z, String str) {
        super(callable);
        this.f13531d = zb;
        C0563t.a(str);
        this.f13530c = str;
        this.f13529b = z;
        if (this.f13528a == Long.MAX_VALUE) {
            zb.h().t().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C3126cc ccVar = (C3126cc) obj;
        boolean z = this.f13529b;
        if (z != ccVar.f13529b) {
            return z ? -1 : 1;
        }
        long j = this.f13528a;
        long j2 = ccVar.f13528a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f13531d.h().u().a("Two tasks share the same index. index", Long.valueOf(this.f13528a));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f13531d.h().t().a(this.f13530c, th);
        super.setException(th);
    }
}
