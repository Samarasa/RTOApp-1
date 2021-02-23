package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.p;

public final class V {

    /* renamed from: a  reason: collision with root package name */
    private long f5555a;

    /* renamed from: b  reason: collision with root package name */
    private long f5556b = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private final Object f5557c = new Object();

    public V(long j) {
        this.f5555a = j;
    }

    public final void a(long j) {
        synchronized (this.f5557c) {
            this.f5555a = j;
        }
    }

    public final boolean a() {
        synchronized (this.f5557c) {
            long b2 = p.j().b();
            if (this.f5556b + this.f5555a > b2) {
                return false;
            }
            this.f5556b = b2;
            return true;
        }
    }
}
