package com.google.android.gms.ads.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import c.b.b.b.b.j;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f5372a;

    public c(Context context) {
        try {
            Context b2 = j.b(context);
            this.f5372a = b2 == null ? null : b2.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f5372a = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final float a(String str, float f2) {
        try {
            if (this.f5372a == null) {
                return 0.0f;
            }
            return this.f5372a.getFloat(str, 0.0f);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2) {
        try {
            return this.f5372a == null ? str2 : this.f5372a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    public final boolean a(String str, boolean z) {
        try {
            if (this.f5372a == null) {
                return false;
            }
            return this.f5372a.getBoolean(str, false);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
