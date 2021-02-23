package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.b.b.a.a.d.b;
import c.b.b.a.a.p;

final /* synthetic */ class j implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final n f5310a;

    /* renamed from: b  reason: collision with root package name */
    private final p f5311b;

    private j(n nVar, p pVar) {
        this.f5310a = nVar;
        this.f5311b = pVar;
    }

    public static b.a a(n nVar, p pVar) {
        return new j(nVar, pVar);
    }

    public Object execute() {
        return this.f5310a.f5323c.a(this.f5311b);
    }
}
