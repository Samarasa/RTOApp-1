package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import c.b.b.b.b.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.U;
import com.google.android.gms.common.internal.x;

@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.f  reason: case insensitive filesystem */
public final class C0526f {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f5871a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static C0526f f5872b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5873c;

    /* renamed from: d  reason: collision with root package name */
    private final Status f5874d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5875e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5876f;

    C0526f(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(l.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            z = resources.getInteger(identifier) == 0 ? false : z;
            this.f5876f = !z;
        } else {
            this.f5876f = false;
        }
        this.f5875e = z;
        String a2 = U.a(context);
        a2 = a2 == null ? new x(context).a("google_app_id") : a2;
        if (TextUtils.isEmpty(a2)) {
            this.f5874d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f5873c = null;
            return;
        }
        this.f5873c = a2;
        this.f5874d = Status.f5755a;
    }

    public static Status a(Context context) {
        Status status;
        C0563t.a(context, (Object) "Context must not be null.");
        synchronized (f5871a) {
            if (f5872b == null) {
                f5872b = new C0526f(context);
            }
            status = f5872b.f5874d;
        }
        return status;
    }

    private static C0526f a(String str) {
        C0526f fVar;
        synchronized (f5871a) {
            if (f5872b != null) {
                fVar = f5872b;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return fVar;
    }

    public static String a() {
        return a("getGoogleAppId").f5873c;
    }

    public static boolean b() {
        return a("isMeasurementExplicitlyDisabled").f5876f;
    }
}
