package com.google.android.gms.common.internal.a;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.c;

public final class e {
    public static <T extends d> T a(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }

    public static <T extends d> T a(String str, Parcelable.Creator<T> creator) {
        return a(c.a(str), creator);
    }

    public static <T extends d> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        C0563t.a(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T t = (d) creator.createFromParcel(obtain);
        obtain.recycle();
        return t;
    }

    public static <T extends d> void a(T t, Intent intent, String str) {
        intent.putExtra(str, a(t));
    }

    public static <T extends d> byte[] a(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static <T extends d> String b(T t) {
        return c.b(a(t));
    }
}
