package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.yh  reason: case insensitive filesystem */
public final class C3010yh extends C2446qia implements C2868wh {
    C3010yh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void G(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        b(13, c2);
    }

    public final void Hb() {
        b(2, c());
    }

    public final void J() {
        b(14, c());
    }

    public final void Ob() {
        b(10, c());
    }

    public final void db() {
        b(9, c());
    }

    public final void k(Bundle bundle) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) bundle);
        Parcel a2 = a(6, c2);
        if (a2.readInt() != 0) {
            bundle.readFromParcel(a2);
        }
        a2.recycle();
    }

    public final void m() {
        b(3, c());
    }

    public final void m(Bundle bundle) {
        Parcel c2 = c();
        C2516ria.a(c2, (Parcelable) bundle);
        b(1, c2);
    }

    public final void n() {
        b(7, c());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcel c2 = c();
        c2.writeInt(i);
        c2.writeInt(i2);
        C2516ria.a(c2, (Parcelable) intent);
        b(12, c2);
    }

    public final void onDestroy() {
        b(8, c());
    }

    public final void onPause() {
        b(5, c());
    }

    public final void onResume() {
        b(4, c());
    }

    public final boolean xa() {
        Parcel a2 = a(11, c());
        boolean a3 = C2516ria.a(a2);
        a2.recycle();
        return a3;
    }
}
