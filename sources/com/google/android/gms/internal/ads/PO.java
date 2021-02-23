package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import c.b.b.b.b.c.c;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.util.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class PO implements JO<QO> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f8210a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8211b;

    public PO(PY py, Context context) {
        this.f8210a = py;
        this.f8211b = context;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    private static String a(Context context) {
        try {
            PackageInfo b2 = c.a(context).b("com.android.vending", 128);
            if (b2 != null) {
                int i = b2.versionCode;
                String str = b2.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
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
                int i = b2.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public final LY<QO> a() {
        return this.f8210a.a(new SO(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ QO b() {
        boolean z;
        PackageManager packageManager = this.f8211b.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z2 = a(packageManager, "geo:0,0?q=donuts") != null;
        boolean z3 = a(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        boolean startsWith = Build.DEVICE.startsWith("generic");
        boolean a2 = i.a(this.f8211b);
        boolean b2 = i.b(this.f8211b);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i = 0; i < localeList.size(); i++) {
                arrayList.add(localeList.get(i).getLanguage());
            }
        }
        String a3 = a(this.f8211b, packageManager);
        String a4 = a(this.f8211b);
        String str = Build.FINGERPRINT;
        Context context = this.f8211b;
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= queryIntentActivities.size()) {
                        break;
                    } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                        z = resolveActivity.activityInfo.packageName.equals(C1806hha.a(context));
                        break;
                    } else {
                        i2++;
                    }
                }
                return new QO(z2, z3, country, startsWith, a2, b2, language, arrayList, a3, a4, str, z, Build.MODEL, p.e().e());
            }
        }
        z = false;
        return new QO(z2, z3, country, startsWith, a2, b2, language, arrayList, a3, a4, str, z, Build.MODEL, p.e().e());
    }
}
