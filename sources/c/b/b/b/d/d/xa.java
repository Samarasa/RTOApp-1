package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class xa extends a {
    public static final Parcelable.Creator<xa> CREATOR = new wa();

    /* renamed from: a  reason: collision with root package name */
    private List<va> f4061a;

    public xa() {
        this.f4061a = new ArrayList();
    }

    xa(List<va> list) {
        this.f4061a = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public static xa a(xa xaVar) {
        List<va> list = xaVar.f4061a;
        xa xaVar2 = new xa();
        if (list != null) {
            xaVar2.f4061a.addAll(list);
        }
        return xaVar2;
    }

    public final List<va> a() {
        return this.f4061a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.c(parcel, 2, this.f4061a, false);
        c.a(parcel, a2);
    }
}
