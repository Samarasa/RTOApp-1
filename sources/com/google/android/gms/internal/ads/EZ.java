package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1872ifa;

public abstract class EZ<KeyProtoT extends C1872ifa, PublicKeyProtoT extends C1872ifa> extends C2569sZ<KeyProtoT> {

    /* renamed from: d  reason: collision with root package name */
    private final Class<PublicKeyProtoT> f6709d;

    @SafeVarargs
    protected EZ(Class<KeyProtoT> cls, Class<PublicKeyProtoT> cls2, C2711uZ<?, KeyProtoT>... uZVarArr) {
        super(cls, uZVarArr);
        this.f6709d = cls2;
    }
}
