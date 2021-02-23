package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1872ifa;
import com.google.android.gms.internal.ads.Yba;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.qZ  reason: case insensitive filesystem */
public class C2428qZ<PrimitiveT, KeyProtoT extends C1872ifa> implements C2073lZ<PrimitiveT> {

    /* renamed from: a  reason: collision with root package name */
    private final C2569sZ<KeyProtoT> f11857a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<PrimitiveT> f11858b;

    public C2428qZ(C2569sZ<KeyProtoT> sZVar, Class<PrimitiveT> cls) {
        if (sZVar.d().contains(cls) || Void.class.equals(cls)) {
            this.f11857a = sZVar;
            this.f11858b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{sZVar.toString(), cls.getName()}));
    }

    private final PrimitiveT b(KeyProtoT keyprotot) {
        if (!Void.class.equals(this.f11858b)) {
            this.f11857a.a(keyprotot);
            return this.f11857a.a(keyprotot, this.f11858b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    private final C2357pZ<?, KeyProtoT> c() {
        return new C2357pZ<>(this.f11857a.f());
    }

    public final Yba a(Lda lda) {
        try {
            C1872ifa a2 = c().a(lda);
            Yba.a r = Yba.r();
            r.a(this.f11857a.a());
            r.a(a2.g());
            r.a(this.f11857a.c());
            return (Yba) ((C2934xea) r.k());
        } catch (Iea e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public final Class<PrimitiveT> a() {
        return this.f11858b;
    }

    public final PrimitiveT a(C1872ifa ifa) {
        String valueOf = String.valueOf(this.f11857a.b().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (this.f11857a.b().isInstance(ifa)) {
            return b(ifa);
        }
        throw new GeneralSecurityException(concat);
    }

    public final C1872ifa b(Lda lda) {
        try {
            return c().a(lda);
        } catch (Iea e2) {
            String valueOf = String.valueOf(this.f11857a.f().a().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e2);
        }
    }

    public final String b() {
        return this.f11857a.a();
    }

    public final PrimitiveT c(Lda lda) {
        try {
            return b(this.f11857a.a(lda));
        } catch (Iea e2) {
            String valueOf = String.valueOf(this.f11857a.b().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e2);
        }
    }
}
