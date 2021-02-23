package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.d.f.C0290a;
import c.b.b.b.d.f.r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.vb  reason: case insensitive filesystem */
public final class C3228vb extends C0290a implements C3218tb {
    C3228vb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    public final List<re> a(xe xeVar, boolean z) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) xeVar);
        r.a(Db, z);
        Parcel a2 = a(7, Db);
        ArrayList<re> createTypedArrayList = a2.createTypedArrayList(re.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final List<Ge> a(String str, String str2, xe xeVar) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeString(str2);
        r.a(Db, (Parcelable) xeVar);
        Parcel a2 = a(16, Db);
        ArrayList<Ge> createTypedArrayList = a2.createTypedArrayList(Ge.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final List<Ge> a(String str, String str2, String str3) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeString(str2);
        Db.writeString(str3);
        Parcel a2 = a(17, Db);
        ArrayList<Ge> createTypedArrayList = a2.createTypedArrayList(Ge.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final List<re> a(String str, String str2, String str3, boolean z) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeString(str2);
        Db.writeString(str3);
        r.a(Db, z);
        Parcel a2 = a(15, Db);
        ArrayList<re> createTypedArrayList = a2.createTypedArrayList(re.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final List<re> a(String str, String str2, boolean z, xe xeVar) {
        Parcel Db = Db();
        Db.writeString(str);
        Db.writeString(str2);
        r.a(Db, z);
        r.a(Db, (Parcelable) xeVar);
        Parcel a2 = a(14, Db);
        ArrayList<re> createTypedArrayList = a2.createTypedArrayList(re.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    public final void a(long j, String str, String str2, String str3) {
        Parcel Db = Db();
        Db.writeLong(j);
        Db.writeString(str);
        Db.writeString(str2);
        Db.writeString(str3);
        b(10, Db);
    }

    public final void a(Ge ge) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) ge);
        b(13, Db);
    }

    public final void a(Ge ge, xe xeVar) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) ge);
        r.a(Db, (Parcelable) xeVar);
        b(12, Db);
    }

    public final void a(C3192o oVar, xe xeVar) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) oVar);
        r.a(Db, (Parcelable) xeVar);
        b(1, Db);
    }

    public final void a(C3192o oVar, String str, String str2) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) oVar);
        Db.writeString(str);
        Db.writeString(str2);
        b(5, Db);
    }

    public final void a(re reVar, xe xeVar) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) reVar);
        r.a(Db, (Parcelable) xeVar);
        b(2, Db);
    }

    public final void a(xe xeVar) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) xeVar);
        b(18, Db);
    }

    public final byte[] a(C3192o oVar, String str) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) oVar);
        Db.writeString(str);
        Parcel a2 = a(9, Db);
        byte[] createByteArray = a2.createByteArray();
        a2.recycle();
        return createByteArray;
    }

    public final void b(xe xeVar) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) xeVar);
        b(6, Db);
    }

    public final String c(xe xeVar) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) xeVar);
        Parcel a2 = a(11, Db);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    public final void d(xe xeVar) {
        Parcel Db = Db();
        r.a(Db, (Parcelable) xeVar);
        b(4, Db);
    }
}
