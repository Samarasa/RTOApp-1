package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* renamed from: com.google.android.gms.internal.ads.zv  reason: case insensitive filesystem */
public final class C3106zv extends Hga {
    private int A;
    private Date n;
    private Date o;
    private long p;
    private long q;
    private double r = 1.0d;
    private float s = 1.0f;
    private Sga t = Sga.f8652a;
    private long u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public C3106zv() {
        super("mvhd");
    }

    public final void a(ByteBuffer byteBuffer) {
        long j;
        b(byteBuffer);
        if (b() == 1) {
            this.n = Kga.a(C2962xt.c(byteBuffer));
            this.o = Kga.a(C2962xt.c(byteBuffer));
            this.p = C2962xt.a(byteBuffer);
            j = C2962xt.c(byteBuffer);
        } else {
            this.n = Kga.a(C2962xt.a(byteBuffer));
            this.o = Kga.a(C2962xt.a(byteBuffer));
            this.p = C2962xt.a(byteBuffer);
            j = C2962xt.a(byteBuffer);
        }
        this.q = j;
        this.r = C2962xt.d(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.s = ((float) ((short) ((bArr[1] & 255) | ((short) (0 | ((bArr[0] << 8) & 65280)))))) / 256.0f;
        C2962xt.b(byteBuffer);
        C2962xt.a(byteBuffer);
        C2962xt.a(byteBuffer);
        this.t = Sga.a(byteBuffer);
        this.v = byteBuffer.getInt();
        this.w = byteBuffer.getInt();
        this.x = byteBuffer.getInt();
        this.y = byteBuffer.getInt();
        this.z = byteBuffer.getInt();
        this.A = byteBuffer.getInt();
        this.u = C2962xt.a(byteBuffer);
    }

    public final long c() {
        return this.q;
    }

    public final long d() {
        return this.p;
    }

    public final String toString() {
        return "MovieHeaderBox[" + "creationTime=" + this.n + ";" + "modificationTime=" + this.o + ";" + "timescale=" + this.p + ";" + "duration=" + this.q + ";" + "rate=" + this.r + ";" + "volume=" + this.s + ";" + "matrix=" + this.t + ";" + "nextTrackId=" + this.u + "]";
    }
}
