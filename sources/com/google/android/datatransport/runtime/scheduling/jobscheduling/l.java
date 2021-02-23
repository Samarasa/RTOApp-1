package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import c.b.b.a.a.c.a.C0248d;
import c.b.b.a.a.d.b;

final /* synthetic */ class l implements b.a {

    /* renamed from: a  reason: collision with root package name */
    private final C0248d f5317a;

    private l(C0248d dVar) {
        this.f5317a = dVar;
    }

    public static b.a a(C0248d dVar) {
        return new l(dVar);
    }

    public Object execute() {
        return Integer.valueOf(this.f5317a.l());
    }
}
