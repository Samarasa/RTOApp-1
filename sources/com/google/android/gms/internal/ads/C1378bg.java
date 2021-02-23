package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.e;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.bg  reason: case insensitive filesystem */
public final class C1378bg implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Date f9935a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9936b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f9937c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9938d;

    /* renamed from: e  reason: collision with root package name */
    private final Location f9939e;

    /* renamed from: f  reason: collision with root package name */
    private final int f9940f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f9941g;

    /* renamed from: h  reason: collision with root package name */
    private final int f9942h;
    private final String i;

    public C1378bg(Date date, int i2, Set<String> set, Location location, boolean z, int i3, boolean z2, int i4, String str) {
        this.f9935a = date;
        this.f9936b = i2;
        this.f9937c = set;
        this.f9939e = location;
        this.f9938d = z;
        this.f9940f = i3;
        this.f9941g = z2;
        this.f9942h = i4;
        this.i = str;
    }

    public final int a() {
        return this.f9940f;
    }

    @Deprecated
    public final boolean c() {
        return this.f9941g;
    }

    @Deprecated
    public final Date e() {
        return this.f9935a;
    }

    public final boolean g() {
        return this.f9938d;
    }

    public final Location getLocation() {
        return this.f9939e;
    }

    public final Set<String> h() {
        return this.f9937c;
    }

    @Deprecated
    public final int l() {
        return this.f9936b;
    }
}
