package com.google.firebase.auth;

import android.net.Uri;
import c.b.b.b.d.d.A;
import c.b.b.b.d.d.B;
import com.google.android.gms.common.internal.C0563t;
import java.util.Set;

public final class I {

    /* renamed from: a  reason: collision with root package name */
    private static final B<String, Integer> f14262a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14263b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14264c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14265d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14266e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14267f;

    /* renamed from: g  reason: collision with root package name */
    private final String f14268g;

    static {
        A a2 = new A();
        a2.a("recoverEmail", 2);
        a2.a("resetPassword", 0);
        a2.a("signIn", 4);
        a2.a("verifyEmail", 1);
        a2.a("verifyBeforeChangeEmail", 5);
        a2.a("revertSecondFactorAddition", 6);
        f14262a = a2.a();
    }

    private I(String str) {
        this.f14263b = a(str, "apiKey");
        this.f14264c = a(str, "oobCode");
        this.f14265d = a(str, "mode");
        if (this.f14263b == null || this.f14264c == null || this.f14265d == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", new Object[]{"apiKey", "oobCode", "mode"}));
        }
        this.f14266e = a(str, "continueUrl");
        this.f14267f = a(str, "languageCode");
        this.f14268g = a(str, "tenantId");
    }

    public static I a(String str) {
        C0563t.b(str);
        try {
            return new I(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(parse.getQueryParameter("link")).getQueryParameter(str2);
            }
            return null;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final String a() {
        return this.f14268g;
    }
}
