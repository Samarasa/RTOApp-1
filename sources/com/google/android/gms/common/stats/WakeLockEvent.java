package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.a.c;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new f();

    /* renamed from: a  reason: collision with root package name */
    private final int f6008a;

    /* renamed from: b  reason: collision with root package name */
    private final long f6009b;

    /* renamed from: c  reason: collision with root package name */
    private int f6010c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6011d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6012e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6013f;

    /* renamed from: g  reason: collision with root package name */
    private final int f6014g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f6015h;
    private final String i;
    private final long j;
    private int k;
    private final String l;
    private final float m;
    private final long n;
    private final boolean o;
    private long p;

    WakeLockEvent(int i2, long j2, int i3, String str, int i4, List<String> list, String str2, long j3, int i5, String str3, String str4, float f2, long j4, String str5, boolean z) {
        this.f6008a = i2;
        this.f6009b = j2;
        this.f6010c = i3;
        this.f6011d = str;
        this.f6012e = str3;
        this.f6013f = str5;
        this.f6014g = i4;
        this.p = -1;
        this.f6015h = list;
        this.i = str2;
        this.j = j3;
        this.k = i5;
        this.l = str4;
        this.m = f2;
        this.n = j4;
        this.o = z;
    }

    public WakeLockEvent(long j2, int i2, String str, int i3, List<String> list, String str2, long j3, int i4, String str3, String str4, float f2, long j4, String str5, boolean z) {
        this(2, j2, i2, str, i3, list, str2, j3, i4, str3, str4, f2, j4, str5, z);
    }

    public final long a() {
        return this.f6009b;
    }

    public final int b() {
        return this.f6010c;
    }

    public final long g() {
        return this.p;
    }

    public final String h() {
        String str = this.f6011d;
        int i2 = this.f6014g;
        List<String> list = this.f6015h;
        String str2 = BuildConfig.FLAVOR;
        String join = list == null ? str2 : TextUtils.join(",", list);
        int i3 = this.k;
        String str3 = this.f6012e;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.l;
        if (str4 == null) {
            str4 = str2;
        }
        float f2 = this.m;
        String str5 = this.f6013f;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.o;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(join).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str2).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(join);
        sb.append("\t");
        sb.append(i3);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(f2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f6008a);
        c.a(parcel, 2, a());
        c.a(parcel, 4, this.f6011d, false);
        c.a(parcel, 5, this.f6014g);
        c.b(parcel, 6, this.f6015h, false);
        c.a(parcel, 8, this.j);
        c.a(parcel, 10, this.f6012e, false);
        c.a(parcel, 11, b());
        c.a(parcel, 12, this.i, false);
        c.a(parcel, 13, this.l, false);
        c.a(parcel, 14, this.k);
        c.a(parcel, 15, this.m);
        c.a(parcel, 16, this.n);
        c.a(parcel, 17, this.f6013f, false);
        c.a(parcel, 18, this.o);
        c.a(parcel, a2);
    }
}
