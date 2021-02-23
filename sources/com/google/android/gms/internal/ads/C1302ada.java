package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.ada  reason: case insensitive filesystem */
public final class C1302ada implements C1373bda<Cipher> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
