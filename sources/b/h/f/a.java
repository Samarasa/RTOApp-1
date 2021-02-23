package b.h.f;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f2414a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f2415b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f2416c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f2417d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f2418e;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                f2414a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f2415b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
                f2416c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                f2417d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
                f2418e = Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
