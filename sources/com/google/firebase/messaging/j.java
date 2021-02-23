package com.google.firebase.messaging;

import android.content.Intent;
import c.b.b.b.g.C0471d;
import c.b.b.b.g.i;

final /* synthetic */ class j implements C0471d {

    /* renamed from: a  reason: collision with root package name */
    private final f f14659a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f14660b;

    j(f fVar, Intent intent) {
        this.f14659a = fVar;
        this.f14660b = intent;
    }

    public final void onComplete(i iVar) {
        this.f14659a.a(this.f14660b, iVar);
    }
}
