package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private Context f2009a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f2010b;

    public g(Context context) {
        this.f2009a = context;
    }

    private SharedPreferences b() {
        SharedPreferences sharedPreferences;
        synchronized (g.class) {
            if (this.f2010b == null) {
                this.f2010b = this.f2009a.getSharedPreferences("androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.f2010b;
        }
        return sharedPreferences;
    }

    public void a(boolean z) {
        b().edit().putBoolean("reschedule_needed", z).apply();
    }

    public boolean a() {
        return b().getBoolean("reschedule_needed", false);
    }
}
