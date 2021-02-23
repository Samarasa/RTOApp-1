package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.LinkedList;

final class KT {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedList<TT<?>> f7554a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    private final int f7555b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7556c;

    /* renamed from: d  reason: collision with root package name */
    private final C1926jU f7557d;

    public KT(int i, int i2) {
        this.f7555b = i;
        this.f7556c = i2;
        this.f7557d = new C1926jU();
    }

    private final void h() {
        while (!this.f7554a.isEmpty()) {
            if (p.j().a() - this.f7554a.getFirst().f8782d >= ((long) this.f7556c)) {
                this.f7557d.g();
                this.f7554a.remove();
            } else {
                return;
            }
        }
    }

    public final long a() {
        return this.f7557d.a();
    }

    public final boolean a(TT<?> tt) {
        this.f7557d.e();
        h();
        if (this.f7554a.size() == this.f7555b) {
            return false;
        }
        this.f7554a.add(tt);
        return true;
    }

    public final int b() {
        h();
        return this.f7554a.size();
    }

    public final TT<?> c() {
        this.f7557d.e();
        h();
        if (this.f7554a.isEmpty()) {
            return null;
        }
        TT<?> remove = this.f7554a.remove();
        if (remove != null) {
            this.f7557d.f();
        }
        return remove;
    }

    public final long d() {
        return this.f7557d.b();
    }

    public final int e() {
        return this.f7557d.c();
    }

    public final String f() {
        return this.f7557d.d();
    }

    public final C2139mU g() {
        return this.f7557d.h();
    }
}
