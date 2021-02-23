package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class Sga {

    /* renamed from: a  reason: collision with root package name */
    public static final Sga f8652a = new Sga(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: b  reason: collision with root package name */
    private static final Sga f8653b = new Sga(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: c  reason: collision with root package name */
    private static final Sga f8654c = new Sga(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: d  reason: collision with root package name */
    private static final Sga f8655d = new Sga(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* renamed from: e  reason: collision with root package name */
    private final double f8656e;

    /* renamed from: f  reason: collision with root package name */
    private final double f8657f;

    /* renamed from: g  reason: collision with root package name */
    private final double f8658g;

    /* renamed from: h  reason: collision with root package name */
    private final double f8659h;
    private final double i;
    private final double j;
    private final double k;
    private final double l;
    private final double m;

    private Sga(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.f8656e = d6;
        this.f8657f = d7;
        this.f8658g = d8;
        this.f8659h = d2;
        this.i = d3;
        this.j = d4;
        this.k = d5;
        this.l = d9;
        this.m = d10;
    }

    public static Sga a(ByteBuffer byteBuffer) {
        double d2 = C2962xt.d(byteBuffer);
        double d3 = C2962xt.d(byteBuffer);
        double e2 = C2962xt.e(byteBuffer);
        return new Sga(d2, d3, C2962xt.d(byteBuffer), C2962xt.d(byteBuffer), e2, C2962xt.e(byteBuffer), C2962xt.e(byteBuffer), C2962xt.d(byteBuffer), C2962xt.d(byteBuffer));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Sga.class != obj.getClass()) {
            return false;
        }
        Sga sga = (Sga) obj;
        return Double.compare(sga.f8659h, this.f8659h) == 0 && Double.compare(sga.i, this.i) == 0 && Double.compare(sga.j, this.j) == 0 && Double.compare(sga.k, this.k) == 0 && Double.compare(sga.l, this.l) == 0 && Double.compare(sga.m, this.m) == 0 && Double.compare(sga.f8656e, this.f8656e) == 0 && Double.compare(sga.f8657f, this.f8657f) == 0 && Double.compare(sga.f8658g, this.f8658g) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f8656e);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f8657f);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f8658g);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f8659h);
        long doubleToLongBits5 = Double.doubleToLongBits(this.i);
        long doubleToLongBits6 = Double.doubleToLongBits(this.j);
        long doubleToLongBits7 = Double.doubleToLongBits(this.k);
        long doubleToLongBits8 = Double.doubleToLongBits(this.l);
        long doubleToLongBits9 = Double.doubleToLongBits(this.m);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f8652a)) {
            return "Rotate 0°";
        }
        if (equals(f8653b)) {
            return "Rotate 90°";
        }
        if (equals(f8654c)) {
            return "Rotate 180°";
        }
        if (equals(f8655d)) {
            return "Rotate 270°";
        }
        double d2 = this.f8656e;
        double d3 = this.f8657f;
        double d4 = this.f8658g;
        double d5 = this.f8659h;
        double d6 = this.i;
        double d7 = this.j;
        double d8 = this.k;
        double d9 = this.l;
        double d10 = this.m;
        double d11 = d8;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d2);
        sb.append(", v=");
        sb.append(d3);
        sb.append(", w=");
        sb.append(d4);
        sb.append(", a=");
        sb.append(d5);
        sb.append(", b=");
        sb.append(d6);
        sb.append(", c=");
        sb.append(d7);
        sb.append(", d=");
        sb.append(d11);
        sb.append(", tx=");
        sb.append(d9);
        sb.append(", ty=");
        sb.append(d10);
        sb.append("}");
        return sb.toString();
    }
}
