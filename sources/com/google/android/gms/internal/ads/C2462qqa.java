package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.y;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

/* renamed from: com.google.android.gms.internal.ads.qqa  reason: case insensitive filesystem */
public class C2462qqa extends a {
    public static final Parcelable.Creator<C2462qqa> CREATOR = new C2674tqa();

    /* renamed from: a  reason: collision with root package name */
    public final String f11914a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11915b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11916c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11917d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11918e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11919f;

    /* renamed from: g  reason: collision with root package name */
    public final C2462qqa[] f11920g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11921h;
    public final boolean i;
    public boolean j;
    public boolean k;
    private boolean l;
    public boolean m;
    public boolean n;

    public C2462qqa() {
        this("interstitial_mb", 0, 0, true, 0, 0, (C2462qqa[]) null, false, false, false, false, false, false, false);
    }

    public C2462qqa(Context context, f fVar) {
        this(context, new f[]{fVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2462qqa(android.content.Context r13, com.google.android.gms.ads.f[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.f11917d = r0
            boolean r2 = r1.c()
            r12.i = r2
            boolean r2 = com.google.android.gms.ads.y.a(r1)
            r12.m = r2
            boolean r2 = com.google.android.gms.ads.y.b(r1)
            r12.n = r2
            boolean r2 = r12.i
            if (r2 == 0) goto L_0x002f
            com.google.android.gms.ads.f r2 = com.google.android.gms.ads.f.f5383a
            int r2 = r2.b()
            r12.f11918e = r2
            com.google.android.gms.ads.f r2 = com.google.android.gms.ads.f.f5383a
            int r2 = r2.a()
        L_0x002c:
            r12.f11915b = r2
            goto L_0x0049
        L_0x002f:
            boolean r2 = r12.n
            if (r2 == 0) goto L_0x003e
            int r2 = r1.b()
            r12.f11918e = r2
            int r2 = com.google.android.gms.ads.y.c(r1)
            goto L_0x002c
        L_0x003e:
            int r2 = r1.b()
            r12.f11918e = r2
            int r2 = r1.a()
            goto L_0x002c
        L_0x0049:
            int r2 = r12.f11918e
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0051
            r2 = 1
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            int r3 = r12.f11915b
            r5 = -2
            if (r3 != r5) goto L_0x0059
            r3 = 1
            goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x00a1
            com.google.android.gms.internal.ads.Qqa.a()
            boolean r6 = com.google.android.gms.internal.ads.C0758Hk.d(r13)
            if (r6 == 0) goto L_0x0081
            com.google.android.gms.internal.ads.Qqa.a()
            boolean r6 = com.google.android.gms.internal.ads.C0758Hk.e(r13)
            if (r6 == 0) goto L_0x0081
            int r6 = r5.widthPixels
            com.google.android.gms.internal.ads.Qqa.a()
            int r7 = com.google.android.gms.internal.ads.C0758Hk.f(r13)
            int r6 = r6 - r7
            goto L_0x0083
        L_0x0081:
            int r6 = r5.widthPixels
        L_0x0083:
            r12.f11919f = r6
            int r6 = r12.f11919f
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r9)
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00ae
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00a1:
            int r8 = r12.f11918e
            com.google.android.gms.internal.ads.Qqa.a()
            int r6 = r12.f11918e
            int r6 = com.google.android.gms.internal.ads.C0758Hk.a((android.util.DisplayMetrics) r5, (int) r6)
            r12.f11919f = r6
        L_0x00ae:
            if (r3 == 0) goto L_0x00b5
            int r6 = c(r5)
            goto L_0x00b7
        L_0x00b5:
            int r6 = r12.f11915b
        L_0x00b7:
            com.google.android.gms.internal.ads.Qqa.a()
            int r5 = com.google.android.gms.internal.ads.C0758Hk.a((android.util.DisplayMetrics) r5, (int) r6)
            r12.f11916c = r5
            java.lang.String r5 = "_as"
            java.lang.String r7 = "x"
            r9 = 26
            if (r2 != 0) goto L_0x00f5
            if (r3 == 0) goto L_0x00cb
            goto L_0x00f5
        L_0x00cb:
            boolean r2 = r12.n
            if (r2 == 0) goto L_0x00e9
            int r1 = r12.f11918e
            int r2 = r12.f11915b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r9)
            r3.append(r1)
            r3.append(r7)
            r3.append(r2)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            goto L_0x010a
        L_0x00e9:
            boolean r2 = r12.i
            if (r2 == 0) goto L_0x00f0
            java.lang.String r1 = "320x50_mb"
            goto L_0x010a
        L_0x00f0:
            java.lang.String r1 = r1.toString()
            goto L_0x010a
        L_0x00f5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r8)
            r1.append(r7)
            r1.append(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
        L_0x010a:
            r12.f11914a = r1
            int r1 = r14.length
            if (r1 <= r4) goto L_0x0126
            int r1 = r14.length
            com.google.android.gms.internal.ads.qqa[] r1 = new com.google.android.gms.internal.ads.C2462qqa[r1]
            r12.f11920g = r1
            r1 = 0
        L_0x0115:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x0129
            com.google.android.gms.internal.ads.qqa[] r2 = r12.f11920g
            com.google.android.gms.internal.ads.qqa r3 = new com.google.android.gms.internal.ads.qqa
            r4 = r14[r1]
            r3.<init>((android.content.Context) r13, (com.google.android.gms.ads.f) r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x0115
        L_0x0126:
            r13 = 0
            r12.f11920g = r13
        L_0x0129:
            r12.f11921h = r0
            r12.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2462qqa.<init>(android.content.Context, com.google.android.gms.ads.f[]):void");
    }

    C2462qqa(String str, int i2, int i3, boolean z, int i4, int i5, C2462qqa[] qqaArr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f11914a = str;
        this.f11915b = i2;
        this.f11916c = i3;
        this.f11917d = z;
        this.f11918e = i4;
        this.f11919f = i5;
        this.f11920g = qqaArr;
        this.f11921h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = z8;
    }

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int) (((float) c(displayMetrics)) * displayMetrics.density);
    }

    private static int c(DisplayMetrics displayMetrics) {
        int i2 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i2 <= 400) {
            return 32;
        }
        return i2 <= 720 ? 50 : 90;
    }

