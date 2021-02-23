package com.google.firebase.iid;

import c.b.d.c.a;
import c.b.d.c.b;
import com.google.firebase.iid.FirebaseInstanceId;

final /* synthetic */ class P implements b {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId.a f14535a;

    P(FirebaseInstanceId.a aVar) {
        this.f14535a = aVar;
    }

    public final void a(a aVar) {
        FirebaseInstanceId.a aVar2 = this.f14535a;
        synchronized (aVar2) {
            if (aVar2.a()) {
                FirebaseInstanceId.this.l();
            }
        }
    }
}
