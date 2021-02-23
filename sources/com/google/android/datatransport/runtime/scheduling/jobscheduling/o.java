package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import c.b.b.a.a.c.a.C0248d;
import com.google.android.datatransport.runtime.backends.f;
import d.a.b;
import f.a.a;
import java.util.concurrent.Executor;

public final class o implements b<n> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f5328a;

    /* renamed from: b  reason: collision with root package name */
    private final a<f> f5329b;

    /* renamed from: c  reason: collision with root package name */
    private final a<C0248d> f5330c;

    /* renamed from: d  reason: collision with root package name */
    private final a<t> f5331d;

    /* renamed from: e  reason: collision with root package name */
    private final a<Executor> f5332e;

    /* renamed from: f  reason: collision with root package name */
    private final a<c.b.b.a.a.d.b> f5333f;

    /* renamed from: g  reason: collision with root package name */
    private final a<c.b.b.a.a.e.a> f5334g;

    public o(a<Context> aVar, a<f> aVar2, a<C0248d> aVar3, a<t> aVar4, a<Executor> aVar5, a<c.b.b.a.a.d.b> aVar6, a<c.b.b.a.a.e.a> aVar7) {
        this.f5328a = aVar;
        this.f5329b = aVar2;
        this.f5330c = aVar3;
        this.f5331d = aVar4;
        this.f5332e = aVar5;
        this.f5333f = aVar6;
        this.f5334g = aVar7;
    }

    public static o a(a<Context> aVar, a<f> aVar2, a<C0248d> aVar3, a<t> aVar4, a<Executor> aVar5, a<c.b.b.a.a.d.b> aVar6, a<c.b.b.a.a.e.a> aVar7) {
        return new o(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public n get() {
        return new n(this.f5328a.get(), this.f5329b.get(), this.f5330c.get(), this.f5331d.get(), this.f5332e.get(), this.f5333f.get(), this.f5334g.get());
    }
}
