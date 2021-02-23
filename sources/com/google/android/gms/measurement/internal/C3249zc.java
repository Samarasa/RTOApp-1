package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.zc  reason: case insensitive filesystem */
abstract class C3249zc extends C3234wc {

    /* renamed from: b  reason: collision with root package name */
    private boolean f13841b;

    C3249zc(C3144fc fcVar) {
        super(fcVar);
        this.f13807a.a(this);
    }

    /* access modifiers changed from: protected */
    public void n() {
    }

    /* access modifiers changed from: protected */
    public final void o() {
        if (!s()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (this.f13841b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!r()) {
            this.f13807a.l();
            this.f13841b = true;
        }
    }

    public final void q() {
        if (!this.f13841b) {
            n();
            this.f13807a.l();
            this.f13841b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean r();

    /* access modifiers changed from: package-private */
    public final boolean s() {
        return this.f13841b;
    }
}
