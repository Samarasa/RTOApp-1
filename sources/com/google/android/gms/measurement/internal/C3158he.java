package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.he  reason: case insensitive filesystem */
abstract class C3158he extends C3164ie {

    /* renamed from: c  reason: collision with root package name */
    private boolean f13598c;

    C3158he(C3176ke keVar) {
        super(keVar);
        this.f13609b.a(this);
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return this.f13598c;
    }

    /* access modifiers changed from: protected */
    public final void r() {
        if (!q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void s() {
        if (!this.f13598c) {
            t();
            this.f13609b.s();
            this.f13598c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean t();
}
