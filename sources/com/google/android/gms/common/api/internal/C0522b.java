package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.C0562s;

/* renamed from: com.google.android.gms.common.api.internal.b  reason: case insensitive filesystem */
public final class C0522b<O extends a.d> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5838a = false;

    /* renamed from: b  reason: collision with root package name */
    private final int f5839b;

    /* renamed from: c  reason: collision with root package name */
    private final a<O> f5840c;

    /* renamed from: d  reason: collision with root package name */
    private final O f5841d;

    private C0522b(a<O> aVar, O o) {
        this.f5840c = aVar;
        this.f5841d = o;
        this.f5839b = C0562s.a(this.f5840c, this.f5841d);
    }

    public static <O extends a.d> C0522b<O> a(a<O> aVar, O o) {
        return new C0522b<>(aVar, o);
    }

    public final String a() {
        return this.f5840c.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0522b)) {
            return false;
        }
        C0522b bVar = (C0522b) obj;
        return !this.f5838a && !bVar.f5838a && C0562s.a(this.f5840c, bVar.f5840c) && C0562s.a(this.f5841d, bVar.f5841d);
    }

    public final int hashCode() {
        return this.f5839b;
    }
}
