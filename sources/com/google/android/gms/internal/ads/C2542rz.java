package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rz  reason: case insensitive filesystem */
public final class C2542rz implements Xga<C1085Tz> {

    /* renamed from: a  reason: collision with root package name */
    private final C2259nz f12056a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1834hz> f12057b;

    public C2542rz(C2259nz nzVar, C1876iha<C1834hz> iha) {
        this.f12056a = nzVar;
        this.f12057b = iha;
    }

    public final /* synthetic */ Object get() {
        C1834hz hzVar = this.f12057b.get();
        C1452cha.a(hzVar, "Cannot return null from a non-@Nullable @Provides method");
        return hzVar;
    }
}
