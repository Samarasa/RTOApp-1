package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.m;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.c  reason: case insensitive filesystem */
public final class C0523c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    private static final C0523c f5842a = new C0523c();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f5843b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f5844c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f5845d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f5846e = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface a {
        void a(boolean z);
    }

    private C0523c() {
    }

    public static C0523c a() {
        return f5842a;
    }

    public static void a(Application application) {
        synchronized (f5842a) {
            if (!f5842a.f5846e) {
                application.registerActivityLifecycleCallbacks(f5842a);
                application.registerComponentCallbacks(f5842a);
                f5842a.f5846e = true;
            }
        }
    }

    private final void b(boolean z) {
        synchronized (f5842a) {
            ArrayList<a> arrayList = this.f5845d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                a aVar = arrayList.get(i);
                i++;
                aVar.a(z);
            }
        }
    }

    public final void a(a aVar) {
        synchronized (f5842a) {
            this.f5845d.add(aVar);
        }
    }

    @TargetApi(16)
    public final boolean a(boolean z) {
        if (!this.f5844c.get()) {
            if (!m.c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f5844c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f5843b.set(true);
            }
        }
        return b();
    }

    public final boolean b() {
        return this.f5843b.get();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f5843b.compareAndSet(true, false);
        this.f5844c.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f5843b.compareAndSet(true, false);
        this.f5844c.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f5843b.compareAndSet(false, true)) {
            this.f5844c.set(true);
            b(true);
        }
    }
}
