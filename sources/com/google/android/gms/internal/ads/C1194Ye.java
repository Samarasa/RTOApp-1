package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ye  reason: case insensitive filesystem */
public final class C1194Ye {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9422a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Object f9423b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private C1730gf f9424c;

    /* renamed from: d  reason: collision with root package name */
    private C1730gf f9425d;

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final C1730gf a(Context context, C1200Yk yk) {
        C1730gf gfVar;
        synchronized (this.f9423b) {
            if (this.f9425d == null) {
                this.f9425d = new C1730gf(a(context), yk, C0878Ma.f7862b.a());
            }
            gfVar = this.f9425d;
        }
        return gfVar;
    }

    public final C1730gf b(Context context, C1200Yk yk) {
        C1730gf gfVar;
        synchronized (this.f9422a) {
            if (this.f9424c == null) {
                this.f9424c = new C1730gf(a(context), yk, (String) Qqa.e().a(F.f6786a));
            }
            gfVar = this.f9424c;
        }
        return gfVar;
    }
}
