package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import c.b.b.b.b.c.c;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.m;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.zi  reason: case insensitive filesystem */
public final class C3083zi {
    private int A;
    private String B;
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    private int f13093a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13094b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13095c;

    /* renamed from: d  reason: collision with root package name */
    private int f13096d;

    /* renamed from: e  reason: collision with root package name */
    private int f13097e;

    /* renamed from: f  reason: collision with root package name */
    private int f13098f;

    /* renamed from: g  reason: collision with root package name */
    private String f13099g;

    /* renamed from: h  reason: collision with root package name */
    private int f13100h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private double m;
    private boolean n;
    private String o;
    private String p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private final boolean u;
    private boolean v;
    private String w;
    private String x;
    private float y;
    private int z;

    public C3083zi(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        a(context);
        b(context);
        c(context);
        Locale locale = Locale.getDefault();
        boolean z2 = true;
        this.q = a(packageManager, "geo:0,0?q=donuts") != null;
        this.r = a(packageManager, "http://www.google.com") == null ? false : z2;
        this.s = locale.getCountry();
        Qqa.a();
        this.t = C0758Hk.a();
        this.u = i.a(context);
        this.v = i.b(context);
        this.w = locale.getLanguage();
        this.x = a(context, packageManager);
        this.B = d(context);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.y = displayMetrics.density;
            this.z = displayMetrics.widthPixels;
            this.A = displayMetrics.heightPixels;
        }
    }

    public C3083zi(Context context, C2870wi wiVar) {
        a(context);
        b(context);
        c(context);
        this.o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        this.C = m.b() && C1791ha.a(context);
        this.q = wiVar.f12659b;
        this.r = wiVar.f12660c;
        this.s = wiVar.f12662e;
        this.t = wiVar.f12663f;
        this.u = wiVar.f12664g;
        this.v = wiVar.f12665h;
        this.w = wiVar.k;
        this.x = wiVar.l;
        this.B = wiVar.m;
        this.y = wiVar.t;
        this.z = wiVar.u;
        this.A = wiVar.v;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            p.g().a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private static String a(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a2 = a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a2 == null || (activityInfo = a2.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo b2 = c.a(context).b(activityInfo.packageName, 0);
            if (b2 != null) {
                int i2 = b2.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private final void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f13093a = audioManager.getMode();
                this.f13094b = audioManager.isMusicActive();
                this.f13095c = audioManager.isSpeakerphoneOn();
                this.f13096d = audioManager.getStreamVolume(3);
                this.f13097e = audioManager.getRingerMode();
                this.f13098f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                p.g().a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f13093a = -2;
        this.f13094b = false;
        this.f13095c = false;
        this.f13096d = 0;
        this.f13097e = 2;
        this.f13098f = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0050  */
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f13099g = r2
            boolean r2 = com.google.android.gms.common.util.m.n()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.F.Kf
            com.google.android.gms.internal.ads.B r4 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0031
            r2 = 0
            goto L_0x0035
        L_0x0031:
            int r2 = r0.getNetworkType()
        L_0x0035:
            r5.i = r2
            int r0 = r0.getPhoneType()
            r5.j = r0
            r0 = -2
            r5.f13100h = r0
            r5.k = r3
            r0 = -1
            r5.l = r0
            com.google.android.gms.ads.internal.p.c()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.ads.internal.util.oa.a((android.content.Context) r6, (java.lang.String) r2)
            if (r6 == 0) goto L_0x006f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L_0x0067
            int r0 = r6.getType()
            r5.f13100h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.l = r6
            goto L_0x0069
        L_0x0067:
            r5.f13100h = r0
        L_0x0069:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.k = r6
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3083zi.b(android.content.Context):void");
    }

    private final void c(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z2 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z2 = true;
            }
            this.n = z2;
            return;
        }
        this.m = -1.0d;
        this.n = false;
    }

    private static String d(Context context) {
        try {
            PackageInfo b2 = c.a(context).b("com.android.vending", 128);
            if (b2 != null) {
                int i2 = b2.versionCode;
                String str = b2.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final C2870wi a() {
        return new C2870wi(this.f13093a, this.q, this.r, this.f13099g, this.s, this.t, this.u, this.v, this.f13094b, this.f13095c, this.w, this.x, this.B, this.f13096d, this.f13100h, this.i, this.j, this.f13097e, this.f13098f, this.y, this.z, this.A, this.m, this.n, this.k, this.l, this.o, this.C, this.p);
    }
}
