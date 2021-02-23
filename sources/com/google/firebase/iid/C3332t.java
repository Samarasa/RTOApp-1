package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import c.b.b.b.d.e.e;

/* renamed from: com.google.firebase.iid.t  reason: case insensitive filesystem */
final class C3332t extends e {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C3330q f14603a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3332t(C3330q qVar, Looper looper) {
        super(looper);
        this.f14603a = qVar;
    }

    public final void handleMessage(Message message) {
        this.f14603a.a(message);
    }
}
