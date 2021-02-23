package com.google.firebase.auth.a.a;

import android.text.TextUtils;
import com.google.android.gms.common.internal.r;

public final class Z {
    static String a() {
        return a("firebase-auth");
    }

    private static String a(String str) {
        String a2 = r.a().a(str);
        return (TextUtils.isEmpty(a2) || a2.equals("UNKNOWN")) ? "-1" : a2;
    }
}
