package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import b.e.b;
import c.b.b.b.d.c.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class W extends Fragment implements C0528h {

    /* renamed from: a  reason: collision with root package name */
    private static WeakHashMap<Activity, WeakReference<W>> f5831a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, LifecycleCallback> f5832b = Collections.synchronizedMap(new b());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f5833c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Bundle f5834d;

    public static W a(Activity activity) {
        W w;
        WeakReference weakReference = f5831a.get(activity);
        if (weakReference != null && (w = (W) weakReference.get()) != null) {
            return w;
        }
        try {
            W w2 = (W) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (w2 == null || w2.isRemoving()) {
                w2 = new W();
                activity.getFragmentManager().beginTransaction().add(w2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f5831a.put(activity, new WeakReference(w2));
            return w2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    public final <T extends LifecycleCallback> T a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f5832b.get(str));
    }

    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f5832b.containsKey(str)) {
            this.f5832b.put(str, lifecycleCallback);
            if (this.f5833c > 0) {
                new h(Looper.getMainLooper()).post(new V(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a2 : this.f5832b.values()) {
            a2.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a2 : this.f5832b.values()) {
            a2.a(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5833c = 1;
        this.f5834d = bundle;
        for (Map.Entry next : this.f5832b.entrySet()) {
            ((LifecycleCallback) next.getValue()).a(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f5833c = 5;
        for (LifecycleCallback a2 : this.f5832b.values()) {
            a2.a();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f5833c = 3;
        for (LifecycleCallback b2 : this.f5832b.values()) {
            b2.b();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f5832b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).b(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f5833c = 2;
        for (LifecycleCallback c2 : this.f5832b.values()) {
            c2.c();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f5833c = 4;
        for (LifecycleCallback d2 : this.f5832b.values()) {
            d2.d();
        }
    }
}
