package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import android.util.Log;
import c.b.d.e;
import com.google.android.gms.common.util.m;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.List;

/* renamed from: com.google.firebase.iid.k  reason: case insensitive filesystem */
public final class C3324k {

    /* renamed from: a  reason: collision with root package name */
    private final Context f14579a;

    /* renamed from: b  reason: collision with root package name */
    private String f14580b;

    /* renamed from: c  reason: collision with root package name */
    private String f14581c;

    /* renamed from: d  reason: collision with root package name */
    private int f14582d;

    /* renamed from: e  reason: collision with root package name */
    private int f14583e = 0;

    public C3324k(Context context) {
        this.f14579a = context;
    }

    private final PackageInfo a(String str) {
        try {
            return this.f14579a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String a(e eVar) {
        String c2 = eVar.e().c();
        if (c2 != null) {
            return c2;
        }
        String b2 = eVar.e().b();
        if (!b2.startsWith("1:")) {
            return b2;
        }
        String[] split = b2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("FirebaseInstanceId", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private final synchronized void e() {
        PackageInfo a2 = a(this.f14579a.getPackageName());
        if (a2 != null) {
            this.f14580b = Integer.toString(a2.versionCode);
            this.f14581c = a2.versionName;
        }
    }

    public final synchronized int a() {
        if (this.f14583e != 0) {
            return this.f14583e;
        }
        PackageManager packageManager = this.f14579a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!m.k()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f14583e = 1;
                return this.f14583e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (m.k()) {
                this.f14583e = 2;
            } else {
                this.f14583e = 1;
            }
            return this.f14583e;
        }
        this.f14583e = 2;
        return this.f14583e;
    }

    public final synchronized String b() {
        if (this.f14580b == null) {
            e();
        }
        return this.f14580b;
    }

    public final synchronized String c() {
        if (this.f14581c == null) {
            e();
        }
        return this.f14581c;
    }

    public final synchronized int d() {
        PackageInfo a2;
        if (this.f14582d == 0 && (a2 = a("com.google.android.gms")) != null) {
            this.f14582d = a2.versionCode;
        }
        return this.f14582d;
    }
}
