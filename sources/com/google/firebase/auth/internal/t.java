package com.google.firebase.auth.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.e;
import java.util.HashMap;
import java.util.Map;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f14402a;

    static {
        HashMap hashMap = new HashMap();
        f14402a = hashMap;
        hashMap.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        f14402a.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        f14402a.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        f14402a.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        f14402a.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static void a(Intent intent, Status status) {
        e.a(status, intent, "com.google.firebase.auth.internal.STATUS");
    }

    public static boolean a(Intent intent) {
        C0563t.a(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }

    public static Status b(Intent intent) {
        C0563t.a(intent);
        C0563t.a(a(intent));
        return (Status) e.a(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }
}
