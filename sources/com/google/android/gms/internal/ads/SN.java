package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import java.util.Set;

public final class SN implements JO<TN> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f8604a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f8605b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f8606c;

    public SN(PY py, Context context, Set<String> set) {
        this.f8604a = py;
        this.f8605b = context;
        this.f8606c = set;
    }

    public final LY<TN> a() {
        return this.f8604a.a(new VN(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ TN b() {
        return (!((Boolean) Qqa.e().a(F.od)).booleanValue() || !TN.b(this.f8606c)) ? new TN((String) null) : new TN(p.r().a(this.f8605b));
    }
}
