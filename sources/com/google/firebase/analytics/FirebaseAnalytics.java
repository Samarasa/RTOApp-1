package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import c.b.b.b.d.f.Tf;
import c.b.b.b.d.f.Vf;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.measurement.internal.C3144fc;
import com.google.android.gms.measurement.internal.C3145fd;
import com.google.android.gms.measurement.internal.He;
import com.google.firebase.iid.FirebaseInstanceId;

public final class FirebaseAnalytics {

    /* renamed from: a  reason: collision with root package name */
    private static volatile FirebaseAnalytics f14222a;

    /* renamed from: b  reason: collision with root package name */
    private final C3144fc f14223b;

    /* renamed from: c  reason: collision with root package name */
    private final Vf f14224c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f14225d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f14226e;

    private FirebaseAnalytics(Vf vf) {
        C0563t.a(vf);
        this.f14223b = null;
        this.f14224c = vf;
        this.f14225d = true;
        this.f14226e = new Object();
    }

    private FirebaseAnalytics(C3144fc fcVar) {
        C0563t.a(fcVar);
        this.f14223b = fcVar;
        this.f14224c = null;
        this.f14225d = false;
        this.f14226e = new Object();
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f14222a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f14222a == null) {
                    f14222a = Vf.b(context) ? new FirebaseAnalytics(Vf.a(context)) : new FirebaseAnalytics(C3144fc.a(context, (Tf) null));
                }
            }
        }
        return f14222a;
    }

    @Keep
    public static C3145fd getScionFrontendApiImplementation(Context context, Bundle bundle) {
        Vf a2;
        if (Vf.b(context) && (a2 = Vf.a(context, (String) null, (String) null, (String) null, bundle)) != null) {
            return new a(a2);
        }
        return null;
    }

    @Keep
    public final String getFirebaseInstanceId() {
        return FirebaseInstanceId.b().a();
    }

    @Keep
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (this.f14225d) {
            this.f14224c.a(activity, str, str2);
        } else if (!He.a()) {
            this.f14223b.h().w().a("setCurrentScreen must be called from the main thread");
        } else {
            this.f14223b.D().a(activity, str, str2);
        }
    }
}
