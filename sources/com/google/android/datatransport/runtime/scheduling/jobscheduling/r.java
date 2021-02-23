package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.b.b.a.a.c.a.C0248d;
import c.b.b.a.a.d.b;
import c.b.b.a.a.p;
import java.util.concurrent.Executor;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5337a;

    /* renamed from: b  reason: collision with root package name */
    private final C0248d f5338b;

    /* renamed from: c  reason: collision with root package name */
    private final t f5339c;

    /* renamed from: d  reason: collision with root package name */
    private final b f5340d;

    r(Executor executor, C0248d dVar, t tVar, b bVar) {
        this.f5337a = executor;
        this.f5338b = dVar;
        this.f5339c = tVar;
        this.f5340d = bVar;
    }

    static /* synthetic */ Object a(r rVar) {
        for (p a2 : rVar.f5338b.n()) {
            rVar.f5339c.a(a2, 1);
        }
        return null;
    }

    public void a() {
        this.f5337a.execute(p.a(this));
    }
}
