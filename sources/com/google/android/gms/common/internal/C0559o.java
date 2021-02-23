package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.d.c.c;

/* renamed from: com.google.android.gms.common.internal.o  reason: case insensitive filesystem */
public interface C0559o extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.o$a */
    public static abstract class a extends c.b.b.b.d.c.a implements C0559o {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                c(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                a(parcel.readInt(), parcel.readStrongBinder(), (E) c.a(parcel, E.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void a(int i, IBinder iBinder, Bundle bundle);

    void a(int i, IBinder iBinder, E e2);

    void c(int i, Bundle bundle);
}
