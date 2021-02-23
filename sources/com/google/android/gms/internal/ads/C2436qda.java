package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qda  reason: case insensitive filesystem */
public final class C2436qda {
    public static boolean a() {
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
