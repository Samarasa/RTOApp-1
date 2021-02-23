package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.nd  reason: case insensitive filesystem */
public abstract class C2222nd extends C2587sia implements C2293od {
    public C2222nd() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        b((ParcelFileDescriptor) C2516ria.a(parcel, ParcelFileDescriptor.CREATOR));
        return true;
    }
}
