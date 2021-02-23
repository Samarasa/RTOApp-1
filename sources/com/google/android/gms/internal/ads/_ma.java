package com.google.android.gms.internal.ads;

public final class _ma implements C2793vf {

    /* renamed from: a  reason: collision with root package name */
    private int f9721a;

    /* renamed from: b  reason: collision with root package name */
    private int f9722b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9723c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9724d;

    public _ma() {
        this(2500, 1, 1.0f);
    }

    private _ma(int i, int i2, float f2) {
        this.f9721a = 2500;
        this.f9723c = 1;
        this.f9724d = 1.0f;
    }

    public final void a(C1143Wf wf) {
        boolean z = true;
        this.f9722b++;
        int i = this.f9721a;
        this.f9721a = i + ((int) (((float) i) * this.f9724d));
        if (this.f9722b > this.f9723c) {
            z = false;
        }
        if (!z) {
            throw wf;
        }
    }

    public final int b() {
        return this.f9721a;
    }

    public final int l() {
        return this.f9722b;
    }
}
