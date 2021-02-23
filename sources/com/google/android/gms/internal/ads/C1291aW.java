package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.aW  reason: case insensitive filesystem */
public final class C1291aW extends a {
    public static final Parcelable.Creator<C1291aW> CREATOR = new C1504dW();

    /* renamed from: a  reason: collision with root package name */
    private final int f9796a;

    /* renamed from: b  reason: collision with root package name */
    private C1766hB f9797b = null;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f9798c;

    C1291aW(int i, byte[] bArr) {
        this.f9796a = i;
        this.f9798c = bArr;
        h();
    }

    private final void h() {
        if (this.f9797b == null && this.f9798c != null) {
            return;
        }
        if (this.f9797b != null && this.f9798c == null) {
            return;
        }
        if (this.f9797b != null && this.f9798c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.f9797b == null && this.f9798c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public final C1766hB g() {
        if (!(this.f9797b != null)) {
            try {
                this.f9797b = C1766hB.a(this.f9798c, C2012kea.b());
                this.f9798c = null;
            } catch (Iea e2) {
                throw new IllegalStateException(e2);
            }
        }
        h();
        return this.f9797b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f9796a);
        byte[] bArr = this.f9798c;
        if (bArr == null) {
            bArr = this.f9797b.f();
        }
        c.a(parcel, 2, bArr, false);
        c.a(parcel, a2);
    }
}
