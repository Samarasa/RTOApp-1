package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.cda  reason: case insensitive filesystem */
public final class C1444cda implements C1373bda<KeyFactory> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
