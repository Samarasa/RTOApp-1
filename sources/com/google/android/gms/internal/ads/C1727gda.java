package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* renamed from: com.google.android.gms.internal.ads.gda  reason: case insensitive filesystem */
public final class C1727gda implements C1373bda<Signature> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
