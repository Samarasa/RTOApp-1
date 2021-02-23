package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new o();

    /* renamed from: a  reason: collision with root package name */
    private final int f5753a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5754b;

    Scope(int i, String str) {
        C0563t.a(str, (Object) "scopeUri must not be null or empty");
        this.f5753a = i;
        this.f5754b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5754b.equals(((Scope) obj).f5754b);
    }

    public final String g() {
        return this.f5754b;
    }

    public final int hashCode() {
        return this.f5754b.hashCode();
    }

    public final String toString() {
        return this.f5754b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5753a);
        c.a(parcel, 2, g(), false);
        c.a(parcel, a2);
    }
}
