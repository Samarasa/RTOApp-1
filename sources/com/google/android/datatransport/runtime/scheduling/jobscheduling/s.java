package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.b.b.a.a.c.a.C0248d;
import d.a.b;
import f.a.a;
import java.util.concurrent.Executor;

public final class s implements b<r> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Executor> f5341a;

    /* renamed from: b  reason: collision with root package name */
    private final a<C0248d> f5342b;

    /* renamed from: c  reason: collision with root package name */
    private final a<t> f5343c;

    /* renamed from: d  reason: collision with root package name */
    private final a<c.b.b.a.a.d.b> f5344d;

    public s(a<Executor> aVar, a<C0248d> aVar2, a<t> aVar3, a<c.b.b.a.a.d.b> aVar4) {
        this.f5341a = aVar;
        this.f5342b = aVar2;
        this.f5343c = aVar3;
        this.f5344d = aVar4;
    }

    public static s a(a<Executor> aVar, a<C0248d> aVar2, a<t> aVar3, a<c.b.b.a.a.d.b> aVar4) {
        return new s(aVar, aVar2, aVar3, aVar4);
    }

    public r get() {
        return new r(this.f5341a.get(), this.f5342b.get(), this.f5343c.get(), this.f5344d.get());
    }
}
