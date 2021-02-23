package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import c.b.b.b.b.c.c;
import com.google.android.gms.ads.internal.util.X;
import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.internal.ads.l  reason: case insensitive filesystem */
public final class C2047l {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11128a;

    public C2047l(Context context) {
        C0563t.a(context, (Object) "Context can not be null");
        this.f11128a = context;
    }

    private final boolean a(Intent intent) {
        C0563t.a(intent, (Object) "Intent can not be null");
        return !this.f11128a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return a(intent);
    }

    public final boolean b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return a(intent);
    }

    public final boolean c() {
        return ((Boolean) X.a(this.f11128a, new C2260o())).booleanValue() && c.a(this.f11128a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    public final boolean d() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }
}
