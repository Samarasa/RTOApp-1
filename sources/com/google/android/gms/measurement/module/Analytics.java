package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import c.b.b.b.d.f.Tf;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.measurement.internal.C3144fc;

public class Analytics {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Analytics f13846a;

    /* renamed from: b  reason: collision with root package name */
    private final C3144fc f13847b;

    private Analytics(C3144fc fcVar) {
        C0563t.a(fcVar);
        this.f13847b = fcVar;
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (f13846a == null) {
            synchronized (Analytics.class) {
                if (f13846a == null) {
                    f13846a = new Analytics(C3144fc.a(context, (Tf) null));
                }
            }
        }
        return f13846a;
    }
}
