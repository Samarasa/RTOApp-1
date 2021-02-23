package c.a.a.c.b.b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final int f3089a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3090b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f3091c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3092d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final int f3093a = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: b  reason: collision with root package name */
        final Context f3094b;

        /* renamed from: c  reason: collision with root package name */
        ActivityManager f3095c;

        /* renamed from: d  reason: collision with root package name */
        c f3096d;

        /* renamed from: e  reason: collision with root package name */
        float f3097e = 2.0f;

        /* renamed from: f  reason: collision with root package name */
        float f3098f = ((float) f3093a);

        /* renamed from: g  reason: collision with root package name */
        float f3099g = 0.4f;

        /* renamed from: h  reason: collision with root package name */
        float f3100h = 0.33f;
        int i = 4194304;

        public a(Context context) {
            this.f3094b = context;
            this.f3095c = (ActivityManager) context.getSystemService("activity");
            this.f3096d = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && j.a(this.f3095c)) {
                this.f3098f = 0.0f;
            }
        }

        public j a() {
            return new j(this);
        }
    }

    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayMetrics f3101a;

        b(DisplayMetrics displayMetrics) {
            this.f3101a = displayMetrics;
        }

        public int a() {
            return this.f3101a.heightPixels;
        }

        public int b() {
            return this.f3101a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    j(a aVar) {
        this.f3091c = aVar.f3094b;
        this.f3092d = a(aVar.f3095c) ? aVar.i / 2 : aVar.i;
        int a2 = a(aVar.f3095c, aVar.f3099g, aVar.f3100h);
        float b2 = (float) (aVar.f3096d.b() * aVar.f3096d.a() * 4);
        int round = Math.round(aVar.f3098f * b2);
        int round2 = Math.round(b2 * aVar.f3097e);
        int i = a2 - this.f3092d;
        int i2 = round2 + round;
        if (i2 <= i) {
            this.f3090b = round2;
            this.f3089a = round;
        } else {
            float f2 = (float) i;
            float f3 = aVar.f3098f;
            float f4 = aVar.f3097e;
            float f5 = f2 / (f3 + f4);
            this.f3090b = Math.round(f4 * f5);
            this.f3089a = Math.round(f5 * aVar.f3098f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(a(this.f3090b));
            sb.append(", pool size: ");
            sb.append(a(this.f3089a));
            sb.append(", byte array size: ");
            sb.append(a(this.f3092d));
            sb.append(", memory class limited? ");
            sb.append(i2 > a2);
            sb.append(", max size: ");
            sb.append(a(a2));
            sb.append(", memoryClass: ");
            sb.append(aVar.f3095c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(a(aVar.f3095c));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    private static int a(ActivityManager activityManager, float f2, float f3) {
        boolean a2 = a(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (a2) {
            f2 = f3;
        }
        return Math.round(memoryClass * f2);
    }

    private String a(int i) {
        return Formatter.formatFileSize(this.f3091c, (long) i);
    }

    @TargetApi(19)
    static boolean a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    public int a() {
        return this.f3092d;
    }

    public int b() {
        return this.f3089a;
    }

    public int c() {
        return this.f3090b;
    }
}
