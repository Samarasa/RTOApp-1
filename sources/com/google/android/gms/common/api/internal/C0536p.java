package com.google.android.gms.common.api.internal;

import c.b.b.b.g.C0471d;
import c.b.b.b.g.i;
import c.b.b.b.g.j;

/* renamed from: com.google.android.gms.common.api.internal.p  reason: case insensitive filesystem */
final class C0536p implements C0471d<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ j f5885a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ U f5886b;

    C0536p(U u, j jVar) {
        this.f5886b = u;
        this.f5885a = jVar;
    }

    public final void onComplete(i<TResult> iVar) {
        this.f5886b.f5827b.remove(this.f5885a);
    }
}
