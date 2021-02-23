package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2367pea;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.nea  reason: case insensitive filesystem */
final class C2225nea<T extends C2367pea<T>> {

    /* renamed from: a  reason: collision with root package name */
    private static final C2225nea f11483a = new C2225nea(true);

    /* renamed from: b  reason: collision with root package name */
    final Hfa<T, Object> f11484b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11485c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11486d;

    private C2225nea() {
        this.f11484b = Hfa.a(16);
    }

    private C2225nea(Hfa<T, Object> hfa) {
        this.f11484b = hfa;
        e();
    }

    private C2225nea(boolean z) {
        this(Hfa.a(0));
        e();
    }

    public static int a(C2367pea<?> pea, Object obj) {
        pea.h();
        throw null;
    }

    private static <T extends C2367pea<T>> boolean a(Map.Entry<T, Object> entry) {
        ((C2367pea) entry.getKey()).i();
        throw null;
    }

    private final void b(T t, Object obj) {
        t.k();
        throw null;
    }

    private final void b(Map.Entry<T, Object> entry) {
        C2367pea pea = (C2367pea) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof Jea) {
            Jea jea = (Jea) value;
            Jea.c();
            throw null;
        }
        pea.k();
        throw null;
    }

    private static int c(Map.Entry<T, Object> entry) {
        entry.getValue();
        ((C2367pea) entry.getKey()).i();
        throw null;
    }

    public static <T extends C2367pea<T>> C2225nea<T> f() {
        return f11483a;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> a() {
        return this.f11486d ? new Oea(this.f11484b.e().iterator()) : this.f11484b.e().iterator();
    }

    public final void a(C2225nea<T> nea) {
        if (nea.f11484b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = nea.f11484b.d().iterator();
            if (it.hasNext()) {
                b(it.next());
                throw null;
            }
            return;
        }
        b(nea.f11484b.b(0));
        throw null;
    }

    public final boolean b() {
        return this.f11485c;
    }

    public final boolean c() {
        if (this.f11484b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = this.f11484b.d().iterator();
            if (!it.hasNext()) {
                return true;
            }
            a(it.next());
            throw null;
        }
        a(this.f11484b.b(0));
        throw null;
    }

    public final /* synthetic */ Object clone() {
        C2225nea nea = new C2225nea();
        if (this.f11484b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = this.f11484b.d().iterator();
            if (!it.hasNext()) {
                nea.f11486d = this.f11486d;
                return nea;
            }
            Map.Entry next = it.next();
            nea.b((C2367pea) next.getKey(), next.getValue());
            throw null;
        }
        Map.Entry<T, Object> b2 = this.f11484b.b(0);
        nea.b((C2367pea) b2.getKey(), b2.getValue());
        throw null;
    }

    public final Iterator<Map.Entry<T, Object>> d() {
        return this.f11486d ? new Oea(this.f11484b.entrySet().iterator()) : this.f11484b.entrySet().iterator();
    }

    public final void e() {
        if (!this.f11485c) {
            this.f11484b.b();
            this.f11485c = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2225nea)) {
            return false;
        }
        return this.f11484b.equals(((C2225nea) obj).f11484b);
    }

    public final int g() {
        if (this.f11484b.c() <= 0) {
            Iterator<Map.Entry<T, Object>> it = this.f11484b.d().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            c(it.next());
            throw null;
        }
        c(this.f11484b.b(0));
        throw null;
    }

    public final int hashCode() {
        return this.f11484b.hashCode();
    }
}
