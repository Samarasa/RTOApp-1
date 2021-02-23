package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.C3251a;
import com.google.firebase.auth.C3278c;
import com.google.firebase.auth.C3306p;
import com.google.firebase.auth.J;
import java.util.List;

public final class x implements C3278c {
    public static final Parcelable.Creator<x> CREATOR = new A();

    /* renamed from: a  reason: collision with root package name */
    private D f14407a;

    /* renamed from: b  reason: collision with root package name */
    private w f14408b;

    /* renamed from: c  reason: collision with root package name */
    private J f14409c;

    public x(D d2) {
        C0563t.a(d2);
        this.f14407a = d2;
        List<z> y = this.f14407a.y();
        this.f14408b = null;
        for (int i = 0; i < y.size(); i++) {
            if (!TextUtils.isEmpty(y.get(i).a())) {
                this.f14408b = new w(y.get(i).e(), y.get(i).a(), d2.z());
            }
        }
        if (this.f14408b == null) {
            this.f14408b = new w(d2.z());
        }
        this.f14409c = d2.A();
    }

    x(D d2, w wVar, J j) {
        this.f14407a = d2;
        this.f14408b = wVar;
        this.f14409c = j;
    }

    public final C3251a a() {
        return this.f14408b;
    }

    public final C3306p b() {
        return this.f14407a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, (Parcelable) b(), i, false);
        c.a(parcel, 2, (Parcelable) a(), i, false);
        c.a(parcel, 3, (Parcelable) this.f14409c, i, false);
        c.a(parcel, a2);
    }
}
