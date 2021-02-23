package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.h;
import java.util.HashMap;
import java.util.WeakHashMap;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private static final String f2023a = h.a("WakeLocks");

    /* renamed from: b  reason: collision with root package name */
    private static final WeakHashMap<PowerManager.WakeLock, String> f2024b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        synchronized (f2024b) {
            f2024b.put(newWakeLock, str2);
        }
        return newWakeLock;
    }

    public static void a() {
        HashMap hashMap = new HashMap();
        synchronized (f2024b) {
            hashMap.putAll(f2024b);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                h.a().e(f2023a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
    }
}
