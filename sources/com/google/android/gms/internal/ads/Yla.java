package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class Yla {

    /* renamed from: a  reason: collision with root package name */
    private final String f9476a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9477b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9478c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f9479d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9480e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9481f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9482g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9483h;
    public final boolean i;
    public final int j;
    public final int k;
    public final boolean l;

    public Yla() {
        this((String) null, (String) null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    private Yla(String str, String str2, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, int i5, int i6, boolean z5) {
        this.f9476a = null;
        this.f9477b = null;
        this.f9478c = false;
        this.f9479d = true;
        this.f9480e = Integer.MAX_VALUE;
        this.f9481f = Integer.MAX_VALUE;
        this.f9482g = Integer.MAX_VALUE;
        this.f9483h = true;
        this.i = true;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.l = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Yla.class == obj.getClass()) {
            Yla yla = (Yla) obj;
            return this.f9479d == yla.f9479d && this.f9480e == yla.f9480e && this.f9481f == yla.f9481f && this.f9483h == yla.f9483h && this.i == yla.i && this.l == yla.l && this.j == yla.j && this.k == yla.k && this.f9482g == yla.f9482g && TextUtils.equals((CharSequence) null, (CharSequence) null) && TextUtils.equals((CharSequence) null, (CharSequence) null);
        }
    }

    public final int hashCode() {
        String str = null;
        return (((((((((((((((((((str.hashCode() * 31) + str.hashCode()) * 31 * 31) + (this.f9479d ? 1 : 0)) * 31) + this.f9480e) * 31) + this.f9481f) * 31) + this.f9482g) * 31) + (this.f9483h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + this.j) * 31) + this.k;
    }
}
