package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Yi  reason: case insensitive filesystem */
public final class C1198Yi extends C2446qia implements C1146Wi {
    C1198Yi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void K() {
        b(3, c());
    }

    public final void L() {
        b(8, c());
    }

    public final void Y() {
        b(6, c());
    }

    public final void a(C0886Mi mi) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) mi);
        b(5, c2);
    }

    public final void b(int i) {
        Parcel c2 = c();
        c2.writeInt(i);
        b(7, c2);
    }

    public final void ea() {
        b(4, c());
    }

    public final void fa() {
        b(2, c());
    }

    public final void ha() {
        b(1, c());
    }
}
