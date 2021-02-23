package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.DZ;
import java.security.GeneralSecurityException;
import java.util.Set;

final class FZ implements DZ.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2569sZ f6862a;

    FZ(C2569sZ sZVar) {
        this.f6862a = sZVar;
    }

    public final <Q> C2073lZ<Q> a(Class<Q> cls) {
        try {
            return new C2428qZ(this.f6862a, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public final Class<?> a() {
        return this.f6862a.getClass();
    }

    public final C2073lZ<?> b() {
        C2569sZ sZVar = this.f6862a;
        return new C2428qZ(sZVar, sZVar.e());
    }

    public final Class<?> c() {
        return null;
    }

    public final Set<Class<?>> d() {
        return this.f6862a.d();
    }
}
