package c.b.b.b.d.f;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class Tf extends a {
    public static final Parcelable.Creator<Tf> CREATOR = new Wf();

    /* renamed from: a  reason: collision with root package name */
    public final long f4293a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4294b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4295c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4296d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4297e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4298f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f4299g;

    public Tf(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f4293a = j;
        this.f4294b = j2;
        this.f4295c = z;
        this.f4296d = str;
        this.f4297e = str2;
        this.f4298f = str3;
        this.f4299g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4293a);
        c.a(parcel, 2, this.f4294b);
        c.a(parcel, 3, this.f4295c);
        c.a(parcel, 4, this.f4296d, false);
        c.a(parcel, 5, this.f4297e, false);
        c.a(parcel, 6, this.f4298f, false);
        c.a(parcel, 7, this.f4299g, false);
        c.a(parcel, a2);
    }
}
