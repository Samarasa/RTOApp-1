package com.google.firebase.auth;

import c.b.d.f.c;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.C3285a;

final class O implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ c f14276a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f14277b;

    O(FirebaseAuth firebaseAuth, c cVar) {
        this.f14277b = firebaseAuth;
        this.f14276a = cVar;
    }

    public final void run() {
        for (C3285a a2 : this.f14277b.f14254c) {
            a2.a(this.f14276a);
        }
        for (FirebaseAuth.b a3 : this.f14277b.f14253b) {
            a3.a(this.f14277b);
        }
    }
}
