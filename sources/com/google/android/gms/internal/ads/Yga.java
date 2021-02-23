package com.google.android.gms.internal.ads;

public final class Yga<T> implements Qga<T>, C1876iha<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f9434a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private volatile C1876iha<T> f9435b;

    /* renamed from: c  reason: collision with root package name */
    private volatile Object f9436c = f9434a;

    private Yga(C1876iha<T> iha) {
        this.f9435b = iha;
    }

    public static <P extends C1876iha<T>, T> C1876iha<T> a(P p) {
        C1452cha.a(p);
        return p instanceof Yga ? p : new Yga(p);
    }

    public static <P extends C1876iha<T>, T> Qga<T> b(P p) {
        if (p instanceof Qga) {
            return (Qga) p;
        }
        C1452cha.a(p);
        return new Yga((C1876iha) p);
    }

    public final T get() {
        T t = this.f9436c;
        if (t == f9434a) {
            synchronized (this) {
                t = this.f9436c;
                if (t == f9434a) {
                    t = this.f9435b.get();
                    T t2 = this.f9436c;
                    if (t2 != f9434a) {
                        if (t2 != t) {
                            String valueOf = String.valueOf(t2);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f9436c = t;
                    this.f9435b = null;
                }
            }
        }
        return t;
    }
}
