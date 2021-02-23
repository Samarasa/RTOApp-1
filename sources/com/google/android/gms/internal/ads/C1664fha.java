package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fha  reason: case insensitive filesystem */
public final class C1664fha<T> implements C1876iha<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f10431a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private volatile C1876iha<T> f10432b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Object f10433c = f10431a;

    private C1664fha(C1876iha<T> iha) {
        this.f10432b = iha;
    }

    public static <P extends C1876iha<T>, T> C1876iha<T> a(P p) {
        if ((p instanceof C1664fha) || (p instanceof Yga)) {
            return p;
        }
        C1452cha.a(p);
        return new C1664fha((C1876iha) p);
    }

    public final T get() {
        T t = this.f10433c;
        if (t != f10431a) {
            return t;
        }
        C1876iha<T> iha = this.f10432b;
        if (iha == null) {
            return this.f10433c;
        }
        T t2 = iha.get();
        this.f10433c = t2;
        this.f10432b = null;
        return t2;
    }
}
