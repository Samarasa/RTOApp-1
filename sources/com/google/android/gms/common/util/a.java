package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import c.b.b.b.b.c.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {
    public static MessageDigest a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static byte[] a(Context context, String str) {
        MessageDigest a2;
        PackageInfo b2 = c.a(context).b(str, 64);
        Signature[] signatureArr = b2.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (a2 = a("SHA1")) == null) {
            return null;
        }
        return a2.digest(b2.signatures[0].toByteArray());
    }
}
