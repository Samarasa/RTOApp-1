package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import b.c.a.a;
import b.c.a.h;
import b.c.a.k;
import b.c.a.l;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ha  reason: case insensitive filesystem */
public final class C1791ha implements C1947jha {

    /* renamed from: a  reason: collision with root package name */
    private l f10686a;

    /* renamed from: b  reason: collision with root package name */
    private h f10687b;

    /* renamed from: c  reason: collision with root package name */
    private k f10688c;

    /* renamed from: d  reason: collision with root package name */
    private C1720ga f10689d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(C1806hha.a(context));
                }
            }
        }
        return false;
    }

    public final void a() {
        this.f10687b = null;
        this.f10686a = null;
        C1720ga gaVar = this.f10689d;
        if (gaVar != null) {
            gaVar.b();
        }
    }

    public final void a(Activity activity) {
        k kVar = this.f10688c;
        if (kVar != null) {
            activity.unbindService(kVar);
            this.f10687b = null;
            this.f10686a = null;
            this.f10688c = null;
        }
    }

    public final void a(h hVar) {
        this.f10687b = hVar;
        this.f10687b.a(0);
        C1720ga gaVar = this.f10689d;
        if (gaVar != null) {
            gaVar.a();
        }
    }

    public final void a(C1720ga gaVar) {
        this.f10689d = gaVar;
    }

    public final l b() {
        h hVar = this.f10687b;
        if (hVar == null) {
            this.f10686a = null;
        } else if (this.f10686a == null) {
            this.f10686a = hVar.a((a) null);
        }
        return this.f10686a;
    }

    public final void b(Activity activity) {
        String a2;
        if (this.f10687b == null && (a2 = C1806hha.a(activity)) != null) {
            this.f10688c = new C2018kha(this);
            h.a(activity, a2, this.f10688c);
        }
    }
}
