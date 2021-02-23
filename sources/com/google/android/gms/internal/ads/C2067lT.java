package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.lT  reason: case insensitive filesystem */
public final class C2067lT {
    public static ParcelFileDescriptor a(InputStream inputStream) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        C1252_k.f9699a.execute(new C1996kT(inputStream, createPipe[1]));
        return parcelFileDescriptor;
    }
}
