package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;
import com.google.android.material.snackbar.u;

class t implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u f14178a;

    t(u uVar) {
        this.f14178a = uVar;
    }

    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        this.f14178a.a((u.b) message.obj);
        return true;
    }
}
