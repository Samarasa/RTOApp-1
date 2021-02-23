package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import b.l.a.a;
import com.google.android.gms.measurement.internal.Wb;
import com.google.android.gms.measurement.internal.Xb;

public final class AppMeasurementReceiver extends a implements Xb {

    /* renamed from: c  reason: collision with root package name */
    private Wb f13152c;

    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }

    public final void a(Context context, Intent intent) {
        a.b(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f13152c == null) {
            this.f13152c = new Wb(this);
        }
        this.f13152c.a(context, intent);
    }
}
