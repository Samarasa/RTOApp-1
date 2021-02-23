package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.J;

/* renamed from: c.b.b.b.d.d.ha  reason: case insensitive filesystem */
public final class C0271ha extends a {
    public static final Parcelable.Creator<C0271ha> CREATOR = new ja();

    /* renamed from: a  reason: collision with root package name */
    private final Status f4004a;

    /* renamed from: b  reason: collision with root package name */
    private final J f4005b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4006c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4007d;

    public C0271ha(Status status, J j, String str, String str2) {
        this.f4004a = status;
        this.f4005b = j;
        this.f4006c = str;
        this.f4007d = str2;
    }

    public final Status a() {
        return this.f4004a;
    }

    public final J b() {
        return this.f4005b;
    }

    public final String g() {
        return this.f4006c;
    }

    public final String h() {
        return this.f4007d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, (Parcelable) this.f4004a, i, false);
        c.a(parcel, 2, (Parcelable) this.f4005b, i, false);
        c.a(parcel, 3, this.f4006c, false);
        c.a(parcel, 4, this.f4007d, false);
        c.a(parcel, a2);
    }
}
