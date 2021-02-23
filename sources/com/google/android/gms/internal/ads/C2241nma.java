package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.nma  reason: case insensitive filesystem */
public final class C2241nma {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f11507a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f11508b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11509c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11510d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11511e;

    /* renamed from: f  reason: collision with root package name */
    public final String f11512f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11513g;

    public C2241nma(Uri uri) {
        this(uri, 0);
    }

    private C2241nma(Uri uri, int i) {
        this(uri, 0, -1, (String) null, 0);
    }

    private C2241nma(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, 0);
    }

    public C2241nma(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    private C2241nma(Uri uri, long j, long j2, String str, int i) {
        this(uri, 0, 0, -1, (String) null, 0);
    }

    public C2241nma(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        Cma.a(j >= 0);
        Cma.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        Cma.a(z);
        this.f11507a = uri;
        this.f11508b = bArr;
        this.f11509c = j;
        this.f11510d = j2;
        this.f11511e = j3;
        this.f11512f = str;
        this.f11513g = i;
    }

    public final boolean a(int i) {
        return (this.f11513g & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11507a);
        String arrays = Arrays.toString(this.f11508b);
        long j = this.f11509c;
        long j2 = this.f11510d;
        long j3 = this.f11511e;
        String str = this.f11512f;
        int i = this.f11513g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
