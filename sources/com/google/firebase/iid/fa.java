package com.google.firebase.iid;

import android.os.Handler;
import android.os.Message;

final /* synthetic */ class fa implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final ca f14571a;

    fa(ca caVar) {
        this.f14571a = caVar;
    }

    public final boolean handleMessage(Message message) {
        return this.f14571a.a(message);
    }
}
