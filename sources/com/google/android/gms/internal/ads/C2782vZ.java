package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.ads.vZ  reason: case insensitive filesystem */
public final class C2782vZ {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList<C2853wZ> f12506a = new CopyOnWriteArrayList<>();

    public static C2853wZ a(String str) {
        Iterator<C2853wZ> it = f12506a.iterator();
        while (it.hasNext()) {
            C2853wZ next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
