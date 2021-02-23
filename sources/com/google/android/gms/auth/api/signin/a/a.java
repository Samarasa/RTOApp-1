package com.google.android.gms.auth.api.signin.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C0563t;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Lock f5748a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    private static a f5749b;

    /* renamed from: c  reason: collision with root package name */
    private final Lock f5750c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private final SharedPreferences f5751d;

    private a(Context context) {
        this.f5751d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    private final GoogleSignInAccount a(String str) {
        String b2;
        if (!TextUtils.isEmpty(str) && (b2 = b(a("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.a(b2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static a a(Context context) {
        C0563t.a(context);
        f5748a.lock();
        try {
            if (f5749b == null) {
                f5749b = new a(context.getApplicationContext());
            }
            return f5749b;
        } finally {
            f5748a.unlock();
        }
    }

    private static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    private final String b(String str) {
        this.f5750c.lock();
        try {
            return this.f5751d.getString(str, (String) null);
        } finally {
            this.f5750c.unlock();
        }
    }

    public GoogleSignInAccount a() {
        return a(b("defaultGoogleSignInAccount"));
    }
}
