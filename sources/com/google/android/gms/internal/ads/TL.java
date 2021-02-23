package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.util.List;

public final class TL implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8768a;

    /* renamed from: b  reason: collision with root package name */
    private final C2462qqa f8769b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Parcelable> f8770c;

    public TL(Context context, C2462qqa qqa, List<Parcelable> list) {
        this.f8768a = context;
        this.f8769b = qqa;
        this.f8770c = list;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (C0722Ga.f7041a.a().booleanValue()) {
            Bundle bundle2 = new Bundle();
            p.c();
            bundle2.putString("activity", oa.f(this.f8768a));
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.f8769b.f11918e);
            bundle3.putInt("height", this.f8769b.f11915b);
            bundle2.putBundle("size", bundle3);
            if (this.f8770c.size() > 0) {
                List<Parcelable> list = this.f8770c;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
