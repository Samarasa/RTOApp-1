package com.google.firebase.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.d.d.C0273ia;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.C;
import com.google.firebase.auth.C3306p;
import com.google.firebase.auth.F;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.J;
import com.google.firebase.auth.W;
import java.util.ArrayList;
import java.util.List;

public final class K extends C {
    public static final Parcelable.Creator<K> CREATOR = new J();

    /* renamed from: a  reason: collision with root package name */
    private final List<F> f14360a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final M f14361b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14362c;

    /* renamed from: d  reason: collision with root package name */
    private final J f14363d;

    /* renamed from: e  reason: collision with root package name */
    private final D f14364e;

    public K(List<F> list, M m, String str, J j, D d2) {
        for (W next : list) {
            if (next instanceof F) {
                this.f14360a.add((F) next);
            }
        }
        C0563t.a(m);
        this.f14361b = m;
        C0563t.b(str);
        this.f14362c = str;
        this.f14363d = j;
        this.f14364e = d2;
    }

    public static K a(C0273ia iaVar, FirebaseAuth firebaseAuth, C3306p pVar) {
        List<W> g2 = iaVar.g();
        ArrayList arrayList = new ArrayList();
        for (W next : g2) {
            if (next instanceof F) {
                arrayList.add((F) next);
            }
        }
        return new K(arrayList, M.a(iaVar.g(), iaVar.a()), firebaseAuth.e().d(), iaVar.b(), (D) pVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.c(parcel, 1, this.f14360a, false);
        c.a(parcel, 2, (Parcelable) this.f14361b, i, false);
        c.a(parcel, 3, this.f14362c, false);
        c.a(parcel, 4, (Parcelable) this.f14363d, i, false);
        c.a(parcel, 5, (Parcelable) this.f14364e, i, false);
        c.a(parcel, a2);
    }
}
