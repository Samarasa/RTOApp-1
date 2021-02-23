package c.b.d.d;

import android.content.Context;
import android.content.SharedPreferences;

class d {

    /* renamed from: a  reason: collision with root package name */
    private static d f4933a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f4934b;

    private d(Context context) {
        this.f4934b = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
    }

    static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (f4933a == null) {
                f4933a = new d(context);
            }
            dVar = f4933a;
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean a(long j) {
        return a("fire-global", j);
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean a(String str, long j) {
        if (!this.f4934b.contains(str)) {
            this.f4934b.edit().putLong(str, j).apply();
            return true;
        } else if (j - this.f4934b.getLong(str, -1) < 86400000) {
            return false;
        } else {
            this.f4934b.edit().putLong(str, j).apply();
            return true;
        }
    }
}
