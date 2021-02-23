package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.uc  reason: case insensitive filesystem */
final class C3224uc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f13787a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f13788b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f13789c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f13790d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C3150gc f13791e;

    C3224uc(C3150gc gcVar, String str, String str2, String str3, long j) {
        this.f13791e = gcVar;
        this.f13787a = str;
        this.f13788b = str2;
        this.f13789c = str3;
        this.f13790d = j;
    }

    public final void run() {
        String str = this.f13787a;
        if (str == null) {
            this.f13791e.f13582a.t().D().a(this.f13788b, (C3175kd) null);
            return;
        }
        this.f13791e.f13582a.t().D().a(this.f13788b, new C3175kd(this.f13789c, str, this.f13790d));
    }
}
