package androidx.work.impl.b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.h;
import androidx.work.impl.utils.b.a;

public class b extends d<Boolean> {
    private static final String i = h.a("BatteryNotLowTracker");

    public b(Context context, a aVar) {
        super(context, aVar);
    }

    public Boolean a() {
        Intent registerReceiver = this.f1770c.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            h.a().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("status", -1);
        float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z = true;
        if (intExtra == 0 && intExtra2 != 1 && intExtra3 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void a(Context context, Intent intent) {
        boolean z;
        if (intent.getAction() != null) {
            h.a().a(i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c2 = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    c2 = 1;
                }
            } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c2 = 0;
            }
            if (c2 == 0) {
                z = true;
            } else if (c2 == 1) {
                z = false;
            } else {
                return;
            }
            a(z);
        }
    }

    public IntentFilter d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }
}
