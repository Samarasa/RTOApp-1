package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.io.InputStream;

public final class Aoa extends a {
    public static final Parcelable.Creator<Aoa> CREATOR = new Doa();

    /* renamed from: a  reason: collision with root package name */
    private ParcelFileDescriptor f6188a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6189b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f6190c;

    /* renamed from: d  reason: collision with root package name */
    private final long f6191d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f6192e;

    public Aoa() {
        this((ParcelFileDescriptor) null, false, false, 0, false);
    }

    public Aoa(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.f6188a = parcelFileDescriptor;
        this.f6189b = z;
        this.f6190c = z2;
        this.f6191d = j;
        this.f6192e = z3;
    }

    private final synchronized ParcelFileDescriptor u() {
        return this.f6188a;
    }

    public final synchronized boolean g() {
        return this.f6188a != null;
    }

    public final synchronized InputStream h() {
        if (this.f6188a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f6188a);
        this.f6188a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean i() {
        return this.f6189b;
    }

    public final synchronized boolean j() {
        return this.f6190c;
    }

    public final synchronized long k() {
        return this.f6191d;
    }

    public final synchronized boolean l() {
        return this.f6192e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) u(), i, false);
        c.a(parcel, 3, i());
        c.a(parcel, 4, j());
        c.a(parcel, 5, k());
        c.a(parcel, 6, l());
        c.a(parcel, a2);
    }
}
