package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Oh  reason: case insensitive filesystem */
public final class C0937Oh extends C2446qia implements C0885Mh {
    C0937Oh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public final void b(List<Uri> list) {
        Parcel c2 = c();
        c2.writeTypedList(list);
        b(1, c2);
    }

    public final void i(String str) {
        Parcel c2 = c();
        c2.writeString(str);
        b(2, c2);
    }
}
