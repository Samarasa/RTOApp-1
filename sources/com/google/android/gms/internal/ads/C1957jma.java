package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.jma  reason: case insensitive filesystem */
public final class C1957jma implements C2170mma {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f10994a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f10995b;

    /* renamed from: c  reason: collision with root package name */
    private int f10996c;

    /* renamed from: d  reason: collision with root package name */
    private int f10997d;

    public C1957jma(byte[] bArr) {
        Cma.a(bArr);
        Cma.a(bArr.length > 0);
        this.f10994a = bArr;
    }

    public final long a(C2241nma nma) {
        this.f10995b = nma.f11507a;
        long j = nma.f11510d;
        this.f10996c = (int) j;
        long j2 = nma.f11511e;
        if (j2 == -1) {
            j2 = ((long) this.f10994a.length) - j;
        }
        this.f10997d = (int) j2;
        int i = this.f10997d;
        if (i > 0 && this.f10996c + i <= this.f10994a.length) {
            return (long) i;
        }
        int i2 = this.f10996c;
        long j3 = nma.f11511e;
        int length = this.f10994a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i2);
        sb.append(", ");
        sb.append(j3);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    public final void close() {
        this.f10995b = null;
    }

    public final Uri getUri() {
        return this.f10995b;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f10997d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f10994a, this.f10996c, bArr, i, min);
        this.f10996c += min;
        this.f10997d -= min;
        return min;
    }
}
