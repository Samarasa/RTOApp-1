package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.internal.ads.C2309ol;

public final class ca {

    /* renamed from: a  reason: collision with root package name */
    private final View f5572a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f5573b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5574c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5575d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5576e;

    /* renamed from: f  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f5577f;

    /* renamed from: g  reason: collision with root package name */
    private ViewTreeObserver.OnScrollChangedListener f5578g = null;

    public ca(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f5573b = activity;
        this.f5572a = view;
        this.f5577f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver b(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void e() {
        ViewTreeObserver b2;
        if (!this.f5574c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f5577f;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.f5573b;
                if (!(activity == null || (b2 = b(activity)) == null)) {
                    b2.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                p.z();
                C2309ol.a(this.f5572a, this.f5577f);
            }
            this.f5574c = true;
        }
    }

    private final void f() {
        ViewTreeObserver b2;
        Activity activity = this.f5573b;
        if (activity != null && this.f5574c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f5577f;
            if (!(onGlobalLayoutListener == null || (b2 = b(activity)) == null)) {
                p.e();
                b2.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f5574c = false;
        }
    }

    public final void a() {
        this.f5575d = true;
        if (this.f5576e) {
            e();
        }
    }

    public final void a(Activity activity) {
        this.f5573b = activity;
    }

    public final void b() {
        this.f5575d = false;
        f();
    }

    public final void c() {
        this.f5576e = true;
        if (this.f5575d) {
            e();
        }
    }

    public final void d() {
        this.f5576e = false;
        f();
    }
}
