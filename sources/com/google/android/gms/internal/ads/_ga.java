package com.google.android.gms.internal.ads;

public final class _ga<T> implements Qga<T>, Xga<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final _ga<Object> f9680a = new _ga<>((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final T f9681b;

    private _ga(T t) {
        this.f9681b = t;
    }

    public static <T> Xga<T> a(T t) {
        C1452cha.a(t, "instance cannot be null");
        return new _ga(t);
    }

    public static <T> Xga<T> b(T t) {
        return t == null ? f9680a : new _ga(t);
    }

    public final T get() {
        return this.f9681b;
    }
}
