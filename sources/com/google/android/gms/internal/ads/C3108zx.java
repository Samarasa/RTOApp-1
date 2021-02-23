package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.zx  reason: case insensitive filesystem */
public final class C3108zx<T> {

    /* renamed from: a  reason: collision with root package name */
    public T f13138a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f13139b;

    public C3108zx(T t, Executor executor) {
        this.f13138a = t;
        this.f13139b = executor;
    }

    public static <T> C3108zx<T> a(T t, Executor executor) {
        return new C3108zx<>(t, executor);
    }
}
