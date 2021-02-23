package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import c.b.b.b.b.c.c;
import c.b.b.b.b.f;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.Th  reason: case insensitive filesystem */
public final class C1067Th implements C1171Xh {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f8810a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static C1171Xh f8811b = null;

    /* renamed from: c  reason: collision with root package name */
    private static C1171Xh f8812c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Object f8813d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f8814e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakHashMap<Thread, Boolean> f8815f;

    /* renamed from: g  reason: collision with root package name */
    private final ExecutorService f8816g;

    /* renamed from: h  reason: collision with root package name */
    private final C1200Yk f8817h;

    private C1067Th(Context context) {
        this(context, C1200Yk.g());
    }

    private C1067Th(Context context, C1200Yk yk) {
        this.f8813d = new Object();
        this.f8815f = new WeakHashMap<>();
        this.f8816g = C2850wW.a().b(BW.f6298b);
        this.f8814e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f8817h = yk;
    }

    private final Uri.Builder a(String str, String str2, String str3, int i) {
        boolean z;
        String str4;
        try {
            z = c.a(this.f8814e).a();
        } catch (Throwable th) {
            C1018Rk.b("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.f8814e.getPackageName();
        } catch (Throwable unused) {
            C1018Rk.d("Cannot obtain package name, proceeding.");
            str4 = "unknown";
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.f8817h.f9456a).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", F.a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "334274230").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", Qqa.f()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(C0800Ja.f7436c.a()));
        if (((Boolean) Qqa.e().a(F.hb)).booleanValue()) {
            appendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(f.a().a(this.f8814e))).appendQueryParameter("lite", this.f8817h.f9460e ? "1" : "0");
        }
        return appendQueryParameter2;
    }

    public static C1171Xh a(Context context) {
        synchronized (f8810a) {
            if (f8811b == null) {
                if (C0800Ja.f7438e.a().booleanValue()) {
                    if (!((Boolean) Qqa.e().a(F.gf)).booleanValue()) {
                        f8811b = new C1067Th(context);
                    }
                }
                f8811b = new C1145Wh();
            }
        }
        return f8811b;
    }

    public static C1171Xh a(Context context, C1200Yk yk) {
        synchronized (f8810a) {
            if (f8812c == null) {
                if (C0800Ja.f7438e.a().booleanValue()) {
                    if (!((Boolean) Qqa.e().a(F.gf)).booleanValue()) {
                        C1067Th th = new C1067Th(context, yk);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (th.f8813d) {
                                th.f8815f.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new C1093Uh(th, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new C1119Vh(th, Thread.getDefaultUncaughtExceptionHandler()));
                        f8812c = th;
                    }
                }
                f8812c = new C1145Wh();
            }
        }
        return f8812c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x0040
            r1 = r11
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r1 == 0) goto L_0x003b
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = r3
            r3 = r2
            r2 = 0
        L_0x0011:
            if (r2 >= r5) goto L_0x0034
            r7 = r4[r2]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.C0758Hk.b((java.lang.String) r8)
            if (r8 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            java.lang.Class<com.google.android.gms.internal.ads.Th> r8 = com.google.android.gms.internal.ads.C1067Th.class
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0031
            r6 = 1
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0034:
            java.lang.Throwable r1 = r1.getCause()
            r2 = r3
            r3 = r6
            goto L_0x0007
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            if (r3 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r10 = 0
        L_0x0041:
            if (r10 == 0) goto L_0x004a
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.a(r11, r0, r10)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1067Th.a(java.lang.Thread, java.lang.Throwable):void");
    }

    public final void a(Throwable th, String str) {
        a(th, str, 1.0f);
    }

    public final void a(Throwable th, String str, float f2) {
        if (C0758Hk.a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            C2790vda.a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f2);
            if (f2 > 0.0f) {
                i2 = (int) (1.0f / f2);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a(name, stringWriter2, str, i2).toString());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.f8816g.execute(new C1041Sh(new C1122Vk(), (String) obj));
                }
            }
        }
    }
}
