package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* renamed from: com.google.android.gms.internal.ads.eo  reason: case insensitive filesystem */
public final class C1606eo extends MutableContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    private Activity f10311a;

    /* renamed from: b  reason: collision with root package name */
    private Context f10312b;

    /* renamed from: c  reason: collision with root package name */
    private Context f10313c;

    public C1606eo(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Activity a() {
        return this.f10311a;
    }

    public final Context b() {
        return this.f10313c;
    }

    public final Object getSystemService(String str) {
        return this.f10313c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        this.f10312b = context.getApplicationContext();
        this.f10311a = context instanceof Activity ? (Activity) context : null;
        this.f10313c = context;
        super.setBaseContext(this.f10312b);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f10311a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f10312b.startActivity(intent);
    }
}
