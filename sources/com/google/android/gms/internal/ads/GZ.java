package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.DZ;
import java.util.Collections;
import java.util.Set;

final class GZ implements DZ.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2073lZ f7040a;

    GZ(C2073lZ lZVar) {
        this.f7040a = lZVar;
    }

    public final <Q> C2073lZ<Q> a(Class<Q> cls) {
        if (this.f7040a.a().equals(cls)) {
            return this.f7040a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    public final Class<?> a() {
        return this.f7040a.getClass();
    }

    public final C2073lZ<?> b() {
        return this.f7040a;
    }

    public final Class<?> c() {
        return null;
    }

    public final Set<Class<?>> d() {
        return Collections.singleton(this.f7040a.a());
    }
}
