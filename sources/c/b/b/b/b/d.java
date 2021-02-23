package c.b.b.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0562s;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new p();

    /* renamed from: a  reason: collision with root package name */
    private final String f3875a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    private final int f3876b;

    /* renamed from: c  reason: collision with root package name */
    private final long f3877c;

    public d(String str, int i, long j) {
        this.f3875a = str;
        this.f3876b = i;
        this.f3877c = j;
    }

    public d(String str, long j) {
        this.f3875a = str;
        this.f3877c = j;
        this.f3876b = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return ((g() != null && g().equals(dVar.g())) || (g() == null && dVar.g() == null)) && h() == dVar.h();
        }
    }

    public String g() {
        return this.f3875a;
    }

    public long h() {
        long j = this.f3877c;
        return j == -1 ? (long) this.f3876b : j;
    }

    public int hashCode() {
        return C0562s.a(g(), Long.valueOf(h()));
    }

    public String toString() {
        C0562s.a a2 = C0562s.a((Object) this);
        a2.a("name", g());
        a2.a("version", Long.valueOf(h()));
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, g(), false);
        c.a(parcel, 2, this.f3876b);
        c.a(parcel, 3, h());
        c.a(parcel, a2);
    }
}
