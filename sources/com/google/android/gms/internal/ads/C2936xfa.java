package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xfa  reason: case insensitive filesystem */
final class C2936xfa implements C1731gfa {

    /* renamed from: a  reason: collision with root package name */
    private final C1872ifa f12795a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12796b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f12797c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12798d;

    C2936xfa(C1872ifa ifa, String str, Object[] objArr) {
        this.f12795a = ifa;
        this.f12796b = str;
        this.f12797c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f12798d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f12798d = c2 | (charAt2 << i);
                return;
            }
        }
    }

    public final int a() {
        return (this.f12798d & 1) == 1 ? C2581sfa.f12118a : C2581sfa.f12119b;
    }

    public final boolean b() {
        return (this.f12798d & 2) == 2;
    }

    public final C1872ifa c() {
        return this.f12795a;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return this.f12796b;
    }

    /* access modifiers changed from: package-private */
    public final Object[] e() {
        return this.f12797c;
    }
}
