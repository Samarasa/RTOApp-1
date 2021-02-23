package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class Fha extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Dha f6887a;

    Fha(Dha dha) {
        this.f6887a = dha;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f6887a.d();
    }
}
