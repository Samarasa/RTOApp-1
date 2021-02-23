package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.h;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.f;

class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f1798a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f1799b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BroadcastReceiver.PendingResult f1800c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ConstraintProxyUpdateReceiver f1801d;

    c(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.f1801d = constraintProxyUpdateReceiver;
        this.f1798a = intent;
        this.f1799b = context;
        this.f1800c = pendingResult;
    }

    public void run() {
        try {
            boolean booleanExtra = this.f1798a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = this.f1798a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = this.f1798a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = this.f1798a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            h.a().a(ConstraintProxyUpdateReceiver.f1788a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
            f.a(this.f1799b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
            f.a(this.f1799b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
            f.a(this.f1799b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
            f.a(this.f1799b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
        } finally {
            this.f1800c.finish();
        }
    }
}
