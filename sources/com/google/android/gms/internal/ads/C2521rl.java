package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.rl  reason: case insensitive filesystem */
final class C2521rl extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final long f12024a;

    /* renamed from: b  reason: collision with root package name */
    private long f12025b;

    C2521rl(InputStream inputStream, long j) {
        super(inputStream);
        this.f12024a = j;
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        return this.f12024a - this.f12025b;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f12025b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f12025b += (long) read;
        }
        return read;
    }
}
