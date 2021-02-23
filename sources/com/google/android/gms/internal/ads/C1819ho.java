package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ho  reason: case insensitive filesystem */
public final class C1819ho {

    /* renamed from: a  reason: collision with root package name */
    private final int f10732a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10733b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10734c;

    private C1819ho(int i, int i2, int i3) {
        this.f10732a = i;
        this.f10734c = i2;
        this.f10733b = i3;
    }

    public static C1819ho a(int i, int i2) {
        return new C1819ho(1, i, i2);
    }

    public static C1819ho a(C2462qqa qqa) {
        return qqa.f11917d ? new C1819ho(3, 0, 0) : qqa.i ? new C1819ho(2, 0, 0) : qqa.f11921h ? b() : a(qqa.f11919f, qqa.f11916c);
    }

    public static C1819ho b() {
        return new C1819ho(0, 0, 0);
    }

    public static C1819ho c() {
        return new C1819ho(4, 0, 0);
    }

    public static C1819ho d() {
        return new C1819ho(5, 0, 0);
    }

    public final boolean a() {
        return this.f10732a == 2;
    }

    public final boolean e() {
        return this.f10732a == 3;
    }

    public final boolean f() {
        return this.f10732a == 0;
    }

    public final boolean g() {
        return this.f10732a == 4;
    }

    public final boolean h() {
        return this.f10732a == 5;
    }
}
