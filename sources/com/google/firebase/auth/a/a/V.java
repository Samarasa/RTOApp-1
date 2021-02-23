package com.google.firebase.auth.a.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.d.d.Ba;
import c.b.b.b.d.d.C0257aa;
import c.b.b.b.d.d.C0259ba;
import c.b.b.b.d.d.C0263da;
import c.b.b.b.d.d.C0280p;
import c.b.b.b.d.d.M;
import c.b.b.b.d.d.O;
import c.b.b.b.d.d.P;
import c.b.b.b.d.d.S;
import c.b.b.b.d.d.W;
import c.b.b.b.d.d.X;
import com.google.firebase.auth.C3279d;
import com.google.firebase.auth.C3311v;

public final class V extends C0280p implements U {
    V(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthService");
    }

    public final void a(Ba ba, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) ba);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(3, a2);
    }

    public final void a(M m, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) m);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(101, a2);
    }

    public final void a(O o, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) o);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(111, a2);
    }

    public final void a(P p, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) p);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(112, a2);
    }

    public final void a(S s, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) s);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(124, a2);
    }

    public final void a(W w, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) w);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(116, a2);
    }

    public final void a(X x, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) x);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(103, a2);
    }

    public final void a(C0257aa aaVar, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) aaVar);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(108, a2);
    }

    public final void a(C0259ba baVar, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) baVar);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(129, a2);
    }

    public final void a(C0263da daVar, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) daVar);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(123, a2);
    }

    public final void a(T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(16, a2);
    }

    public final void a(C3279d dVar, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) dVar);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(29, a2);
    }

    public final void a(C3311v vVar, T t) {
        Parcel a2 = a();
        c.b.b.b.d.d.V.a(a2, (Parcelable) vVar);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(23, a2);
    }

    public final void a(String str, Ba ba, T t) {
        Parcel a2 = a();
        a2.writeString(str);
        c.b.b.b.d.d.V.a(a2, (Parcelable) ba);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(12, a2);
    }

    public final void a(String str, T t) {
        Parcel a2 = a();
        a2.writeString(str);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(1, a2);
    }

    public final void a(String str, C3311v vVar, T t) {
        Parcel a2 = a();
        a2.writeString(str);
        c.b.b.b.d.d.V.a(a2, (Parcelable) vVar);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(24, a2);
    }

    public final void a(String str, String str2, T t) {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeString(str2);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(8, a2);
    }

    public final void a(String str, String str2, String str3, T t) {
        Parcel a2 = a();
        a2.writeString(str);
        a2.writeString(str2);
        a2.writeString(str3);
        c.b.b.b.d.d.V.a(a2, (IInterface) t);
        a(11, a2);
    }
}
