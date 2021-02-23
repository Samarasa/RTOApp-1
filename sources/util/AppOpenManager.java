package util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.u;
import androidx.lifecycle.y;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.ads.e;

public class AppOpenManager implements Application.ActivityLifecycleCallbacks, j {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f15638a = false;

    /* renamed from: b  reason: collision with root package name */
    public a f15639b = null;

    /* renamed from: c  reason: collision with root package name */
    private Activity f15640c;

    /* renamed from: d  reason: collision with root package name */
    private a.C0069a f15641d;

    /* renamed from: e  reason: collision with root package name */
    public long f15642e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final MyApplication f15643f;

    /* renamed from: g  reason: collision with root package name */
    private e f15644g;

    public AppOpenManager(MyApplication myApplication) {
        this.f15643f = myApplication;
        myApplication.registerActivityLifecycleCallbacks(this);
        y.g().getLifecycle().a(this);
    }

    private e d() {
        return new e.a().a();
    }

    public void a() {
        if (!b()) {
            this.f15641d = new a(this);
            e d2 = d();
            this.f15644g = d2;
            a.a(this.f15643f, "ca-app-pub-9569880823887785/3856291865", d2, 1, this.f15641d);
        }
    }

    public boolean b() {
        return this.f15639b != null;
    }

    public void c() {
        if (f15638a || !b()) {
            Log.d("AppOpenManager", "Can not show ad.");
            a();
            return;
        }
        Log.d("AppOpenManager", "Will show ad.");
        this.f15639b.a(this.f15640c, new b(this));
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f15640c = activity;
    }

    public void onActivityDestroyed(Activity activity) {
        this.f15640c = null;
    }

    public void onActivityPaused(Activity activity) {
        this.f15640c = activity;
    }

    public void onActivityResumed(Activity activity) {
        this.f15640c = activity;
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f15640c = activity;
    }

    public void onActivityStarted(Activity activity) {
        this.f15640c = activity;
    }

    public void onActivityStopped(Activity activity) {
        this.f15640c = activity;
    }

    @u(g.a.ON_START)
    public void onStart() {
        c();
        Log.d("AppOpenManager", "onStart");
    }
}
