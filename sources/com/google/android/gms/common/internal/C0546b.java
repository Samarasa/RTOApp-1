package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.j;

/* renamed from: com.google.android.gms.common.internal.b  reason: case insensitive filesystem */
public class C0546b {
    public static b a(Status status) {
        return status.i() ? new j(status) : new b(status);
    }
}
