package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2005a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f2006b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2007c;

    public e(Context context) {
        this.f2005a = context;
    }

    private int a(String str) {
        int i = 0;
        int i2 = this.f2006b.getInt(str, 0);
        if (i2 != Integer.MAX_VALUE) {
            i = i2 + 1;
        }
        a(str, i);
        return i2;
    }

    private void a(String str, int i) {
        this.f2006b.edit().putInt(str, i).apply();
    }

    private void b() {
        if (!this.f2007c) {
            this.f2006b = this.f2005a.getSharedPreferences("androidx.work.util.id", 0);
            this.f2007c = true;
        }
    }

    public int a() {
        int a2;
        synchronized (e.class) {
            b();
            a2 = a("next_alarm_manager_id");
        }
        return a2;
    }

    public int a(int i, int i2) {
        synchronized (e.class) {
            b();
            int a2 = a("next_job_scheduler_id");
            if (a2 >= i) {
                if (a2 <= i2) {
                    i = a2;
                }
            }
            a("next_job_scheduler_id", i + 1);
        }
        return i;
    }
}
