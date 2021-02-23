package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.h;
import androidx.work.impl.m;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f1789a = h.a("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        h.a().a(f1789a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                m.a(context).a(goAsync());
            } catch (IllegalStateException unused) {
                h.a().b(f1789a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
            }
        } else {
            context.startService(b.b(context));
        }
    }
}
