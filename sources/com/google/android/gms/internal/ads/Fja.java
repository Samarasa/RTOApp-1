package com.google.android.gms.internal.ads;

public class Fja {

    /* renamed from: a  reason: collision with root package name */
    private int f6890a;

    public void a() {
        this.f6890a = 0;
    }

    public final void a(int i) {
        this.f6890a = i;
    }

    public final void b(int i) {
        this.f6890a |= Integer.MIN_VALUE;
    }

    public final boolean b() {
        return c(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return c(4);
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i) {
        return (this.f6890a & i) == i;
    }

    public final boolean d() {
        return c(1);
    }
}
