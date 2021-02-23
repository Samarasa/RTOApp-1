package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.Yk  reason: case insensitive filesystem */
public final class C1200Yk extends a {
    public static final Parcelable.Creator<C1200Yk> CREATOR = new C1174Xk();

    /* renamed from: a  reason: collision with root package name */
    public String f9456a;

    /* renamed from: b  reason: collision with root package name */
    public int f9457b;

    /* renamed from: c  reason: collision with root package name */
    public int f9458c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9459d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9460e;

    public C1200Yk(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public C1200Yk(int i, int i2, boolean z, boolean z2) {
        this(203404000, i2, true, false, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C1200Yk(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x0005
            java.lang.String r11 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r11 = "1"
        L_0x0007:
            int r12 = r11.length()
            int r12 = r12 + 36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "afma-sdk-a-v"
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = "."
            r0.append(r12)
            r0.append(r9)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>((java.lang.String) r2, (int) r3, (int) r4, (boolean) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1200Yk.<init>(int, int, boolean, boolean, boolean):void");
    }

    C1200Yk(String str, int i, int i2, boolean z, boolean z2) {
        this.f9456a = str;
        this.f9457b = i;
        this.f9458c = i2;
        this.f9459d = z;
        this.f9460e = z2;
    }

    public static C1200Yk g() {
        return new C1200Yk(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f9456a, false);
        c.a(parcel, 3, this.f9457b);
        c.a(parcel, 4, this.f9458c);
        c.a(parcel, 5, this.f9459d);
        c.a(parcel, 6, this.f9460e);
        c.a(parcel, a2);
    }
}
