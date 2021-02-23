package c.b.b.b.b.c;

import android.content.Context;
import com.google.android.gms.common.util.m;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static Context f3870a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f3871b;

    public static synchronized boolean a(Context context) {
        boolean z;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f3870a == null || f3871b == null || f3870a != applicationContext) {
                f3871b = null;
                if (m.k()) {
                    z = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f3871b = true;
                    } catch (ClassNotFoundException unused) {
                        z = false;
                    }
                    f3870a = applicationContext;
                    boolean booleanValue = f3871b.booleanValue();
                    return booleanValue;
                }
                f3871b = z;
                f3870a = applicationContext;
                boolean booleanValue2 = f3871b.booleanValue();
                return booleanValue2;
            }
            boolean booleanValue3 = f3871b.booleanValue();
            return booleanValue3;
        }
    }
}
