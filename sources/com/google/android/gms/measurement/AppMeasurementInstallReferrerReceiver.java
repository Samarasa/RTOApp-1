package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.Wb;
import com.google.android.gms.measurement.internal.Xb;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements Xb {

    /* renamed from: a  reason: collision with root package name */
    private Wb f13150a;

    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }

    public final void a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f13150a == null) {
            this.f13150a = new Wb(this);
        }
        this.f13150a.a(context, intent);
    }
}