    public static C2462qqa g() {
        return new C2462qqa("320x50_mb", 0, 0, false, 0, 0, (C2462qqa[]) null, true, false, false, false, false, false, false);
    }

    public static C2462qqa h() {
        return new C2462qqa("reward_mb", 0, 0, true, 0, 0, (C2462qqa[]) null, false, false, false, false, false, false, false);
    }

    public static C2462qqa i() {
        return new C2462qqa("interstitial_mb", 0, 0, false, 0, 0, (C2462qqa[]) null, false, false, false, false, true, false, false);
    }

    public static C2462qqa j() {
        return new C2462qqa("invalid", 0, 0, false, 0, 0, (C2462qqa[]) null, false, false, false, true, false, false, false);
    }

    public final f k() {
        return y.a(this.f11918e, this.f11915b, this.f11914a);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f11914a, false);
        c.a(parcel, 3, this.f11915b);
        c.a(parcel, 4, this.f11916c);
        c.a(parcel, 5, this.f11917d);
        c.a(parcel, 6, this.f11918e);
        c.a(parcel, 7, this.f11919f);
        c.a(parcel, 8, (T[]) this.f11920g, i2, false);
        c.a(parcel, 9, this.f11921h);
        c.a(parcel, 10, this.i);
        c.a(parcel, 11, this.j);
        c.a(parcel, 12, this.k);
        c.a(parcel, 13, this.l);
        c.a(parcel, 14, this.m);
        c.a(parcel, 15, this.n);
        c.a(parcel, a2);
    }
}
