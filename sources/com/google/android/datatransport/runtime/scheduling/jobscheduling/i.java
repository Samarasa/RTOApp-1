package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.b.b.a.a.p;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final n f5306a;

    /* renamed from: b  reason: collision with root package name */
    private final p f5307b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5308c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f5309d;

    private i(n nVar, p pVar, int i, Runnable runnable) {
        this.f5306a = nVar;
        this.f5307b = pVar;
        this.f5308c = i;
        this.f5309d = runnable;
    }

    public static Runnable a(n nVar, p pVar, int i, Runnable runnable) {
        return new i(nVar, pVar, i, runnable);
    }

    public void run() {
        n.a(this.f5306a, this.f5307b, this.f5308c, this.f5309d);
    }
}
