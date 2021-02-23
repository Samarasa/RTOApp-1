package com.google.android.gms.internal.ads;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.Gm  reason: case insensitive filesystem */
final class C0734Gm implements C2170mma {

    /* renamed from: a  reason: collision with root package name */
    private final C2170mma f7086a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7087b;

    /* renamed from: c  reason: collision with root package name */
    private final C2170mma f7088c;

    /* renamed from: d  reason: collision with root package name */
    private long f7089d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f7090e;

    C0734Gm(C2170mma mma, int i, C2170mma mma2) {
        this.f7086a = mma;
        this.f7087b = (long) i;
        this.f7088c = mma2;
    }

    public final long a(C2241nma nma) {
        C2241nma nma2;
        C2241nma nma3;
        C2241nma nma4 = nma;
        this.f7090e = nma4.f11507a;
        long j = nma4.f11510d;
        long j2 = this.f7087b;
        if (j >= j2) {
            nma2 = null;
        } else {
            long j3 = nma4.f11511e;
            nma2 = new C2241nma(nma4.f11507a, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null);
        }
        long j4 = nma4.f11511e;
        if (j4 == -1 || nma4.f11510d + j4 > this.f7087b) {
            long max = Math.max(this.f7087b, nma4.f11510d);
            long j5 = nma4.f11511e;
            nma3 = new C2241nma(nma4.f11507a, max, j5 != -1 ? Math.min(j5, (nma4.f11510d + j5) - this.f7087b) : -1, (String) null);
        } else {
            nma3 = null;
        }
        long j6 = 0;
        long a2 = nma2 != null ? this.f7086a.a(nma2) : 0;
        if (nma3 != null) {
            j6 = this.f7088c.a(nma3);
        }
        this.f7089d = nma4.f11510d;
        if (a2 == -1 || j6 == -1) {
            return -1;
        }
        return a2 + j6;
    }

    public final void close() {
        this.f7086a.close();
        this.f7088c.close();
    }

    public final Uri getUri() {
        return this.f7090e;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.f7089d;
        long j2 = this.f7087b;
        if (j < j2) {
            i3 = this.f7086a.read(bArr, i, (int) Math.min((long) i2, j2 - j));
            this.f7089d += (long) i3;
        } else {
            i3 = 0;
        }
        if (this.f7089d < this.f7087b) {
            return i3;
        }
        int read = this.f7088c.read(bArr, i + i3, i2 - i3);
        int i4 = i3 + read;
        this.f7089d += (long) read;
        return i4;
    }
}
