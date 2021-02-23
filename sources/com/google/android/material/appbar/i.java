package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class i<V extends View> extends CoordinatorLayout.b<V> {

    /* renamed from: a  reason: collision with root package name */
    private j f13892a;

    /* renamed from: b  reason: collision with root package name */
    private int f13893b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f13894c = 0;

    public i() {
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(int i) {
        j jVar = this.f13892a;
        if (jVar != null) {
            return jVar.b(i);
        }
        this.f13893b = i;
        return false;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, v, i);
        if (this.f13892a == null) {
            this.f13892a = new j(v);
        }
        this.f13892a.d();
        this.f13892a.a();
        int i2 = this.f13893b;
        if (i2 != 0) {
            this.f13892a.b(i2);
            this.f13893b = 0;
        }
        int i3 = this.f13894c;
        if (i3 == 0) {
            return true;
        }
        this.f13892a.a(i3);
        this.f13894c = 0;
        return true;
    }

    public int b() {
        j jVar = this.f13892a;
        if (jVar != null) {
            return jVar.c();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.c((View) v, i);
    }
}
