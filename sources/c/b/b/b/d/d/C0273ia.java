package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.firebase.auth.J;
import com.google.firebase.auth.W;
import com.google.firebase.auth.internal.C3297m;
import java.util.List;

/* renamed from: c.b.b.b.d.d.ia  reason: case insensitive filesystem */
public final class C0273ia extends a {
    public static final Parcelable.Creator<C0273ia> CREATOR = new ka();

    /* renamed from: a  reason: collision with root package name */
    private String f4009a;

    /* renamed from: b  reason: collision with root package name */
    private List<ta> f4010b;

    /* renamed from: c  reason: collision with root package name */
    private J f4011c;

    public C0273ia(String str, List<ta> list, J j) {
        this.f4009a = str;
        this.f4010b = list;
        this.f4011c = j;
    }

    public final String a() {
        return this.f4009a;
    }

    public final J b() {
        return this.f4011c;
    }

    public final List<W> g() {
        return C3297m.a(this.f4010b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4009a, false);
        c.c(parcel, 2, this.f4010b, false);
        c.a(parcel, 3, (Parcelable) this.f4011c, i, false);
        c.a(parcel, a2);
    }
}
