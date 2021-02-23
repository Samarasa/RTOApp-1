package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.eda  reason: case insensitive filesystem */
public final class C1585eda implements C1373bda<Mac> {
    public final /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
