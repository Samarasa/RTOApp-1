package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.mda  reason: case insensitive filesystem */
final class C2152mda extends ThreadLocal<Mac> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2223nda f11336a;

    C2152mda(C2223nda nda) {
        this.f11336a = nda;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Mac initialValue() {
        try {
            Mac a2 = Zca.f9561d.a(this.f11336a.f11478b);
            a2.init(this.f11336a.f11479c);
            return a2;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
