package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.j.y;
import b.j.b.g;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a  reason: collision with root package name */
    g f13907a;

    /* renamed from: b  reason: collision with root package name */
    a f13908b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f13909c;

    /* renamed from: d  reason: collision with root package name */
    private float f13910d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13911e;

    /* renamed from: f  reason: collision with root package name */
    int f13912f = 2;

    /* renamed from: g  reason: collision with root package name */
    float f13913g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    float f13914h = 0.0f;
    float i = 0.5f;
    private final g.a j = new b(this);

    public interface a {
        void a(int i);

        void a(View view);
    }

    private class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f13915a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f13916b;

        b(View view, boolean z) {
            this.f13915a = view;
            this.f13916b = z;
        }

        public void run() {
            a aVar;
            g gVar = SwipeDismissBehavior.this.f13907a;
            if (gVar != null && gVar.a(true)) {
                y.a(this.f13915a, (Runnable) this);
            } else if (this.f13916b && (aVar = SwipeDismissBehavior.this.f13908b) != null) {
                aVar.a(this.f13915a);
            }
        }
    }

    static float a(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int a(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    private void a(ViewGroup viewGroup) {
        if (this.f13907a == null) {
            this.f13907a = this.f13911e ? g.a(viewGroup, this.f13910d, this.j) : g.a(viewGroup, this.j);
        }
    }

    static float b(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    public void a(float f2) {
        this.i = a(0.0f, f2, 1.0f);
    }

    public void a(int i2) {
        this.f13912f = i2;
    }

    public void a(a aVar) {
        this.f13908b = aVar;
    }

    public boolean a(View view) {
        return true;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f13909c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13909c = coordinatorLayout.a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.f13909c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f13909c = false;
        }
        if (!z) {
            return false;
        }
        a((ViewGroup) coordinatorLayout);
        return this.f13907a.b(motionEvent);
    }

    public void b(float f2) {
        this.f13914h = a(0.0f, f2, 1.0f);
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        g gVar = this.f13907a;
        if (gVar == null) {
            return false;
        }
        gVar.a(motionEvent);
        return true;
    }
}
