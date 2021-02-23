package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.b.b.a.a.d.b;
import c.b.b.a.a.p;

final /* synthetic */ class m implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final n f5318a;

    /* renamed from: b  reason: collision with root package name */
    private final p f5319b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5320c;

    private m(n nVar, p pVar, int i) {
        this.f5318a = nVar;
        this.f5319b = pVar;
        this.f5320c = i;
    }

    public static b.a a(n nVar, p pVar, int i) {
        return new m(nVar, pVar, i);
    }

    public Object execute() {
        return this.f5318a.f5324d.a(this.f5319b, this.f5320c + 1);
    }
}
