package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;

final /* synthetic */ class NE implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final FE f7937a;

    /* renamed from: b  reason: collision with root package name */
    private final C1742gl f7938b;

    NE(FE fe, C1742gl glVar) {
        this.f7937a = fe;
        this.f7938b = glVar;
    }

    public final void run() {
        C1742gl glVar = this.f7938b;
        String c2 = p.g().i().m().c();
        if (!TextUtils.isEmpty(c2)) {
            glVar.a(c2);
        } else {
            glVar.a((Throwable) new Exception());
        }
    }
}
