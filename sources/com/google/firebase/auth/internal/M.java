package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.B;
import com.google.firebase.auth.F;
import com.google.firebase.auth.W;
import java.util.ArrayList;
import java.util.List;

public final class M extends B {
    public static final Parcelable.Creator<M> CREATOR = new L();

    /* renamed from: a  reason: collision with root package name */
    private String f14365a;

    /* renamed from: b  reason: collision with root package name */
    private String f14366b;

    /* renamed from: c  reason: collision with root package name */
    private List<F> f14367c;

    private M() {
    }

    M(String str, String str2, List<F> list) {
        this.f14365a = str;
        this.f14366b = str2;
        this.f14367c = list;
    }

    public static M a(List<W> list, String str) {
        C0563t.a(list);
        C0563t.b(str);
        M m = new M();
        m.f14367c = new ArrayList();
        for (W next : list) {
            if (next instanceof F) {
                m.f14367c.add((F) next);
            }
        }
        m.f14366b = str;
        return m;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f14365a, false);
        c.a(parcel, 2, this.f14366b, false);
        c.c(parcel, 3, this.f14367c, false);
        c.a(parcel, a2);
    }
}
