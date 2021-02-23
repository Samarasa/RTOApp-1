package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.saa  reason: case insensitive filesystem */
final class C2571saa extends ThreadLocal<Cipher> {
    C2571saa() {
    }

    private static Cipher a() {
        try {
            return Zca.f9560c.a("AES/GCM-SIV/NoPadding");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return a();
    }
}
