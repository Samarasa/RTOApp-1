package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import c.b.b.b.c.b;

final class Mqa extends Nqa<C2360pb> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ FrameLayout f7915b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FrameLayout f7916c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Context f7917d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Aqa f7918e;

    Mqa(Aqa aqa, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f7918e = aqa;
        this.f7915b = frameLayout;
        this.f7916c = frameLayout2;
        this.f7917d = context;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a() {
        Aqa.b(this.f7917d, "native_ad_view_delegate");
        return new usa();
    }

    public final /* synthetic */ Object a(C2393pra pra) {
        return pra.d(b.a(this.f7915b), b.a(this.f7916c));
    }

    public final /* synthetic */ Object b() {
        return this.f7918e.f6206d.a(this.f7917d, this.f7915b, this.f7916c);
    }
}
