package com.google.firebase.auth;

import c.b.b.b.d.d.ra;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.internal.C3287c;
import com.google.firebase.auth.internal.C3291g;

final class P implements C3287c, C3291g {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f14278a;

    P(FirebaseAuth firebaseAuth) {
        this.f14278a = firebaseAuth;
    }

    public final void a(ra raVar, C3306p pVar) {
        this.f14278a.a(pVar, raVar, true, true);
    }

    public final void a(Status status) {
        int g2 = status.g();
        if (g2 == 17011 || g2 == 17021 || g2 == 17005) {
            this.f14278a.c();
        }
    }
}
