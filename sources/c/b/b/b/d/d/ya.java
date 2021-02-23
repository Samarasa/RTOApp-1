package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.a.a.Q;

public final class ya extends a implements Q<ya, Object> {
    public static final Parcelable.Creator<ya> CREATOR = new za();

    /* renamed from: a  reason: collision with root package name */
    private String f4065a;

    /* renamed from: b  reason: collision with root package name */
    private String f4066b;

    /* renamed from: c  reason: collision with root package name */
    private String f4067c;

    /* renamed from: d  reason: collision with root package name */
    private ta f4068d;

    public ya() {
    }

    ya(String str, String str2, String str3, ta taVar) {
        this.f4065a = str;
        this.f4066b = str2;
        this.f4067c = str3;
        this.f4068d = taVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f4065a, false);
        c.a(parcel, 3, this.f4066b, false);
        c.a(parcel, 4, this.f4067c, false);
        c.a(parcel, 5, (Parcelable) this.f4068d, i, false);
        c.a(parcel, a2);
    }
}
