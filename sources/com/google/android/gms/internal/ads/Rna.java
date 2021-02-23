package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class Rna {

    /* renamed from: a  reason: collision with root package name */
    private static MessageDigest f8539a;

    /* renamed from: b  reason: collision with root package name */
    protected Object f8540b = new Object();

    /* access modifiers changed from: protected */
    public final MessageDigest a() {
        synchronized (this.f8540b) {
            if (f8539a != null) {
                MessageDigest messageDigest = f8539a;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f8539a = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f8539a;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] a(String str);
}
