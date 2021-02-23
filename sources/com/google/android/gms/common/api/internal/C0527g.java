package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.C0159i;
import com.google.android.gms.common.internal.C0563t;

/* renamed from: com.google.android.gms.common.api.internal.g  reason: case insensitive filesystem */
public class C0527g {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5877a;

    public C0527g(Activity activity) {
        C0563t.a(activity, (Object) "Activity must not be null");
        this.f5877a = activity;
    }

    public Activity a() {
        return (Activity) this.f5877a;
    }

    public C0159i b() {
        return (C0159i) this.f5877a;
    }

    public boolean c() {
        return this.f5877a instanceof C0159i;
    }

    public final boolean d() {
        return this.f5877a instanceof Activity;
    }
}
