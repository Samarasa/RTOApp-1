package com.google.firebase.remoteconfig.internal;

import c.b.b.b.g.C0475h;
import c.b.b.b.g.i;

final /* synthetic */ class b implements C0475h {

    /* renamed from: a  reason: collision with root package name */
    private final f f14725a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f14726b;

    /* renamed from: c  reason: collision with root package name */
    private final h f14727c;

    private b(f fVar, boolean z, h hVar) {
        this.f14725a = fVar;
        this.f14726b = z;
        this.f14727c = hVar;
    }

    public static C0475h a(f fVar, boolean z, h hVar) {
        return new b(fVar, z, hVar);
    }

    public i a(Object obj) {
        return f.a(this.f14725a, this.f14726b, this.f14727c, (Void) obj);
    }
}
