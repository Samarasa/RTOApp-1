package com.google.firebase.iid;

import android.os.Bundle;
import c.b.b.b.g.j;

final /* synthetic */ class T implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Q f14543a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f14544b;

    /* renamed from: c  reason: collision with root package name */
    private final j f14545c;

    T(Q q, Bundle bundle, j jVar) {
        this.f14543a = q;
        this.f14544b = bundle;
        this.f14545c = jVar;
    }

    public final void run() {
        this.f14543a.a(this.f14544b, this.f14545c);
    }
}
