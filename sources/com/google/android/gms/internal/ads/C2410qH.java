package com.google.android.gms.internal.ads;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import androidx.core.app.n;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.util.m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qH  reason: case insensitive filesystem */
public final class C2410qH extends C2088lh {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11828a;

    /* renamed from: b  reason: collision with root package name */
    private final C1627fE f11829b;

    /* renamed from: c  reason: collision with root package name */
    private final C1122Vk f11830c;

    /* renamed from: d  reason: collision with root package name */
    private final C1701gH f11831d;

    public C2410qH(Context context, C1701gH gHVar, C1122Vk vk, C1627fE fEVar) {
        this.f11828a = context;
        this.f11829b = fEVar;
        this.f11830c = vk;
        this.f11831d = gHVar;
    }

    public static void a(Context context, C1627fE fEVar, C1701gH gHVar, String str, String str2) {
        a(context, fEVar, gHVar, str, str2, new HashMap());
    }

    public static void a(Context context, C1627fE fEVar, C1701gH gHVar, String str, String str2, Map<String, String> map) {
        C1556eE a2 = fEVar.a();
        a2.a("gqi", str);
        a2.a("action", str2);
        p.c();
        a2.a("device_connectivity", oa.p(context) ? "online" : "offline");
        a2.a("event_timestamp", String.valueOf(p.j().a()));
        for (Map.Entry next : map.entrySet()) {
            a2.a((String) next.getKey(), (String) next.getValue());
        }
        gHVar.a(new C2197nH(p.j().a(), str, a2.b(), C1489dH.f10122b));
    }

    private final void a(String str, String str2, Map<String, String> map) {
        a(this.f11828a, this.f11829b, this.f11831d, str, str2, map);
    }

    public final void Za() {
        this.f11831d.a(this.f11830c);
    }

    public final void a(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            p.c();
            boolean p = oa.p(this.f11828a);
            int i = C2339pH.f11686b;
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (p) {
                    i = C2339pH.f11685a;
                }
                Context context = this.f11828a;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setData(Uri.parse(stringExtra3));
                }
                launchIntentForPackage.addFlags(268435456);
                context.startActivity(launchIntentForPackage);
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            a(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f11831d.getWritableDatabase();
                if (i == C2339pH.f11685a) {
                    this.f11831d.a(writableDatabase, this.f11830c, stringExtra2);
                } else {
                    C1701gH.a(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("Failed to get writable offline buffering database: ");
                sb.append(valueOf);
                C1018Rk.b(sb.toString());
            }
        }
    }

    public final void c(a aVar, String str, String str2) {
        Context context = (Context) b.Q(aVar);
        int i = m.i() ? 1140850688 : 1073741824;
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        PendingIntent a2 = FW.a(context, 0, intent, i);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent a3 = FW.a(context, 0, intent2, i);
        Resources b2 = p.g().b();
        n.e eVar = new n.e(context, "offline_notification_channel");
        eVar.c((CharSequence) b2 == null ? "View the ad you saved when you were offline" : b2.getString(com.google.android.gms.ads.d.a.offline_notification_title));
        eVar.b((CharSequence) b2 == null ? "Tap to open ad" : b2.getString(com.google.android.gms.ads.d.a.offline_notification_text));
        eVar.a(true);
        eVar.b(a3);
        eVar.a(a2);
        eVar.e(context.getApplicationInfo().icon);
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, eVar.a());
        a(str2, "offline_notification_impression", new HashMap());
    }
}
