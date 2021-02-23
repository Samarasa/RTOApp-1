package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.C3251a;
import java.util.Map;

public final class w implements C3251a {
    public static final Parcelable.Creator<w> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    private final String f14403a;

    /* renamed from: b  reason: collision with root package name */
    private final String f14404b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Object> f14405c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14406d;

    public w(String str, String str2, boolean z) {
        C0563t.b(str);
        C0563t.b(str2);
        this.f14403a = str;
        this.f14404b = str2;
        this.f14405c = C3294j.b(str2);
        this.f14406d = z;
    }

    public w(boolean z) {
        this.f14406d = z;
        this.f14404b = null;
        this.f14403a = null;
        this.f14405c = null;
    }

    public final String a() {
        return this.f14403a;
    }

    public final boolean b() {
        return this.f14406d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, a(), false);
        c.a(parcel, 2, this.f14404b, false);
        c.a(parcel, 3, b());
        c.a(parcel, a2);
    }
}
