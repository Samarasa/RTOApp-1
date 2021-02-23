package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.d.d.C0286w;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.F;
import com.google.firebase.auth.W;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.firebase.auth.internal.l  reason: case insensitive filesystem */
public final class C3296l extends a {
    public static final Parcelable.Creator<C3296l> CREATOR = new C3299o();

    /* renamed from: a  reason: collision with root package name */
    private final List<F> f14387a;

    C3296l(List<F> list) {
        this.f14387a = list == null ? C0286w.a() : list;
    }

    public static C3296l a(List<W> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (W next : list) {
            if (next instanceof F) {
                arrayList.add((F) next);
            }
        }
        return new C3296l(arrayList);
    }

    public final List<W> a() {
        ArrayList arrayList = new ArrayList();
        for (F add : this.f14387a) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.c(parcel, 1, this.f14387a, false);
        c.a(parcel, a2);
    }
}
