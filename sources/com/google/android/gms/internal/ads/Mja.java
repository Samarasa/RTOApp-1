package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.Lja;

final class Mja implements Parcelable.Creator<Lja.a> {
    Mja() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Lja.a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Lja.a[i];
    }
}
