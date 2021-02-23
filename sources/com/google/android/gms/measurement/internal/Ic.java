package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import c.b.b.b.d.f.Tf;
import com.google.android.gms.common.internal.C0563t;

public final class Ic {

    /* renamed from: a  reason: collision with root package name */
    final Context f13295a;

    /* renamed from: b  reason: collision with root package name */
    String f13296b;

    /* renamed from: c  reason: collision with root package name */
    String f13297c;

    /* renamed from: d  reason: collision with root package name */
    String f13298d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f13299e;

    /* renamed from: f  reason: collision with root package name */
    long f13300f;

    /* renamed from: g  reason: collision with root package name */
    Tf f13301g;

    /* renamed from: h  reason: collision with root package name */
    boolean f13302h = true;

    public Ic(Context context, Tf tf) {
        C0563t.a(context);
        Context applicationContext = context.getApplicationContext();
        C0563t.a(applicationContext);
        this.f13295a = applicationContext;
        if (tf != null) {
            this.f13301g = tf;
            this.f13296b = tf.f4298f;
            this.f13297c = tf.f4297e;
            this.f13298d = tf.f4296d;
            this.f13302h = tf.f4295c;
            this.f13300f = tf.f4294b;
            Bundle bundle = tf.f4299g;
            if (bundle != null) {
                this.f13299e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
