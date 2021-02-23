package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import c.b.b.b.b.j;
import com.google.android.gms.ads.b.d;
import com.google.android.gms.ads.b.e;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.h;
import com.google.android.gms.ads.i.b;
import com.google.android.gms.ads.m;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.Hk  reason: case insensitive filesystem */
public final class C0758Hk {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f7186a = new DW(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private static final String f7187b = h.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static final String f7188c = m.class.getName();

    /* renamed from: d  reason: collision with root package name */
    private static final String f7189d = d.class.getName();

    /* renamed from: e  reason: collision with root package name */
    private static final String f7190e = e.class.getName();

    /* renamed from: f  reason: collision with root package name */
    private static final String f7191f = b.class.getName();

    /* renamed from: g  reason: collision with root package name */
    private static final String f7192g = com.google.android.gms.ads.d.class.getName();

    /* renamed from: h  reason: collision with root package name */
    private float f7193h = -1.0f;

    public static int a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public static f a(Context context, int i, int i2, int i3) {
        int i4;
        float f2;
        float f3;
        int d2 = d(context, i3);
        if (d2 == -1) {
            return f.i;
        }
        int min = Math.min(90, Math.round(((float) d2) * 0.15f));
        if (i > 655) {
            f2 = ((float) i) / 728.0f;
            f3 = 90.0f;
        } else {
            if (i > 632) {
                i4 = 81;
            } else if (i > 526) {
                f2 = ((float) i) / 468.0f;
                f3 = 60.0f;
            } else if (i > 432) {
                i4 = 68;
            } else {
                f2 = ((float) i) / 320.0f;
                f3 = 50.0f;
            }
            return new f(i, Math.max(Math.min(i4, min), 50));
        }
        i4 = Math.round(f2 * f3);
        return new f(i, Math.max(Math.min(i4, min), 50));
    }

    public static String a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || a()) {
            string = "emulator";
        }
        return a(string);
    }

    public static String a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    public static String a(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f7187b.equalsIgnoreCase(className) && !f7188c.equalsIgnoreCase(className) && !f7189d.equalsIgnoreCase(className) && !f7190e.equalsIgnoreCase(className) && !f7191f.equalsIgnoreCase(className) && !f7192g.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            int i3 = 2;
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    public static Throwable a(Throwable th) {
        if (C0800Ja.f7439f.a().booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (b(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!(!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java.")))) {
                        stackTraceElement = new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1);
                    }
                    arrayList.add(stackTraceElement);
                }
            }
            if (z) {
                th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    public static void a(Context context, String str, String str2, Bundle bundle, boolean z, C0862Lk lk) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int a2 = c.b.b.b.b.f.a().a(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(a2);
            sb.append(".203404000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        lk.a(appendQueryParameter.toString());
    }

    private static void a(ViewGroup viewGroup, C2462qqa qqa, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int b2 = b(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(qqa.f11919f - b2, qqa.f11916c - b2, 17));
            viewGroup.addView(frameLayout, qqa.f11919f, qqa.f11916c);
        }
    }

    public static void a(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    public static boolean a() {
        return Build.DEVICE.startsWith("generic");
    }

    public static int b(Context context, int i) {
        return a(context.getResources().getDisplayMetrics(), i);
    }

    public static int b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    public static String b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            return null;
        }
        return Settings.Secure.getString(contentResolver, "android_id");
    }

    public static boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(C0800Ja.f7437d.a());
    }

    public static String c() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    public static boolean c(Context context) {
        int a2 = c.b.b.b.b.f.a().a(context, (int) j.f3888a);
        return a2 == 0 || a2 == 2;
    }

    public static boolean c(Context context, int i) {
        return c.b.b.b.b.f.a().a(context, i) == 0;
    }

    public static int d(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        return Math.round(((float) (i == i2 ? displayMetrics.heightPixels : displayMetrics.widthPixels)) / displayMetrics.density);
    }

    public static boolean d(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    public static boolean e(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (com.google.android.gms.common.util.m.d()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i2 = displayMetrics.heightPixels;
            i = displayMetrics.widthPixels;
        } else {
            try {
                i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.heightPixels == i2 && displayMetrics.widthPixels == i;
    }

    public static int f(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final int a(Context context, int i) {
        if (this.f7193h < 0.0f) {
            synchronized (this) {
                if (this.f7193h < 0.0f) {
                    Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f7193h = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i) / this.f7193h);
    }

    public final void a(Context context, String str, String str2, Bundle bundle, boolean z) {
        a(context, str, str2, bundle, true, new C0810Jk(this));
    }

    public final void a(ViewGroup viewGroup, C2462qqa qqa, String str) {
        a(viewGroup, qqa, str, -16777216, -1);
    }

    public final void a(ViewGroup viewGroup, C2462qqa qqa, String str, String str2) {
        C1018Rk.d(str2);
        a(viewGroup, qqa, str, -65536, -16777216);
    }
}
