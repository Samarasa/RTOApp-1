package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.google.android.gms.internal.ads.iT  reason: case insensitive filesystem */
public final class C1855iT<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Deque<LY<T>> f10811a = new LinkedBlockingDeque();

    /* renamed from: b  reason: collision with root package name */
    private final Callable<T> f10812b;

    /* renamed from: c  reason: collision with root package name */
    private final PY f10813c;

    public C1855iT(Callable<T> callable, PY py) {
        this.f10812b = callable;
        this.f10813c = py;
    }

    public final synchronized LY<T> a() {
        a(1);
        return this.f10811a.poll();
    }

    public final synchronized void a(int i) {
        int size = i - this.f10811a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f10811a.add(this.f10813c.a(this.f10812b));
        }
    }

    public final synchronized void a(LY<T> ly) {
        this.f10811a.addFirst(ly);
    }
}
