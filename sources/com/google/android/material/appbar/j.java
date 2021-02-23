package com.google.android.material.appbar;

import android.view.View;
import b.h.j.y;

class j {

    /* renamed from: a  reason: collision with root package name */
    private final View f13895a;

    /* renamed from: b  reason: collision with root package name */
    private int f13896b;

    /* renamed from: c  reason: collision with root package name */
    private int f13897c;

    /* renamed from: d  reason: collision with root package name */
    private int f13898d;

    /* renamed from: e  reason: collision with root package name */
    private int f13899e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13900f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13901g = true;

    public j(View view) {
        this.f13895a = view;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        View view = this.f13895a;
        y.c(view, this.f13898d - (view.getTop() - this.f13896b));
        View view2 = this.f13895a;
        y.b(view2, this.f13899e - (view2.getLeft() - this.f13897c));
    }

    public boolean a(int i) {
        if (!this.f13901g || this.f13899e == i) {
            return false;
        }
        this.f13899e = i;
        a();
        return true;
    }

    public int b() {
        return this.f13896b;
    }

    public boolean b(int i) {
        if (!this.f13900f || this.f13898d == i) {
            return false;
        }
        this.f13898d = i;
        a();
        return true;
    }

    public int c() {
        return this.f13898d;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f13896b = this.f13895a.getTop();
        this.f13897c = this.f13895a.getLeft();
    }
}
