package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import c.b.b.b.b.c.c;
import c.b.b.b.b.j;
import com.google.android.gms.ads.internal.util.X;
import org.json.JSONException;
import org.json.JSONObject;

public final class B implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6235a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ConditionVariable f6236b = new ConditionVariable();

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f6237c = false;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f6238d = false;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public SharedPreferences f6239e = null;

    /* renamed from: f  reason: collision with root package name */
    private Bundle f6240f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    private Context f6241g;

    /* renamed from: h  reason: collision with root package name */
    private JSONObject f6242h = new JSONObject();

    private final void b() {
        if (this.f6239e != null) {
            try {
                this.f6242h = new JSONObject((String) X.a(new D(this)));
            } catch (JSONException unused) {
            }
        }
    }

    public final <T> T a(C2331p<T> pVar) {
        if (!this.f6236b.block(5000)) {
            synchronized (this.f6235a) {
                if (!this.f6238d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f6237c || this.f6239e == null) {
            synchronized (this.f6235a) {
                if (this.f6237c) {
                    if (this.f6239e == null) {
                    }
                }
                T c2 = pVar.c();
                return c2;
            }
        }
        if (pVar.b() != 2) {
            return (pVar.b() != 1 || !this.f6242h.has(pVar.a())) ? X.a(new A(this, pVar)) : pVar.a(this.f6242h);
        }
        Bundle bundle = this.f6240f;
        return bundle == null ? pVar.c() : pVar.a(bundle);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String a() {
        return this.f6239e.getString("flag_configuration", "{}");
    }

    public final void a(Context context) {
        if (!this.f6237c) {
            synchronized (this.f6235a) {
                if (!this.f6237c) {
                    if (!this.f6238d) {
                        this.f6238d = true;
                    }
                    this.f6241g = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    try {
                        this.f6240f = c.a(this.f6241g).a(this.f6241g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context b2 = j.b(context);
                        if (b2 == null && context != null && (b2 = context.getApplicationContext()) == null) {
                            b2 = context;
                        }
                        if (b2 != null) {
                            Qqa.c();
                            this.f6239e = b2.getSharedPreferences("google_ads_flags", 0);
                            if (this.f6239e != null) {
                                this.f6239e.registerOnSharedPreferenceChangeListener(this);
                            }
                            C1008Ra.a(new C(this));
                            b();
                            this.f6237c = true;
                            this.f6238d = false;
                            this.f6236b.open();
                        }
                    } finally {
                        this.f6238d = false;
                        this.f6236b.open();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(C2331p pVar) {
        return pVar.a(this.f6239e);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            b();
        }
    }
}
