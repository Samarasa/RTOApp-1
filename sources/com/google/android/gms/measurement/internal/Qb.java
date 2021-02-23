package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C0563t;

public final class Qb {

    /* renamed from: a  reason: collision with root package name */
    private final String f13390a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13391b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13392c;

    /* renamed from: d  reason: collision with root package name */
    private long f13393d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Lb f13394e;

    public Qb(Lb lb, String str, long j) {
        this.f13394e = lb;
        C0563t.b(str);
        this.f13390a = str;
        this.f13391b = j;
    }

    public final long a() {
        if (!this.f13392c) {
            this.f13392c = true;
            this.f13393d = this.f13394e.t().getLong(this.f13390a, this.f13391b);
        }
        return this.f13393d;
    }

    public final void a(long j) {
        SharedPreferences.Editor edit = this.f13394e.t().edit();
        edit.putLong(this.f13390a, j);
        edit.apply();
        this.f13393d = j;
    }
}
