package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bd  reason: case insensitive filesystem */
public final class C1372bd {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9925a;

    /* renamed from: b  reason: collision with root package name */
    private final Qba f9926b;

    /* renamed from: c  reason: collision with root package name */
    private final View f9927c;

    public C1372bd(Context context, Qba qba, View view) {
        this.f9925a = context;
        this.f9926b = qba;
        this.f9927c = view;
    }

    private static Intent a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        return intent2;
    }

    private static Intent a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    private final ResolveInfo a(Intent intent) {
        return a(intent, (ArrayList<ResolveInfo>) new ArrayList());
    }

    private final ResolveInfo a(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = this.f9925a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    ResolveInfo resolveInfo2 = queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            p.g().a(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent a(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f9925a
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.lang.String r1 = "u"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 == 0) goto L_0x001a
            return r3
        L_0x001a:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.content.Context r2 = r10.f9925a
            com.google.android.gms.internal.ads.Qba r4 = r10.f9926b
            android.view.View r5 = r10.f9927c
            android.net.Uri r1 = com.google.android.gms.internal.ads.C1192Yc.a(r2, r4, r1, r5, r3)
            android.net.Uri r1 = com.google.android.gms.internal.ads.C1192Yc.a((android.net.Uri) r1)
            java.lang.String r2 = "use_first_package"
            java.lang.Object r2 = r11.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            java.lang.String r4 = "use_running_process"
            java.lang.Object r4 = r11.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.String r5 = "use_custom_tabs"
            java.lang.Object r11 = r11.get(r5)
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = java.lang.Boolean.parseBoolean(r11)
            r5 = 0
            if (r11 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.p<java.lang.Boolean> r11 = com.google.android.gms.internal.ads.F.Uc
            com.google.android.gms.internal.ads.B r6 = com.google.android.gms.internal.ads.Qqa.e()
            java.lang.Object r11 = r6.a(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r11 = 0
            goto L_0x0069
        L_0x0068:
            r11 = 1
        L_0x0069:
            java.lang.String r6 = r1.getScheme()
            java.lang.String r7 = "http"
            boolean r6 = r7.equalsIgnoreCase(r6)
            java.lang.String r8 = "https"
            if (r6 == 0) goto L_0x0084
            android.net.Uri$Builder r3 = r1.buildUpon()
            android.net.Uri$Builder r3 = r3.scheme(r8)
        L_0x007f:
            android.net.Uri r3 = r3.build()
            goto L_0x0097
        L_0x0084:
            java.lang.String r6 = r1.getScheme()
            boolean r6 = r8.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0097
            android.net.Uri$Builder r3 = r1.buildUpon()
            android.net.Uri$Builder r3 = r3.scheme(r7)
            goto L_0x007f
        L_0x0097:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.content.Intent r1 = a((android.net.Uri) r1)
            android.content.Intent r3 = a((android.net.Uri) r3)
            if (r11 == 0) goto L_0x00b6
            com.google.android.gms.ads.internal.p.c()
            android.content.Context r11 = r10.f9925a
            com.google.android.gms.ads.internal.util.oa.b((android.content.Context) r11, (android.content.Intent) r1)
            com.google.android.gms.ads.internal.p.c()
            android.content.Context r11 = r10.f9925a
            com.google.android.gms.ads.internal.util.oa.b((android.content.Context) r11, (android.content.Intent) r3)
        L_0x00b6:
            android.content.pm.ResolveInfo r11 = r10.a((android.content.Intent) r1, (java.util.ArrayList<android.content.pm.ResolveInfo>) r6)
            if (r11 == 0) goto L_0x00c1
            android.content.Intent r11 = a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r11)
            return r11
        L_0x00c1:
            if (r3 == 0) goto L_0x00d4
            android.content.pm.ResolveInfo r11 = r10.a((android.content.Intent) r3)
            if (r11 == 0) goto L_0x00d4
            android.content.Intent r11 = a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r11)
            android.content.pm.ResolveInfo r3 = r10.a((android.content.Intent) r11)
            if (r3 == 0) goto L_0x00d4
            return r11
        L_0x00d4:
            int r11 = r6.size()
            if (r11 != 0) goto L_0x00db
            return r1
        L_0x00db:
            if (r4 == 0) goto L_0x0115
            if (r0 == 0) goto L_0x0115
            java.util.List r11 = r0.getRunningAppProcesses()
            if (r11 == 0) goto L_0x0115
            int r0 = r6.size()
            r3 = 0
        L_0x00ea:
            if (r3 >= r0) goto L_0x0115
            java.lang.Object r4 = r6.get(r3)
            int r3 = r3 + 1
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            java.util.Iterator r7 = r11.iterator()
        L_0x00f8:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00ea
            java.lang.Object r8 = r7.next()
            android.app.ActivityManager$RunningAppProcessInfo r8 = (android.app.ActivityManager.RunningAppProcessInfo) r8
            java.lang.String r8 = r8.processName
            android.content.pm.ActivityInfo r9 = r4.activityInfo
            java.lang.String r9 = r9.packageName
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00f8
            android.content.Intent r11 = a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r4)
            return r11
        L_0x0115:
            if (r2 == 0) goto L_0x0122
            java.lang.Object r11 = r6.get(r5)
            android.content.pm.ResolveInfo r11 = (android.content.pm.ResolveInfo) r11
            android.content.Intent r11 = a((android.content.Intent) r1, (android.content.pm.ResolveInfo) r11)
            return r11
        L_0x0122:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1372bd.a(java.util.Map):android.content.Intent");
    }
}
