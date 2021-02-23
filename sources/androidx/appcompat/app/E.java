package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

class E {

    /* renamed from: a  reason: collision with root package name */
    private static Field f134a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f135b;

    /* renamed from: c  reason: collision with root package name */
    private static Class f136c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f137d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f138e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f139f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f140g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f141h;

    static void a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                d(resources);
            } else if (i >= 23) {
                c(resources);
            } else if (i >= 21) {
                b(resources);
            }
        }
    }

    private static void a(Object obj) {
        LongSparseArray longSparseArray;
        if (!f137d) {
            try {
                f136c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f137d = true;
        }
        Class cls = f136c;
        if (cls != null) {
            if (!f139f) {
                try {
                    f138e = cls.getDeclaredField("mUnthemedEntries");
                    f138e.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                f139f = true;
            }
            Field field = f138e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    private static void b(Resources resources) {
        Map map;
        if (!f135b) {
            try {
                f134a = Resources.class.getDeclaredField("mDrawableCache");
                f134a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f135b = true;
        }
        Field field = f134a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void c(Resources resources) {
        if (!f135b) {
            try {
                f134a = Resources.class.getDeclaredField("mDrawableCache");
                f134a.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e2);
            }
            f135b = true;
        }
        Object obj = null;
        Field field = f134a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e3);
            }
        }
        if (obj != null) {
            a(obj);
        }
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f141h) {
            try {
                f140g = Resources.class.getDeclaredField("mResourcesImpl");
                f140g.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
            }
            f141h = true;
        }
        Field field = f140g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                obj = null;
            }
            if (obj != null) {
                if (!f135b) {
                    try {
                        f134a = obj.getClass().getDeclaredField("mDrawableCache");
                        f134a.setAccessible(true);
                    } catch (NoSuchFieldException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                    }
                    f135b = true;
                }
                Field field2 = f134a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e5) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                    }
                }
                if (obj2 != null) {
                    a(obj2);
                }
            }
        }
    }
}
