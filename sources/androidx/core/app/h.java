package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

final class h {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f863a = a();

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f864b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f865c = c();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f866d = b(f863a);

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f867e = a(f863a);

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f868f = c(f863a);

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f869g = new Handler(Looper.getMainLooper());

    private static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        Object f870a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f871b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f872c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f873d = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f874e = false;

        a(Activity activity) {
            this.f871b = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f871b == activity) {
                this.f871b = null;
                this.f873d = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f873d && !this.f874e && !this.f872c && h.a(this.f870a, activity)) {
                this.f874e = true;
                this.f870a = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f871b == activity) {
                this.f872c = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a(Activity activity) {
        Object obj;
        Application application;
        a aVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (d() && f868f == null) {
            return false;
        } else {
            if (f867e == null && f866d == null) {
                return false;
            }
            try {
                Object obj2 = f865c.get(activity);
                if (obj2 == null || (obj = f864b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                aVar = new a(activity);
                application.registerActivityLifecycleCallbacks(aVar);
                f869g.post(new e(aVar, obj2));
                if (d()) {
                    f868f.invoke(obj, new Object[]{obj2, null, null, 0, false, null, null, false, false});
                } else {
                    activity.recreate();
                }
                f869g.post(new f(application, aVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    protected static boolean a(Object obj, Activity activity) {
        try {
            Object obj2 = f865c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f869g.postAtFrontOfQueue(new g(f864b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (d() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static boolean d() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
