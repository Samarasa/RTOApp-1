package com.google.firebase.auth.internal;

import c.b.b.b.g.C0472e;
import c.b.d.h;

/* renamed from: com.google.firebase.auth.internal.e  reason: case insensitive filesystem */
final class C3289e implements C0472e {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ O f14378a;

    C3289e(O o) {
        this.f14378a = o;
    }

    public final void a(Exception exc) {
        if (exc instanceof h) {
            C3288d.f14370a.d("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f14378a.f14369b.b();
        }
    }
}
