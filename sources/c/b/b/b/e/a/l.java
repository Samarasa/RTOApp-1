package c.b.b.b.e.a;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c.b.b.b.b.C0254b;
import com.google.android.gms.common.internal.C0565v;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    private final int f4675a;

    /* renamed from: b  reason: collision with root package name */
    private final C0254b f4676b;

    /* renamed from: c  reason: collision with root package name */
    private final C0565v f4677c;

    public l(int i) {
        this(new C0254b(8, (PendingIntent) null), (C0565v) null);
    }

    l(int i, C0254b bVar, C0565v vVar) {
        this.f4675a = i;
        this.f4676b = bVar;
        this.f4677c = vVar;
    }

    private l(C0254b bVar, C0565v vVar) {
        this(1, bVar, (C0565v) null);
    }

    public final C0254b g() {
        return this.f4676b;
    }

    public final C0565v h() {
        return this.f4677c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4675a);
        c.a(parcel, 2, (Parcelable) this.f4676b, i, false);
        c.a(parcel, 3, (Parcelable) this.f4677c, i, false);
        c.a(parcel, a2);
    }
}
