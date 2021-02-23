package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

final class Q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f14279a;

    Q(FirebaseAuth firebaseAuth) {
        this.f14279a = firebaseAuth;
    }

    public final void run() {
        for (FirebaseAuth.a a2 : this.f14279a.f14255d) {
            a2.a(this.f14279a);
        }
    }
}
