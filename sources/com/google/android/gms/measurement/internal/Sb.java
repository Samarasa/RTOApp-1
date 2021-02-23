package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C0563t;

public final class Sb {

    /* renamed from: a  reason: collision with root package name */
    private final String f13407a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13408b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13409c;

    /* renamed from: d  reason: collision with root package name */
    private String f13410d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Lb f13411e;

    public Sb(Lb lb, String str, String str2) {
        this.f13411e = lb;
        C0563t.b(str);
        this.f13407a = str;
    }

    public final String a() {
        if (!this.f13409c) {
            this.f13409c = true;
            this.f13410d = this.f13411e.t().getString(this.f13407a, (String) null);
        }
        return this.f13410d;
    }

    public final void a(String str) {
        if (this.f13411e.m().a(C3202q.Ra) || !se.c(str, this.f13410d)) {
            SharedPreferences.Editor edit = this.f13411e.t().edit();
            edit.putString(this.f13407a, str);
            edit.apply();
            this.f13410d = str;
        }
    }
}
