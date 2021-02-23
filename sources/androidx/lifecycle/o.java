package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class o extends Service implements k {

    /* renamed from: a  reason: collision with root package name */
    private final A f1241a = new A(this);

    public g getLifecycle() {
        return this.f1241a.a();
    }

    public IBinder onBind(Intent intent) {
        this.f1241a.b();
        return null;
    }

    public void onCreate() {
        this.f1241a.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f1241a.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i) {
        this.f1241a.e();
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
