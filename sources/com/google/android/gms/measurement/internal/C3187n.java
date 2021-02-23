package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.n  reason: case insensitive filesystem */
public final class C3187n extends a implements Iterable<String> {
    public static final Parcelable.Creator<C3187n> CREATOR = new C3197p();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f13681a;

    C3187n(Bundle bundle) {
        this.f13681a = bundle;
    }

    public final int a() {
        return this.f13681a.size();
    }

    /* access modifiers changed from: package-private */
    public final Object a(String str) {
        return this.f13681a.get(str);
    }

    public final Bundle b() {
        return new Bundle(this.f13681a);
    }

    /* access modifiers changed from: package-private */
    public final Long b(String str) {
        return Long.valueOf(this.f13681a.getLong(str));
    }

    /* access modifiers changed from: package-private */
    public final Double c(String str) {
        return Double.valueOf(this.f13681a.getDouble(str));
    }

    /* access modifiers changed from: package-private */
    public final String d(String str) {
        return this.f13681a.getString(str);
    }

    public final Iterator<String> iterator() {
        return new C3182m(this);
    }

    public final String toString() {
        return this.f13681a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, b(), false);
        c.a(parcel, a2);
    }
}
