package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ta extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ oa f5651a;

    private ta(oa oaVar) {
        this.f5651a = oaVar;
    }

    /* synthetic */ ta(oa oaVar, qa qaVar) {
        this(oaVar);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            boolean unused = this.f5651a.f5631d = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            boolean unused2 = this.f5651a.f5631d = false;
        }
    }
}
