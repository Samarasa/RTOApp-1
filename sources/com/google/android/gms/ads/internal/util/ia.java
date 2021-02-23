package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.DW;

public final class ia extends DW {
    public ia(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            p.c();
            oa.a(p.g().a(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e2) {
            p.g().a((Throwable) e2, "AdMobHandler.handleMessage");
        }
    }
}
