package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.hda  reason: case insensitive filesystem */
public final class C1798hda implements C1373bda<MessageDigest> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
