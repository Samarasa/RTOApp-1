package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.eb  reason: case insensitive filesystem */
abstract class C3137eb extends Fb {

    /* renamed from: b  reason: collision with root package name */
    private boolean f13548b;

    C3137eb(C3144fc fcVar) {
        super(fcVar);
        this.f13807a.a(this);
    }

    /* access modifiers changed from: protected */
    public abstract boolean A();

    /* access modifiers changed from: protected */
    public void v() {
    }

    /* access modifiers changed from: package-private */
    public final boolean w() {
        return this.f13548b;
    }

    /* access modifiers changed from: protected */
    public final void x() {
        if (!w()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void y() {
        if (this.f13548b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!A()) {
            this.f13807a.l();
            this.f13548b = true;
        }
    }

    public final void z() {
        if (!this.f13548b) {
            v();
            this.f13807a.l();
            this.f13548b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
