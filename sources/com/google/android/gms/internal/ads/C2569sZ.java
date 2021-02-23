package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1872ifa;
import com.google.android.gms.internal.ads.Yba;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.sZ  reason: case insensitive filesystem */
public abstract class C2569sZ<KeyProtoT extends C1872ifa> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyProtoT> f12097a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, C2711uZ<?, KeyProtoT>> f12098b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f12099c;

    @SafeVarargs
    protected C2569sZ(Class<KeyProtoT> cls, C2711uZ<?, KeyProtoT>... uZVarArr) {
        this.f12097a = cls;
        HashMap hashMap = new HashMap();
        int length = uZVarArr.length;
        int i = 0;
        while (i < length) {
            Iaa iaa = uZVarArr[i];
            if (hashMap.containsKey(iaa.a())) {
                String valueOf = String.valueOf(iaa.a().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            } else {
                hashMap.put(iaa.a(), iaa);
                i++;
            }
        }
        this.f12099c = uZVarArr.length > 0 ? uZVarArr[0].a() : Void.class;
        this.f12098b = Collections.unmodifiableMap(hashMap);
    }

    public abstract KeyProtoT a(Lda lda);

    public final <P> P a(KeyProtoT keyprotot, Class<P> cls) {
        C2711uZ uZVar = this.f12098b.get(cls);
        if (uZVar != null) {
            return uZVar.a(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract String a();

    public abstract void a(KeyProtoT keyprotot);

    public final Class<KeyProtoT> b() {
        return this.f12097a;
    }

    public abstract Yba.b c();

    public final Set<Class<?>> d() {
        return this.f12098b.keySet();
    }

    /* access modifiers changed from: package-private */
    public final Class<?> e() {
        return this.f12099c;
    }

    public C2498rZ<?, KeyProtoT> f() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
