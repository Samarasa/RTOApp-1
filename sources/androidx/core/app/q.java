package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f916a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static Set<String> f917b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f918c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Context f919d;

    /* renamed from: e  reason: collision with root package name */
    private final NotificationManager f920e = ((NotificationManager) this.f919d.getSystemService("notification"));

    private q(Context context) {
        this.f919d = context;
    }

    public static q a(Context context) {
        return new q(context);
    }

    public boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return this.f920e.areNotificationsEnabled();
        }
        if (i < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f919d.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f919d.getApplicationInfo();
        String packageName = this.f919d.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            return ((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
