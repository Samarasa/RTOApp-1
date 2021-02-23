package c.a.a.h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import c.a.a.c.h;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap<String, h> f3622a = new ConcurrentHashMap();

    public static h a(Context context) {
        String packageName = context.getPackageName();
        h hVar = (h) f3622a.get(packageName);
        if (hVar != null) {
            return hVar;
        }
        h c2 = c(context);
        h putIfAbsent = f3622a.putIfAbsent(packageName, c2);
        return putIfAbsent == null ? c2 : putIfAbsent;
    }

    private static String a(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    private static PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e2);
            return null;
        }
    }

    private static h c(Context context) {
        return new c(a(b(context)));
    }
}
