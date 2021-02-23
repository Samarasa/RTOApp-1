package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1872ifa;

/* renamed from: com.google.android.gms.internal.ads.rZ  reason: case insensitive filesystem */
public abstract class C2498rZ<KeyFormatProtoT extends C1872ifa, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<KeyFormatProtoT> f11985a;

    public C2498rZ(Class<KeyFormatProtoT> cls) {
        this.f11985a = cls;
    }

    public abstract KeyFormatProtoT a(Lda lda);

    public final Class<KeyFormatProtoT> a() {
        return this.f11985a;
    }

    public abstract void a(KeyFormatProtoT keyformatprotot);

    public abstract KeyT b(KeyFormatProtoT keyformatprotot);
}
