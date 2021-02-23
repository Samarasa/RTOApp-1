package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.t;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f6029a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f6030b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6031c = false;

    public static d a() {
        return f6029a;
    }

    private static void a(Context context, WakeLockEvent wakeLockEvent) {
        try {
            context.startService(new Intent().setComponent(b.f6021a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
        } catch (Exception e2) {
            Log.wtf("WakeLockTracker", e2);
        }
    }

    private static boolean b() {
        if (f6030b == null) {
            f6030b = false;
        }
        return f6030b.booleanValue();
    }

    public void a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        a(context, str, i, str2, str3, str4, i2, list, 0);
    }

    public void a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        if (b()) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                Log.e("WakeLockTracker", valueOf.length() != 0 ? "missing wakeLock key. ".concat(valueOf) : new String("missing wakeLock key. "));
            } else if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                WakeLockEvent wakeLockEvent = r0;
                WakeLockEvent wakeLockEvent2 = new WakeLockEvent(System.currentTimeMillis(), i, str2, i2, c.a(list), str, SystemClock.elapsedRealtime(), t.a(context), str3, c.a(context.getPackageName()), t.b(context), j, str4, false);
                a(context, wakeLockEvent);
            }
        }
    }
}
