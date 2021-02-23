package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

final class Eca extends ThreadLocal<Cipher> {
    Eca() {
    }

    private static Cipher a() {
        try {
            return Zca.f9560c.a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return a();
    }
}
