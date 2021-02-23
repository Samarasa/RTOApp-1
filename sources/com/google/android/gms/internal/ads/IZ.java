package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.DZ;
import java.security.GeneralSecurityException;
import java.util.Set;

final class IZ implements DZ.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ EZ f7299a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2569sZ f7300b;

    IZ(EZ ez, C2569sZ sZVar) {
        this.f7299a = ez;
        this.f7300b = sZVar;
    }

    public final <Q> C2073lZ<Q> a(Class<Q> cls) {
        try {
            return new BZ(this.f7299a, this.f7300b, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public final Class<?> a() {
        return this.f7299a.getClass();
    }

    public final C2073lZ<?> b() {
        EZ ez = this.f7299a;
        return new BZ(ez, this.f7300b, ez.e());
    }

    public final Class<?> c() {
        return this.f7300b.getClass();
    }

    public final Set<Class<?>> d() {
        return this.f7299a.d();
    }
}
