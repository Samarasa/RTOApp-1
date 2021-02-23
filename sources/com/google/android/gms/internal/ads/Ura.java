package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class Ura extends C2446qia implements Sra {
    Ura(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.Tra Jb() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.c()
            r1 = 11
            android.os.Parcel r0 = r4.a(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.Tra
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.Tra r1 = (com.google.android.gms.internal.ads.Tra) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.Vra r2 = new com.google.android.gms.internal.ads.Vra
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Ura.Jb():com.google.android.gms.internal.ads.Tra");
    }

    public final void a(Tra tra) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) tra);
        b(8, c2);
    }

    public final float getDuration() {
        Parcel a2 = a(6, c());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    public final float ia() {
        Parcel a2 = a(9, c());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    public final float pa() {
        Parcel a2 = a(7, c());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }
}
