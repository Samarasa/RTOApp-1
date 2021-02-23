package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0562s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class Status extends a implements k, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new p();

    /* renamed from: a  reason: collision with root package name */
    public static final Status f5755a = new Status(0);

    /* renamed from: b  reason: collision with root package name */
    public static final Status f5756b = new Status(14);

    /* renamed from: c  reason: collision with root package name */
    public static final Status f5757c = new Status(8);

    /* renamed from: d  reason: collision with root package name */
    public static final Status f5758d = new Status(15);

    /* renamed from: e  reason: collision with root package name */
    public static final Status f5759e = new Status(16);

    /* renamed from: f  reason: collision with root package name */
    private static final Status f5760f = new Status(17);

    /* renamed from: g  reason: collision with root package name */
    public static final Status f5761g = new Status(18);

    /* renamed from: h  reason: collision with root package name */
    private final int f5762h;
    private final int i;
    private final String j;
    private final PendingIntent k;

    public Status(int i2) {
        this(i2, (String) null);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.f5762h = i2;
        this.i = i3;
        this.j = str;
        this.k = pendingIntent;
    }

    public Status(int i2, String str) {
        this(1, i2, str, (PendingIntent) null);
    }

    public final String a() {
        String str = this.j;
        return str != null ? str : d.a(this.i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f5762h == status.f5762h && this.i == status.i && C0562s.a(this.j, status.j) && C0562s.a(this.k, status.k);
    }

    public final Status f() {
        return this;
    }

    public final int g() {
        return this.i;
    }

    public final String h() {
        return this.j;
    }

    public final int hashCode() {
        return C0562s.a(Integer.valueOf(this.f5762h), Integer.valueOf(this.i), this.j, this.k);
    }

    public final boolean i() {
        return this.k != null;
    }

    public final boolean j() {
        return this.i <= 0;
    }

    public final String toString() {
        C0562s.a a2 = C0562s.a((Object) this);
        a2.a("statusCode", a());
        a2.a("resolution", this.k);
        return a2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, g());
        c.a(parcel, 2, h(), false);
        c.a(parcel, 3, (Parcelable) this.k, i2, false);
        c.a(parcel, 1000, this.f5762h);
        c.a(parcel, a2);
    }
}
