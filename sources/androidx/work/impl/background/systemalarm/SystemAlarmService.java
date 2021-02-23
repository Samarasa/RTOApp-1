package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.o;
import androidx.work.h;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.utils.k;

public class SystemAlarmService extends o implements g.b {

    /* renamed from: b  reason: collision with root package name */
    private static final String f1790b = h.a("SystemAlarmService");

    /* renamed from: c  reason: collision with root package name */
    private g f1791c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1792d;

    private void b() {
        this.f1791c = new g(this);
        this.f1791c.a((g.b) this);
    }

    public void a() {
        this.f1792d = true;
        h.a().a(f1790b, "All commands completed in dispatcher", new Throwable[0]);
        k.a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        b();
        this.f1792d = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1792d = true;
        this.f1791c.f();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1792d) {
            h.a().c(f1790b, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1791c.f();
            b();
            this.f1792d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1791c.a(intent, i2);
        return 3;
    }
}
