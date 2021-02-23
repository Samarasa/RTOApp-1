package com.google.firebase.messaging;

import android.content.Intent;
import c.b.b.b.g.j;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f14655a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f14656b;

    /* renamed from: c  reason: collision with root package name */
    private final j f14657c;

    h(f fVar, Intent intent, j jVar) {
        this.f14655a = fVar;
        this.f14656b = intent;
        this.f14657c = jVar;
    }

    public final void run() {
        f fVar = this.f14655a;
        Intent intent = this.f14656b;
        j jVar = this.f14657c;
        try {
            fVar.c(intent);
        } finally {
            jVar.a(null);
        }
    }
}
