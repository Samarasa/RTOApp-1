package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.C0523c;

final class s implements C0523c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p f14401a;

    s(p pVar) {
        this.f14401a = pVar;
    }

    public final void a(boolean z) {
        if (z) {
            boolean unused = this.f14401a.f14394c = true;
            this.f14401a.a();
            return;
        }
        boolean unused2 = this.f14401a.f14394c = false;
        if (this.f14401a.b()) {
            this.f14401a.f14393b.a();
        }
    }
}
