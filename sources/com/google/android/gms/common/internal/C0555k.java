package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.k  reason: case insensitive filesystem */
public final class C0555k {

    /* renamed from: a  reason: collision with root package name */
    private final String f5983a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5984b;

    public C0555k(String str) {
        this(str, (String) null);
    }

    public C0555k(String str, String str2) {
        C0563t.a(str, (Object) "log tag cannot be null");
        C0563t.a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f5983a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f5984b = null;
        } else {
            this.f5984b = str2;
        }
    }

    private final String a(String str) {
        String str2 = this.f5984b;
        return str2 == null ? str : str2.concat(str);
    }

    public final void a(String str, String str2) {
        if (a(3)) {
            Log.d(str, a(str2));
        }
    }

    public final void a(String str, String str2, Throwable th) {
        if (a(6)) {
            Log.e(str, a(str2), th);
        }
    }

    public final boolean a(int i) {
        return Log.isLoggable(this.f5983a, i);
    }

    public final void b(String str, String str2) {
        if (a(2)) {
            Log.v(str, a(str2));
        }
    }

    public final void c(String str, String str2) {
        if (a(5)) {
            Log.w(str, a(str2));
        }
    }
}
