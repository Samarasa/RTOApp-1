package c.b.b.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.util.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Aa extends a {
    public static final Parcelable.Creator<Aa> CREATOR = new Ca();

    /* renamed from: a  reason: collision with root package name */
    private final int f3939a;

    /* renamed from: b  reason: collision with root package name */
    private List<String> f3940b;

    public Aa() {
        this((List<String>) null);
    }

    Aa(int i, List<String> list) {
        List<String> emptyList;
        this.f3939a = i;
        if (list == null || list.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.set(i2, q.a(list.get(i2)));
            }
            emptyList = Collections.unmodifiableList(list);
        }
        this.f3940b = emptyList;
    }

    private Aa(List<String> list) {
        this.f3939a = 1;
        this.f3940b = new ArrayList();
        if (list != null && !list.isEmpty()) {
            this.f3940b.addAll(list);
        }
    }

    public static Aa a(Aa aa) {
        return new Aa(aa != null ? aa.f3940b : null);
    }

    public static Aa b() {
        return new Aa((List<String>) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3939a);
        c.b(parcel, 2, this.f3940b, false);
        c.a(parcel, a2);
    }
}
