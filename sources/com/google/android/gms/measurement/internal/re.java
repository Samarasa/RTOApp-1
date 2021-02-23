package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class re extends a {
    public static final Parcelable.Creator<re> CREATOR = new qe();

    /* renamed from: a  reason: collision with root package name */
    private final int f13746a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13747b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13748c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f13749d;

    /* renamed from: e  reason: collision with root package name */
    private final Float f13750e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13751f;

    /* renamed from: g  reason: collision with root package name */
    public final String f13752g;

    /* renamed from: h  reason: collision with root package name */
    public final Double f13753h;

    re(int i, String str, long j, Long l, Float f2, String str2, String str3, Double d2) {
        this.f13746a = i;
        this.f13747b = str;
        this.f13748c = j;
        this.f13749d = l;
        Double d3 = null;
        this.f13750e = null;
        if (i == 1) {
            this.f13753h = f2 != null ? Double.valueOf(f2.doubleValue()) : d3;
        } else {
            this.f13753h = d2;
        }
        this.f13751f = str2;
        this.f13752g = str3;
    }

    re(te teVar) {
        this(teVar.f13776c, teVar.f13777d, teVar.f13778e, teVar.f13775b);
    }

    re(String str, long j, Object obj, String str2) {
        C0563t.b(str);
        this.f13746a = 2;
        this.f13747b = str;
        this.f13748c = j;
        this.f13752g = str2;
        if (obj == null) {
            this.f13749d = null;
            this.f13750e = null;
            this.f13753h = null;
            this.f13751f = null;
        } else if (obj instanceof Long) {
            this.f13749d = (Long) obj;
            this.f13750e = null;
            this.f13753h = null;
            this.f13751f = null;
        } else if (obj instanceof String) {
            this.f13749d = null;
            this.f13750e = null;
            this.f13753h = null;
            this.f13751f = (String) obj;
        } else if (obj instanceof Double) {
            this.f13749d = null;
            this.f13750e = null;
            this.f13753h = (Double) obj;
            this.f13751f = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    re(String str, long j, String str2) {
        C0563t.b(str);
        this.f13746a = 2;
        this.f13747b = str;
        this.f13748c = 0;
        this.f13749d = null;
        this.f13750e = null;
        this.f13753h = null;
        this.f13751f = null;
        this.f13752g = null;
    }

    public final Object a() {
        Long l = this.f13749d;
        if (l != null) {
            return l;
        }
        Double d2 = this.f13753h;
        if (d2 != null) {
            return d2;
        }
        String str = this.f13751f;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f13746a);
        c.a(parcel, 2, this.f13747b, false);
        c.a(parcel, 3, this.f13748c);
        c.a(parcel, 4, this.f13749d, false);
        c.a(parcel, 5, (Float) null, false);
        c.a(parcel, 6, this.f13751f, false);
        c.a(parcel, 7, this.f13752g, false);
        c.a(parcel, 8, this.f13753h, false);
        c.a(parcel, a2);
    }
}
