package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.l;
import java.util.Date;

public class n {

    /* renamed from: a  reason: collision with root package name */
    static final Date f14766a = new Date(-1);

    /* renamed from: b  reason: collision with root package name */
    static final Date f14767b = new Date(-1);

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences f14768c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f14769d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final Object f14770e = new Object();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f14771a;

        /* renamed from: b  reason: collision with root package name */
        private Date f14772b;

        a(int i, Date date) {
            this.f14771a = i;
            this.f14772b = date;
        }

        /* access modifiers changed from: package-private */
        public Date a() {
            return this.f14772b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f14771a;
        }
    }

    public n(SharedPreferences sharedPreferences) {
        this.f14768c = sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public a a() {
        a aVar;
        synchronized (this.f14770e) {
            aVar = new a(this.f14768c.getInt("num_failed_fetches", 0), new Date(this.f14768c.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public void a(int i, Date date) {
        synchronized (this.f14770e) {
            this.f14768c.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void a(l lVar) {
        synchronized (this.f14769d) {
            this.f14768c.edit().putBoolean("is_developer_mode_enabled", lVar.c()).putLong("fetch_timeout_in_seconds", lVar.a()).putLong("minimum_fetch_interval_in_seconds", lVar.b()).commit();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        synchronized (this.f14769d) {
            this.f14768c.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Date date) {
        synchronized (this.f14769d) {
            this.f14768c.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public long b() {
        return this.f14768c.getLong("fetch_timeout_in_seconds", 60);
    }

    /* access modifiers changed from: package-private */
    public String c() {
        return this.f14768c.getString("last_fetch_etag", (String) null);
    }

    /* access modifiers changed from: package-private */
    public Date d() {
        return new Date(this.f14768c.getLong("last_fetch_time_in_millis", -1));
    }

    public boolean e() {
        return this.f14768c.getBoolean("is_developer_mode_enabled", false);
    }

    /* access modifiers changed from: package-private */
    public void f() {
        a(0, f14767b);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        synchronized (this.f14769d) {
            this.f14768c.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void h() {
        synchronized (this.f14769d) {
            this.f14768c.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
