package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.a.a.Q;
import java.util.List;

public final class la extends a implements Q<la, Object> {
    public static final Parcelable.Creator<la> CREATOR = new ma();

    /* renamed from: a  reason: collision with root package name */
    private String f4016a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4017b;

    /* renamed from: c  reason: collision with root package name */
    private String f4018c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4019d;

    /* renamed from: e  reason: collision with root package name */
    private Aa f4020e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f4021f;

    public la() {
        this.f4020e = Aa.b();
    }

    public la(String str, boolean z, String str2, boolean z2, Aa aa, List<String> list) {
        this.f4016a = str;
        this.f4017b = z;
        this.f4018c = str2;
        this.f4019d = z2;
        this.f4020e = aa == null ? Aa.b() : Aa.a(aa);
        this.f4021f = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f4016a, false);
        c.a(parcel, 3, this.f4017b);
        c.a(parcel, 4, this.f4018c, false);
        c.a(parcel, 5, this.f4019d);
        c.a(parcel, 6, (Parcelable) this.f4020e, i, false);
        c.b(parcel, 7, this.f4021f, false);
        c.a(parcel, a2);
    }
}
