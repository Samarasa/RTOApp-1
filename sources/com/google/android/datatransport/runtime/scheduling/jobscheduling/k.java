package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.b.b.a.a.d.b;
import c.b.b.a.a.p;
import com.google.android.datatransport.runtime.backends.h;

final /* synthetic */ class k implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final n f5312a;

    /* renamed from: b  reason: collision with root package name */
    private final h f5313b;

    /* renamed from: c  reason: collision with root package name */
    private final Iterable f5314c;

    /* renamed from: d  reason: collision with root package name */
    private final p f5315d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5316e;

    private k(n nVar, h hVar, Iterable iterable, p pVar, int i) {
        this.f5312a = nVar;
        this.f5313b = hVar;
        this.f5314c = iterable;
        this.f5315d = pVar;
        this.f5316e = i;
    }

    public static b.a a(n nVar, h hVar, Iterable iterable, p pVar, int i) {
        return new k(nVar, hVar, iterable, pVar, i);
    }

    public Object execute() {
        return n.a(this.f5312a, this.f5313b, this.f5314c, this.f5315d, this.f5316e);
    }
}
