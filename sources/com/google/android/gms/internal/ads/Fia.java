package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class Fia extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Gia f6888a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Fia(Gia gia, Looper looper) {
        super(looper);
        this.f6888a = gia;
    }

    public final void handleMessage(Message message) {
        this.f6888a.a(message);
    }
}
