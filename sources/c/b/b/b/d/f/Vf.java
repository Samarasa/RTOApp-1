package c.b.b.b.d.f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import c.b.b.b.b.c.c;
import com.google.android.gms.common.api.internal.C0526f;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.Ec;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Vf {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Vf f4312a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f4313b = null;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f4314c = null;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f4315d = false;

    /* renamed from: e  reason: collision with root package name */
    private static Boolean f4316e = null;

    /* renamed from: f  reason: collision with root package name */
    private static String f4317f = "use_dynamite_api";

    /* renamed from: g  reason: collision with root package name */
    private static String f4318g = "allow_remote_dynamite";
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final String f4319h;
    protected final e i;
    private final ExecutorService j;
    private final com.google.android.gms.measurement.a.a k;
    /* access modifiers changed from: private */
    public List<Pair<Ec, Object>> l;
    private int m;
    /* access modifiers changed from: private */
    public boolean n;
    private String o;
    /* access modifiers changed from: private */
    public C0338gf p;

    abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final long f4320a;

        /* renamed from: b  reason: collision with root package name */
        final long f4321b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f4322c;

        a(Vf vf) {
            this(true);
        }

        a(boolean z) {
            this.f4320a = Vf.this.i.a();
            this.f4321b = Vf.this.i.b();
            this.f4322c = z;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: protected */
        public void b() {
        }

        public void run() {
            if (Vf.this.n) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e2) {
                Vf.this.a(e2, false, this.f4322c);
                b();
            }
        }
    }

    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Vf.this.a((a) new C0428u(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            Vf.this.a((a) new C0462z(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            Vf.this.a((a) new C0456y(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            Vf.this.a((a) new C0435v(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C0330fe feVar = new C0330fe();
            Vf.this.a((a) new A(this, activity, feVar));
            Bundle c2 = feVar.c(50);
            if (c2 != null) {
                bundle.putAll(c2);
            }
        }

        public final void onActivityStarted(Activity activity) {
            Vf.this.a((a) new C0442w(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            Vf.this.a((a) new C0449x(this, activity));
        }
    }

    private Vf(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f4319h = (str == null || !b(str2, str3)) ? "FA" : str;
        this.i = h.d();
        this.j = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.k = new com.google.android.gms.measurement.a.a(this);
        boolean z = false;
        if (!(!f(context) || i())) {
            this.o = null;
            this.n = true;
            Log.w(this.f4319h, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!b(str2, str3)) {
            this.o = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.f4319h, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f4319h, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                this.n = true;
                return;
            }
        } else {
            this.o = str2;
        }
        a((a) new C0297b(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f4319h, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    public static Vf a(Context context) {
        return a(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static Vf a(Context context, String str, String str2, String str3, Bundle bundle) {
        C0563t.a(context);
        if (f4312a == null) {
            synchronized (Vf.class) {
                if (f4312a == null) {
                    f4312a = new Vf(context, str, str2, str3, bundle);
                }
            }
        }
        return f4312a;
    }

    /* access modifiers changed from: private */
    public final void a(a aVar) {
        this.j.execute(aVar);
    }

    /* access modifiers changed from: private */
    public final void a(Exception exc, boolean z, boolean z2) {
        this.n |= z;
        if (z) {
            Log.w(this.f4319h, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            a(5, "Error with data collection. Data lost.", (Object) exc, (Object) null, (Object) null);
        }
        Log.w(this.f4319h, "Error with data collection. Data lost.", exc);
    }

    private final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        a((a) new C0414s(this, l2, str, str2, bundle, z, z2));
    }

    private final void a(String str, String str2, Object obj, boolean z) {
        a((a) new C0401q(this, str, str2, obj, z));
    }

    private static boolean a(Context context, String str) {
        C0563t.b(str);
        try {
            ApplicationInfo a2 = c.a(context).a(context.getPackageName(), 128);
            if (a2 != null) {
                if (a2.metaData != null) {
                    return a2.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean b(Context context) {
        boolean z;
        i(context);
        synchronized (Vf.class) {
            if (!f4315d) {
                try {
                    String str = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{"measurement.dynamite.enabled", BuildConfig.FLAVOR});
                    if ("true".equals(str)) {
                        z = true;
                    } else if ("false".equals(str)) {
                        z = false;
                    } else {
                        f4316e = null;
                        f4315d = true;
                    }
                    f4316e = z;
                } catch (Exception e2) {
                    try {
                        Log.e("FA", "Unable to call SystemProperties.get()", e2);
                        f4316e = null;
                    } catch (Throwable th) {
                        f4315d = true;
                        throw th;
                    }
                }
                f4315d = true;
            }
        }
        Boolean bool = f4316e;
        if (bool == null) {
            bool = f4313b;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public static boolean b(String str, String str2) {
        return (str2 == null || str == null || i()) ? false : true;
    }

    private static boolean f(Context context) {
        try {
            C0526f.a(context);
            return C0526f.a() != null;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    public static int g(Context context) {
        return DynamiteModule.b(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    public static int h(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* access modifiers changed from: private */
    public static void i(Context context) {
        synchronized (Vf.class) {
            try {
                if (f4313b != null && f4314c != null) {
                    return;
                }
                if (a(context, "app_measurement_internal_disable_startup_flags")) {
                    f4313b = false;
                    f4314c = false;
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                f4313b = Boolean.valueOf(sharedPreferences.getBoolean(f4317f, false));
                f4314c = Boolean.valueOf(sharedPreferences.getBoolean(f4318g, false));
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove(f4317f);
                edit.remove(f4318g);
                edit.apply();
            } catch (Exception e2) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e2);
                f4313b = false;
                f4314c = false;
            }
        }
    }

    private static boolean i() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final Bundle a(Bundle bundle, boolean z) {
        C0330fe feVar = new C0330fe();
        a((a) new C0373m(this, bundle, feVar));
        if (z) {
            return feVar.c(5000);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final C0338gf a(Context context, boolean z) {
        DynamiteModule.b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.m;
            } catch (DynamiteModule.a e2) {
                a((Exception) e2, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.i;
        }
        return Ge.asInterface(DynamiteModule.a(context, bVar, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    public final com.google.android.gms.measurement.a.a a() {
        return this.k;
    }

    public final List<Bundle> a(String str, String str2) {
        C0330fe feVar = new C0330fe();
        a((a) new C0304c(this, str, str2, feVar));
        List<Bundle> list = (List) C0330fe.a(feVar.c(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        C0330fe feVar = new C0330fe();
        a((a) new C0359k(this, str, str2, z, feVar));
        Bundle c2 = feVar.c(5000);
        if (c2 == null || c2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(c2.size());
        for (String str3 : c2.keySet()) {
            Object obj = c2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void a(int i2, String str, Object obj, Object obj2, Object obj3) {
        a((a) new C0380n(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    public final void a(Activity activity, String str, String str2) {
        a((a) new C0311d(this, activity, str, str2));
    }

    public final void a(Bundle bundle) {
        a((a) new C0421t(this, bundle));
    }

    public final void a(String str) {
        a((a) new C0318e(this, str));
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, (Long) null);
    }

    public final void a(String str, String str2, Object obj) {
        a(str, str2, obj, true);
    }

    public final void a(boolean z) {
        a((a) new C0394p(this, z));
    }

    public final String b() {
        C0330fe feVar = new C0330fe();
        a((a) new C0339h(this, feVar));
        return feVar.b(500);
    }

    public final void b(String str) {
        a((a) new C0325f(this, str));
    }

    public final void b(String str, String str2, Bundle bundle) {
        a((a) new Xf(this, str, str2, bundle));
    }

    public final int c(String str) {
        C0330fe feVar = new C0330fe();
        a((a) new C0387o(this, str, feVar));
        Integer num = (Integer) C0330fe.a(feVar.c(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String c() {
        C0330fe feVar = new C0330fe();
        a((a) new C0332g(this, feVar));
        return feVar.b(50);
    }

    public final long d() {
        C0330fe feVar = new C0330fe();
        a((a) new C0352j(this, feVar));
        Long l2 = (Long) C0330fe.a(feVar.c(500), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.i.a()).nextLong();
        int i2 = this.m + 1;
        this.m = i2;
        return nextLong + ((long) i2);
    }

    public final String e() {
        C0330fe feVar = new C0330fe();
        a((a) new C0346i(this, feVar));
        return feVar.b(500);
    }

    public final String f() {
        C0330fe feVar = new C0330fe();
        a((a) new C0366l(this, feVar));
        return feVar.b(500);
    }

    public final String g() {
        return this.o;
    }
}
