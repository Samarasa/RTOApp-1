package c.b.d.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import c.b.d.c.c;
import java.util.concurrent.atomic.AtomicBoolean;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4947a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f4948b;

    /* renamed from: c  reason: collision with root package name */
    private final c f4949c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f4950d = new AtomicBoolean(b());

    public a(Context context, String str, c cVar) {
        this.f4947a = a(context);
        this.f4948b = context.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f4949c = cVar;
    }

    private static Context a(Context context) {
        return (Build.VERSION.SDK_INT < 24 || b.h.a.a.c(context)) ? context : b.h.a.a.a(context);
    }

    private boolean b() {
        ApplicationInfo applicationInfo;
        if (this.f4948b.contains("firebase_data_collection_default_enabled")) {
            return this.f4948b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f4947a.getPackageManager();
            if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f4947a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    public boolean a() {
        return this.f4950d.get();
    }
}
