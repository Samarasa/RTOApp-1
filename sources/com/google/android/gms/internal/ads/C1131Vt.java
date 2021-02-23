package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Vt  reason: case insensitive filesystem */
final class C1131Vt implements C0950Ou, C1900iv {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9094a;

    /* renamed from: b  reason: collision with root package name */
    private final C2988yS f9095b;

    /* renamed from: c  reason: collision with root package name */
    private final C0651Dh f9096c;

    public C1131Vt(Context context, C2988yS ySVar, C0651Dh dh) {
        this.f9094a = context;
        this.f9095b = ySVar;
        this.f9096c = dh;
    }

    public final void H() {
        C0599Bh bh = this.f9095b.Y;
        if (bh != null && bh.f6336a) {
            ArrayList arrayList = new ArrayList();
            if (!this.f9095b.Y.f6337b.isEmpty()) {
                arrayList.add(this.f9095b.Y.f6337b);
            }
            this.f9096c.a(this.f9094a, arrayList);
        }
    }

    public final void b(Context context) {
    }

    public final void c(Context context) {
        this.f9096c.a();
    }

    public final void d(Context context) {
    }
}
