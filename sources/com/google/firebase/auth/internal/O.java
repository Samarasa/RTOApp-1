package com.google.firebase.auth.internal;

import c.b.b.b.g.C0472e;
import c.b.b.b.g.i;
import c.b.d.e;
import com.google.android.gms.common.internal.C0563t;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.r;

final class O implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f14368a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C3288d f14369b;

    O(C3288d dVar, String str) {
        this.f14369b = dVar;
        C0563t.b(str);
        this.f14368a = str;
    }

    public final void run() {
        FirebaseAuth instance = FirebaseAuth.getInstance(e.a(this.f14368a));
        if (instance.a() != null) {
            i<r> a2 = instance.a(true);
            C3288d.f14370a.d("Token refreshing started", new Object[0]);
            a2.a((C0472e) new C3289e(this));
        }
    }
}
