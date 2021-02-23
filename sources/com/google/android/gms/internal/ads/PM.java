package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class PM implements JO<QM> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f8207a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8208b;

    public PM(PY py, Context context) {
        this.f8207a = py;
        this.f8208b = context;
    }

    public final LY<QM> a() {
        return this.f8207a.a(new SM(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ QM b() {
        double d2;
        Intent registerReceiver = this.f8208b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            double intExtra2 = (double) registerReceiver.getIntExtra("level", -1);
            double intExtra3 = (double) registerReceiver.getIntExtra("scale", -1);
            Double.isNaN(intExtra2);
            Double.isNaN(intExtra3);
            d2 = intExtra2 / intExtra3;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d2 = -1.0d;
        }
        return new QM(d2, z);
    }
}
