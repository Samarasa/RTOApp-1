package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class ne implements Callable<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xe f13694a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3176ke f13695b;

    ne(C3176ke keVar, xe xeVar) {
        this.f13695b = keVar;
        this.f13694a = xeVar;
    }

    public final /* synthetic */ Object call() {
        C3138ec c2 = this.f13695b.c(this.f13694a);
        if (c2 != null) {
            return c2.m();
        }
        this.f13695b.h().w().a("App info was null when attempting to get app instance id");
        return null;
    }
}
