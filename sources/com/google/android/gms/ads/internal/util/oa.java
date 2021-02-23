package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import androidx.core.app.q;
import c.b.b.b.b.c.c;
import com.google.android.gms.ads.d.a;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.util.g;
import com.google.android.gms.common.util.k;
import com.google.android.gms.common.util.m;
import com.google.android.gms.internal.ads.C0758Hk;
import com.google.android.gms.internal.ads.C0800Ja;
import com.google.android.gms.internal.ads.C0808Ji;
import com.google.android.gms.internal.ads.C0836Kk;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1252_k;
import com.google.android.gms.internal.ads.C1720ga;
import com.google.android.gms.internal.ads.C1791ha;
import com.google.android.gms.internal.ads.C1932ja;
import com.google.android.gms.internal.ads.C2047l;
import com.google.android.gms.internal.ads.C3067za;
import com.google.android.gms.internal.ads.DW;
import com.google.android.gms.internal.ads.DY;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.LY;
import com.google.android.gms.internal.ads.Qqa;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class oa {

    /* renamed from: a  reason: collision with root package name */
    public static final DW f5628a = new ia(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private AtomicReference<Pattern> f5629b = new AtomicReference<>((Object) null);

    /* renamed from: c  reason: collision with root package name */
    private AtomicReference<Pattern> f5630c = new AtomicReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f5631d = true;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Object f5632e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String f5633f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5634g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f5635h = false;

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'A';
        if (c2 < 'A' || c2 > 'F') {
            c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                throw new IllegalArgumentException("Invalid Hex.");
            }
        }
        return (c2 - c3) + 10;
    }

    public static int a(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        StringBuilder sb = new StringBuilder(97);
        sb.append("HTTP timeout too low: ");
        sb.append(i);
        sb.append(" milliseconds. Reverting to default timeout: 60000 milliseconds.");
        C1018Rk.d(sb.toString());
        return 60000;
    }

    public static int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Could not parse value:");
            sb.append(valueOf);
            C1018Rk.d(sb.toString());
            return 0;
        }
    }

    public static Bitmap a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    public static DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static WebResourceResponse a(HttpURLConnection httpURLConnection) {
        p.c();
        String contentType = httpURLConnection.getContentType();
        boolean isEmpty = TextUtils.isEmpty(contentType);
        String str = BuildConfig.FLAVOR;
        String trim = isEmpty ? str : contentType.split(";")[0].trim();
        p.c();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length != 1) {
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    if (split[i].trim().startsWith("charset")) {
                        String[] split2 = split[i].trim().split("=");
                        if (split2.length > 1) {
                            str = split2[1].trim();
                            break;
                        }
                    }
                    i++;
                }
            }
        }
        String str2 = str;
        Map headerFields = httpURLConnection.getHeaderFields();
        HashMap hashMap = new HashMap(headerFields.size());
        for (Map.Entry entry : headerFields.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null || ((List) entry.getValue()).size() <= 0)) {
                hashMap.put((String) entry.getKey(), (String) ((List) entry.getValue()).get(0));
            }
        }
        return p.e().a(trim, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
    }

    public static PopupWindow a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, false);
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }

    public static String a(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    private final JSONArray a(Collection<?> collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object a2 : collection) {
            a(jSONArray, (Object) a2);
        }
        return jSONArray;
    }

    public static void a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static void a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            new S(context, str, (String) obj).b();
        }
    }

    public static void a(Context context, Throwable th) {
        if (context != null) {
            boolean z = false;
            try {
                z = C0800Ja.f7435b.a().booleanValue();
            } catch (IllegalStateException unused) {
            }
            if (z) {
                g.a(context, th);
            }
        }
    }

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            C1252_k.f9699a.execute(runnable);
        }
    }

    private final void a(JSONArray jSONArray, Object obj) {
        Object a2;
        if (obj instanceof Bundle) {
            a2 = a((Bundle) obj);
        } else if (obj instanceof Map) {
            a2 = a((Map<String, ?>) (Map) obj);
        } else if (obj instanceof Collection) {
            a2 = a((Collection<?>) (Collection) obj);
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object a3 : (Object[]) obj) {
                a(jSONArray2, a3);
            }
            jSONArray.put(jSONArray2);
            return;
        } else {
            jSONArray.put(obj);
            return;
        }
        jSONArray.put(a2);
    }

    private final void a(JSONObject jSONObject, String str, Object obj) {
        Collection asList;
        Object a2;
        if (obj instanceof Bundle) {
            a2 = a((Bundle) obj);
        } else if (obj instanceof Map) {
            a2 = a((Map<String, ?>) (Map) obj);
        } else {
            if (obj instanceof Collection) {
                if (str == null) {
                    str = "null";
                }
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                jSONObject.put(str, obj);
                return;
            }
            a2 = a((Collection<?>) asList);
        }
        jSONObject.put(str, a2);
    }

    public static boolean a(Context context, String str) {
        Context b2 = C0808Ji.b(context);
        return c.a(b2).a(str, b2.getPackageName()) == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.view.View r3, android.os.PowerManager r4, android.app.KeyguardManager r5) {
        /*
            com.google.android.gms.ads.internal.util.oa r0 = com.google.android.gms.ads.internal.p.c()
            boolean r0 = r0.f5631d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001d
            if (r5 != 0) goto L_0x000e
            r5 = 0
            goto L_0x0012
        L_0x000e:
            boolean r5 = r5.inKeyguardRestrictedInputMode()
        L_0x0012:
            if (r5 == 0) goto L_0x001d
            boolean r5 = c((android.view.View) r3)
            if (r5 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r5 = 0
            goto L_0x001e
        L_0x001d:
            r5 = 1
        L_0x001e:
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L_0x0063
            boolean r0 = r3.isShown()
            if (r0 == 0) goto L_0x0063
            if (r4 == 0) goto L_0x0035
            boolean r4 = r4.isScreenOn()
            if (r4 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r4 = 0
            goto L_0x0036
        L_0x0035:
            r4 = 1
        L_0x0036:
            if (r4 == 0) goto L_0x0063
            if (r5 == 0) goto L_0x0063
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.F.bb
            com.google.android.gms.internal.ads.B r5 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r4 = r5.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0062
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            boolean r4 = r3.getLocalVisibleRect(r4)
            if (r4 != 0) goto L_0x0062
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            boolean r3 = r3.getGlobalVisibleRect(r4)
            if (r3 == 0) goto L_0x0063
        L_0x0062:
            return r1
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.oa.a(android.view.View, android.os.PowerManager, android.app.KeyguardManager):boolean");
    }

    public static boolean a(ClassLoader classLoader, Class<?> cls, List<String> list) {
        for (String cls2 : list) {
            try {
                if (Class.forName(cls2, false, classLoader).isAssignableFrom(cls)) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean a(String str, AtomicReference<Pattern> atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    public static int[] a(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return e();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    public static Bitmap b(View view) {
        if (view == null) {
            return null;
        }
        Bitmap g2 = g(view);
        return g2 == null ? f(view) : g2;
    }

    public static String b() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    private static String b(Bundle bundle) {
        if (bundle == null) {
            return BuildConfig.FLAVOR;
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        return TextUtils.isEmpty(string) ? BuildConfig.FLAVOR : (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) ? string : BuildConfig.FLAVOR;
    }

    public static Map<String, String> b(Uri uri) {
        if (!C3067za.f13070b.a().booleanValue()) {
            if (uri == null) {
                return null;
            }
            HashMap hashMap = new HashMap();
            p.e();
            for (String next : uri.getQueryParameterNames()) {
                hashMap.put(next, uri.getQueryParameter(next));
            }
            return hashMap;
        } else if (uri == null) {
            return null;
        } else {
            HashMap hashMap2 = new HashMap(20);
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery == null) {
                return hashMap2;
            }
            int length = encodedQuery.length();
            StringBuilder sb = new StringBuilder(100);
            StringBuilder sb2 = new StringBuilder(length);
            StringBuilder sb3 = sb;
            int i = 0;
            while (i < length) {
                char charAt = encodedQuery.charAt(i);
                if (charAt == '%') {
                    byte[] bArr = new byte[((length - i) / 3)];
                    int i2 = 0;
                    while (i < length - 2 && charAt == '%') {
                        try {
                            bArr[i2] = (byte) ((a(encodedQuery.charAt(i + 1)) << 4) + a(encodedQuery.charAt(i + 2)));
                            i2++;
                        } catch (IllegalArgumentException unused) {
                        }
                        i += 3;
                        if (i < length) {
                            charAt = encodedQuery.charAt(i);
                        }
                    }
                    try {
                        sb3.append(new String(bArr, 0, i2, "UTF-8"));
                    } catch (UnsupportedEncodingException unused2) {
                    }
                    if (charAt != '%') {
                    }
                } else if (charAt != '&') {
                    if (charAt == '+') {
                        charAt = ' ';
                    } else if (charAt == '=' && sb3 != sb2) {
                        sb3 = sb2;
                    }
                    sb3.append(charAt);
                } else {
                    if (sb.length() > 0 && sb3 != sb) {
                        hashMap2.put(sb.toString(), sb2.toString());
                        sb.setLength(0);
                        sb2.setLength(0);
                    }
                    sb3 = sb;
                }
                i++;
            }
            if (sb.length() > 0 && sb3 != sb) {
                hashMap2.put(sb.toString(), sb2.toString());
            }
            return hashMap2;
        }
    }

    @TargetApi(18)
    public static void b(Context context, Intent intent) {
        if (intent != null && m.e()) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    @TargetApi(18)
    public static void b(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            b(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(uri2).length() + 26);
            sb.append("Opening ");
            sb.append(uri2);
            sb.append(" in a new browser.");
            C1018Rk.a(sb.toString());
        } catch (ActivityNotFoundException e2) {
            C1018Rk.b("No browser is found.", e2);
        }
    }

    public static void b(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes("UTF-8"));
            openFileOutput.close();
        } catch (Exception e2) {
            C1018Rk.b("Error writing to file in internal storage.", e2);
        }
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    public static int[] b(Activity activity) {
        int[] a2 = a(activity);
        return new int[]{Qqa.a().a((Context) activity, a2[0]), Qqa.a().a((Context) activity, a2[1])};
    }

    public static WebResourceResponse c(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", p.c().b(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            String str3 = new C0518y(context).a(str2, hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e2) {
            C1018Rk.c("Could not fetch MRAID JS.", e2);
            return null;
        }
    }

    public static String c() {
        Resources b2 = p.g().b();
        return b2 != null ? b2.getString(a.s7) : "Test Ad";
    }

    protected static String c(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return d();
        }
    }

    public static String c(Context context, String str) {
        try {
            return new String(k.a((InputStream) context.openFileInput(str), true), "UTF-8");
        } catch (IOException unused) {
            C1018Rk.a("Error reading from internal storage.");
            return BuildConfig.FLAVOR;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 == 0) goto L_0x0012
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0012
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x0013
        L_0x0012:
            r2 = r0
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.oa.c(android.view.View):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] c(android.app.Activity r6) {
        /*
            android.view.Window r0 = r6.getWindow()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0021
            r4 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto L_0x0021
            int[] r4 = new int[r1]
            int r5 = r0.getTop()
            r4[r3] = r5
            int r0 = r0.getBottom()
            r4[r2] = r0
            goto L_0x0025
        L_0x0021:
            int[] r4 = e()
        L_0x0025:
            int[] r0 = new int[r1]
            com.google.android.gms.internal.ads.Hk r1 = com.google.android.gms.internal.ads.Qqa.a()
            r5 = r4[r3]
            int r1 = r1.a((android.content.Context) r6, (int) r5)
            r0[r3] = r1
            com.google.android.gms.internal.ads.Hk r1 = com.google.android.gms.internal.ads.Qqa.a()
            r3 = r4[r2]
            int r6 = r1.a((android.content.Context) r6, (int) r3)
            r0[r2] = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.oa.c(android.app.Activity):int[]");
    }

    public static int d(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return -1;
        }
        return ((AdapterView) parent).getPositionForView(view);
    }

    public static AlertDialog.Builder d(Context context) {
        return new AlertDialog.Builder(context);
    }

    private static String d() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static C2047l e(Context context) {
        return new C2047l(context);
    }

    public static boolean e(View view) {
        if (view == null) {
            return false;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof ScrollView)) {
            parent = parent.getParent();
        }
        return parent != null;
    }

    public static boolean e(String str) {
        if (!C0836Kk.a()) {
            return false;
        }
        if (!((Boolean) Qqa.e().a(F.kd)).booleanValue()) {
            return false;
        }
        String str2 = (String) Qqa.e().a(F.md);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) Qqa.e().a(F.ld);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static int[] e() {
        return new int[]{0, 0};
    }

    private static Bitmap f(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width != 0) {
                if (height != 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                    Canvas canvas = new Canvas(createBitmap);
                    view.layout(0, 0, width, height);
                    view.draw(canvas);
                    return createBitmap;
                }
            }
            C1018Rk.d("Width or height of view is zero");
            return null;
        } catch (RuntimeException e2) {
            C1018Rk.b("Fail to capture the webview", e2);
            return null;
        }
    }

    @SuppressLint({"NewApi"})
    public static String f(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (!(activityManager == null || (runningTasks = activityManager.getRunningTasks(1)) == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || runningTaskInfo.topActivity == null)) {
                return runningTaskInfo.topActivity.getClassName();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static Bitmap g(View view) {
        Bitmap bitmap = null;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                bitmap = Bitmap.createBitmap(drawingCache);
            }
            view.setDrawingCacheEnabled(isDrawingCacheEnabled);
        } catch (RuntimeException e2) {
            C1018Rk.b("Fail to capture the web view", e2);
        }
        return bitmap;
    }

    public static boolean g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            return !(powerManager == null ? false : powerManager.isScreenOn());
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int h(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return 0;
        }
        return applicationInfo.targetSdkVersion;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r2 = u(r2);
     */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i(android.content.Context r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0018
            boolean r1 = com.google.android.gms.common.util.m.c()
            if (r1 != 0) goto L_0x000a
            goto L_0x0018
        L_0x000a:
            android.app.KeyguardManager r2 = u(r2)
            if (r2 == 0) goto L_0x0018
            boolean r2 = r2.isKeyguardLocked()
            if (r2 == 0) goto L_0x0018
            r2 = 1
            return r2
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.oa.i(android.content.Context):boolean");
    }

    public static boolean j(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            C1018Rk.b("Error loading class.", th);
            p.g().a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static String k(Context context) {
        return !((Boolean) Qqa.e().a(F.f6794se)).booleanValue() ? BuildConfig.FLAVOR : context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", BuildConfig.FLAVOR);
    }

    public static Bundle l(Context context) {
        if (!((Boolean) Qqa.e().a(F.te)).booleanValue()) {
            return null;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Bundle bundle = new Bundle();
        if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
            bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
        }
        String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
        for (int i = 0; i < 4; i++) {
            String str = strArr[i];
            if (defaultSharedPreferences.contains(str)) {
                bundle.putString(str, defaultSharedPreferences.getString(str, (String) null));
            }
        }
        return bundle;
    }

    public static boolean m(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            return (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) ? false : true;
        }
    }

    public static String n(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return b(t(context));
    }

    public static boolean o(Context context) {
        Bundle t = t(context);
        return TextUtils.isEmpty(b(t)) && !TextUtils.isEmpty(t.getString("com.google.android.gms.ads.INTEGRATION_MANAGER"));
    }

    public static boolean p(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @TargetApi(26)
    public static void q(Context context) {
        if (m.k()) {
            NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    public static boolean r(Context context) {
        return q.a(context).a();
    }

    public static H s(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                C1018Rk.b("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            return queryLocalInterface instanceof H ? (H) queryLocalInterface : new J(iBinder);
        } catch (Exception e2) {
            p.g().a((Throwable) e2, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    private static Bundle t(Context context) {
        try {
            return c.a(context).a(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            fa.e("Error getting metadata", e2);
            return null;
        }
    }

    private static KeyguardManager u(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    @TargetApi(18)
    public final int a(Context context, Uri uri) {
        int i;
        if (!m.e()) {
            fa.f("Chrome Custom Tabs can only work with version Jellybean onwards.");
            i = C1932ja.f10948a;
        } else if (!(context instanceof Activity)) {
            fa.f("Chrome Custom Tabs can only work with Activity context.");
            i = C1932ja.f10949b;
        } else if (!C1791ha.a(context)) {
            fa.f("Default browser does not support custom tabs.");
            i = C1932ja.f10950c;
        } else {
            i = 0;
        }
        if (i != 0) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            intent.addFlags(268435456);
            context.startActivity(intent);
            return i;
        }
        C1791ha haVar = new C1791ha();
        haVar.a((C1720ga) new pa(this, haVar, context, uri));
        haVar.b((Activity) context);
        return C1932ja.f10951d;
    }

    public final LY<Map<String, String>> a(Uri uri) {
        return DY.a(DY.a(null), new na(this, uri), (Executor) C1252_k.f9699a);
    }

    public final JSONObject a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject a(Bundle bundle, JSONObject jSONObject) {
        if (bundle != null) {
            try {
                return a(bundle);
            } catch (JSONException e2) {
                C1018Rk.b("Error converting Bundle to JSON", e2);
            }
        }
        return null;
    }

    public final JSONObject a(Map<String, ?> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                a(jSONObject, next, (Object) map.get(next));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            throw new JSONException(valueOf.length() != 0 ? "Could not convert map to JSON: ".concat(valueOf) : new String("Could not convert map to JSON: "));
        }
    }

    public final void a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(b(context, str));
    }

    public final void a(Context context, String str, String str2, Bundle bundle, boolean z) {
        p.c();
        bundle.putString("device", b());
        bundle.putString("eids", TextUtils.join(",", F.a()));
        Qqa.a();
        C0758Hk.a(context, str, str2, bundle, true, new ra(this, context, str));
    }

    public final void a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        a(context, str, false, httpURLConnection, false, 60000);
    }

    public final void a(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int a2 = a(i);
        StringBuilder sb = new StringBuilder(39);
        sb.append("HTTP timeout: ");
        sb.append(a2);
        sb.append(" milliseconds.");
        C1018Rk.c(sb.toString());
        httpURLConnection.setConnectTimeout(a2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(a2);
        httpURLConnection.setRequestProperty("User-Agent", b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    public final boolean a(Context context) {
        if (this.f5634g) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new ta(this, (qa) null), intentFilter);
        this.f5634g = true;
        return true;
    }

    public final boolean a(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return a(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, u(context));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x003b, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ Exception -> 0x00b6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7 A[Catch:{ Exception -> 0x00b6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(android.content.Context r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f5632e
            monitor-enter(r0)
            java.lang.String r1 = r4.f5633f     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x000b
            java.lang.String r5 = r4.f5633f     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x000b:
            if (r6 != 0) goto L_0x0013
            java.lang.String r5 = d()     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x0013:
            com.google.android.gms.ads.internal.util.wa r1 = com.google.android.gms.ads.internal.p.e()     // Catch:{ Exception -> 0x001d }
            java.lang.String r1 = r1.a((android.content.Context) r5)     // Catch:{ Exception -> 0x001d }
            r4.f5633f = r1     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            java.lang.String r1 = r4.f5633f     // Catch:{ all -> 0x00d2 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00d2 }
            if (r1 == 0) goto L_0x006e
            com.google.android.gms.internal.ads.Qqa.a()     // Catch:{ all -> 0x00d2 }
            boolean r1 = com.google.android.gms.internal.ads.C0758Hk.b()     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x0068
            r1 = 0
            r4.f5633f = r1     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.internal.ads.DW r1 = f5628a     // Catch:{ all -> 0x00d2 }
            com.google.android.gms.ads.internal.util.sa r2 = new com.google.android.gms.ads.internal.util.sa     // Catch:{ all -> 0x00d2 }
            r2.<init>(r4, r5)     // Catch:{ all -> 0x00d2 }
            r1.post(r2)     // Catch:{ all -> 0x00d2 }
        L_0x003b:
            java.lang.String r1 = r4.f5633f     // Catch:{ all -> 0x00d2 }
            if (r1 != 0) goto L_0x006e
            java.lang.Object r1 = r4.f5632e     // Catch:{ InterruptedException -> 0x0045 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0045 }
            goto L_0x003b
        L_0x0045:
            java.lang.String r1 = d()     // Catch:{ all -> 0x00d2 }
            r4.f5633f = r1     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "Interrupted, use default user agent: "
            java.lang.String r2 = r4.f5633f     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00d2 }
            int r3 = r2.length()     // Catch:{ all -> 0x00d2 }
            if (r3 == 0) goto L_0x005e
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00d2 }
            goto L_0x0064
        L_0x005e:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x00d2 }
            r2.<init>(r1)     // Catch:{ all -> 0x00d2 }
            r1 = r2
        L_0x0064:
            com.google.android.gms.internal.ads.C1018Rk.d(r1)     // Catch:{ all -> 0x00d2 }
            goto L_0x003b
        L_0x0068:
            java.lang.String r1 = c((android.content.Context) r5)     // Catch:{ all -> 0x00d2 }
            r4.f5633f = r1     // Catch:{ all -> 0x00d2 }
        L_0x006e:
            java.lang.String r1 = r4.f5633f     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00d2 }
            int r2 = r2.length()     // Catch:{ all -> 0x00d2 }
            int r2 = r2 + 10
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00d2 }
            int r3 = r3.length()     // Catch:{ all -> 0x00d2 }
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            r3.<init>(r2)     // Catch:{ all -> 0x00d2 }
            r3.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = " (Mobile; "
            r3.append(r1)     // Catch:{ all -> 0x00d2 }
            r3.append(r6)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00d2 }
            r4.f5633f = r6     // Catch:{ all -> 0x00d2 }
            c.b.b.b.b.c.b r5 = c.b.b.b.b.c.c.a(r5)     // Catch:{ Exception -> 0x00b6 }
            boolean r5 = r5.a()     // Catch:{ Exception -> 0x00b6 }
            if (r5 == 0) goto L_0x00c0
            java.lang.String r5 = r4.f5633f     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b6 }
            java.lang.String r6 = ";aia"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ Exception -> 0x00b6 }
            r4.f5633f = r5     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00c0
        L_0x00b6:
            r5 = move-exception
            com.google.android.gms.internal.ads.wk r6 = com.google.android.gms.ads.internal.p.g()     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "AdUtil.getUserAgent"
            r6.a((java.lang.Throwable) r5, (java.lang.String) r1)     // Catch:{ all -> 0x00d2 }
        L_0x00c0:
            java.lang.String r5 = r4.f5633f     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = ")"
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x00d2 }
            r4.f5633f = r5     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = r4.f5633f     // Catch:{ all -> 0x00d2 }
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            return r5
        L_0x00d2:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x00d6
        L_0x00d5:
            throw r5
        L_0x00d6:
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.oa.b(android.content.Context, java.lang.String):java.lang.String");
    }

    public final boolean b(Context context) {
        if (this.f5635h) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        context.getApplicationContext().registerReceiver(new ua(this, (qa) null), intentFilter);
        this.f5635h = true;
        return true;
    }

    public final boolean c(String str) {
        return a(str, this.f5629b, (String) Qqa.e().a(F.V));
    }

    public final boolean d(String str) {
        return a(str, this.f5630c, (String) Qqa.e().a(F.W));
    }
}
