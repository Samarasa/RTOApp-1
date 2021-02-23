package com.google.android.material.bottomappbar;

import c.b.b.c.o.c;
import c.b.b.c.o.k;

public class i extends c implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private float f13939a;

    /* renamed from: b  reason: collision with root package name */
    private float f13940b;

    /* renamed from: c  reason: collision with root package name */
    private float f13941c;

    /* renamed from: d  reason: collision with root package name */
    private float f13942d;

    /* renamed from: e  reason: collision with root package name */
    private float f13943e;

    /* access modifiers changed from: package-private */
    public float a() {
        return this.f13942d;
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        this.f13942d = f2;
    }

    public void a(float f2, float f3, float f4, k kVar) {
        float f5 = f2;
        k kVar2 = kVar;
        float f6 = this.f13941c;
        if (f6 == 0.0f) {
            kVar2.a(f5, 0.0f);
            return;
        }
        float f7 = ((this.f13940b * 2.0f) + f6) / 2.0f;
        float f8 = f4 * this.f13939a;
        float f9 = f3 + this.f13943e;
        float f10 = (this.f13942d * f4) + ((1.0f - f4) * f7);
        if (f10 / f7 >= 1.0f) {
            kVar2.a(f5, 0.0f);
            return;
        }
        float f11 = f7 + f8;
        float f12 = f10 + f8;
        float sqrt = (float) Math.sqrt((double) ((f11 * f11) - (f12 * f12)));
        float f13 = f9 - sqrt;
        float f14 = f9 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f12)));
        float f15 = 90.0f - degrees;
        kVar2.a(f13, 0.0f);
        float f16 = f8 * 2.0f;
        float f17 = degrees;
        kVar.a(f13 - f8, 0.0f, f13 + f8, f16, 270.0f, degrees);
        kVar.a(f9 - f7, (-f7) - f10, f9 + f7, f7 - f10, 180.0f - f15, (f15 * 2.0f) - 180.0f);
        kVar.a(f14 - f8, 0.0f, f14 + f8, f16, 270.0f - f17, f17);
        kVar2.a(f5, 0.0f);
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f13940b;
    }

    /* access modifiers changed from: package-private */
    public void b(float f2) {
        this.f13940b = f2;
    }

    /* access modifiers changed from: package-private */
    public void c(float f2) {
        this.f13939a = f2;
    }

    public void d(float f2) {
        this.f13941c = f2;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f13939a;
    }

    /* access modifiers changed from: package-private */
    public void e(float f2) {
        this.f13943e = f2;
    }

    public float f() {
        return this.f13941c;
    }
}
