package androidx.work.impl.b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.impl.utils.b.a;

public class h extends d<Boolean> {
    private static final String i = androidx.work.h.a("StorageNotLowTracker");

    public h(Context context, a aVar) {
        super(context, aVar);
    }

    public Boolean a() {
        Intent registerReceiver = this.f1770c.registerReceiver((BroadcastReceiver) null, d());
        if (!(registerReceiver == null || registerReceiver.getAction() == null)) {
            String action = registerReceiver.getAction();
            char c2 = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c2 = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c2 = 1;
            }
            if (c2 != 0) {
                return c2 != 1 ? null : false;
            }
        }
        return true;
    }

    public void a(Context context, Intent intent) {
        boolean z;
        if (intent.getAction() != null) {
            androidx.work.h.a().a(i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c2 = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c2 = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c2 = 1;
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
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }
}
