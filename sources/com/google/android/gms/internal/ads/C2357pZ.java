package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1872ifa;

/* renamed from: com.google.android.gms.internal.ads.pZ  reason: case insensitive filesystem */
final class C2357pZ<KeyFormatProtoT extends C1872ifa, KeyProtoT extends C1872ifa> {

    /* renamed from: a  reason: collision with root package name */
    private final C2498rZ<KeyFormatProtoT, KeyProtoT> f11728a;

    C2357pZ(C2498rZ<KeyFormatProtoT, KeyProtoT> rZVar) {
        this.f11728a = rZVar;
    }

    /* access modifiers changed from: package-private */
    public final KeyProtoT a(Lda lda) {
        KeyFormatProtoT a2 = this.f11728a.a(lda);
        this.f11728a.a(a2);
        return (C1872ifa) this.f11728a.b(a2);
    }
}
