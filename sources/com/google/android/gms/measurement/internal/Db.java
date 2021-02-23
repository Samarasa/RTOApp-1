package com.google.android.gms.measurement.internal;

public final class Db {

    /* renamed from: a  reason: collision with root package name */
    private final int f13214a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13215b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f13216c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Bb f13217d;

    Db(Bb bb, int i, boolean z, boolean z2) {
        this.f13217d = bb;
        this.f13214a = i;
        this.f13215b = z;
        this.f13216c = z2;
    }

    public final void a(String str) {
        this.f13217d.a(this.f13214a, this.f13215b, this.f13216c, str, (Object) null, (Object) null, (Object) null);
    }

    public final void a(String str, Object obj) {
        this.f13217d.a(this.f13214a, this.f13215b, this.f13216c, str, obj, (Object) null, (Object) null);
    }

    public final void a(String str, Object obj, Object obj2) {
        this.f13217d.a(this.f13214a, this.f13215b, this.f13216c, str, obj, obj2, (Object) null);
    }

    public final void a(String str, Object obj, Object obj2, Object obj3) {
        this.f13217d.a(this.f13214a, this.f13215b, this.f13216c, str, obj, obj2, obj3);
    }
}
