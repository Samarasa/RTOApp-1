package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

public abstract class HU<E> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final LY<?> f7144a = DY.a(null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final PY f7145b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f7146c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final TU<E> f7147d;

    public HU(PY py, ScheduledExecutorService scheduledExecutorService, TU<E> tu) {
        this.f7145b = py;
        this.f7146c = scheduledExecutorService;
        this.f7147d = tu;
    }

    public final JU a(E e2, LY<?>... lyArr) {
        return new JU(this, e2, Arrays.asList(lyArr));
    }

    public final LU a(E e2) {
        return new LU(this, e2);
    }

    public final <I> NU<I> a(E e2, LY<I> ly) {
        return new NU(this, e2, (String) null, ly, Collections.singletonList(ly), ly, (FU) null);
    }

    /* access modifiers changed from: protected */
    public abstract String b(E e2);
}
