package com.google.android.gms.internal.ads;

public final class MA implements Xga<C1085Tz> {

    /* renamed from: a  reason: collision with root package name */
    private final JA f7795a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<GA> f7796b;

    public MA(JA ja, C1876iha<GA> iha) {
        this.f7795a = ja;
        this.f7796b = iha;
    }

    public final /* synthetic */ Object get() {
        GA ga = this.f7796b.get();
        C1452cha.a(ga, "Cannot return null from a non-@Nullable @Provides method");
        return ga;
    }
}
