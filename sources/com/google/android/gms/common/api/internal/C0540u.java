package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C0523c;

/* renamed from: com.google.android.gms.common.api.internal.u  reason: case insensitive filesystem */
final class C0540u implements C0523c.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0525e f5890a;

    C0540u(C0525e eVar) {
        this.f5890a = eVar;
    }

    public final void a(boolean z) {
        this.f5890a.q.sendMessage(this.f5890a.q.obtainMessage(1, Boolean.valueOf(z)));
    }
}
