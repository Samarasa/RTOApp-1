package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C0563t;

public final class Nb {

    /* renamed from: a  reason: collision with root package name */
    private final String f13362a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13363b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13364c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13365d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Lb f13366e;

    public Nb(Lb lb, String str, boolean z) {
        this.f13366e = lb;
        C0563t.b(str);
        this.f13362a = str;
        this.f13363b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.f13366e.t().edit();
        edit.putBoolean(this.f13362a, z);
        edit.apply();
        this.f13365d = z;
    }

    public final boolean a() {
        if (!this.f13364c) {
            this.f13364c = true;
            this.f13365d = this.f13366e.t().getBoolean(this.f13362a, this.f13363b);
        }
        return this.f13365d;
    }
}
