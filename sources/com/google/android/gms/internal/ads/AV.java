package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.MV;
import com.google.android.gms.internal.ads.QV;

public final class AV {

    /* renamed from: a  reason: collision with root package name */
    private final Context f6119a;

    /* renamed from: b  reason: collision with root package name */
    private final Looper f6120b;

    public AV(Context context, Looper looper) {
        this.f6119a = context;
        this.f6120b = looper;
    }

    public final void a(String str) {
        QV.a o = QV.o();
        o.a(this.f6119a.getPackageName());
        o.a(QV.b.BLOCKED_IMPRESSION);
        MV.b o2 = MV.o();
        o2.a(str);
        o2.a(MV.a.BLOCKED_REASON_BACKGROUND);
        o.a(o2);
        new DV(this.f6119a, this.f6120b, (QV) o.k()).a();
    }
}
