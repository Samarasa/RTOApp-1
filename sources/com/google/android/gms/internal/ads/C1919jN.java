package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.ha;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.jN  reason: case insensitive filesystem */
public final class C1919jN implements Xga<C1636fN> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2651tf> f10911a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f10912b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<ha> f10913c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<ApplicationInfo> f10914d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<SS> f10915e;

    private C1919jN(C1876iha<C2651tf> iha, C1876iha<ScheduledExecutorService> iha2, C1876iha<ha> iha3, C1876iha<ApplicationInfo> iha4, C1876iha<SS> iha5) {
        this.f10911a = iha;
        this.f10912b = iha2;
        this.f10913c = iha3;
        this.f10914d = iha4;
        this.f10915e = iha5;
    }

    public static C1919jN a(C1876iha<C2651tf> iha, C1876iha<ScheduledExecutorService> iha2, C1876iha<ha> iha3, C1876iha<ApplicationInfo> iha4, C1876iha<SS> iha5) {
        return new C1919jN(iha, iha2, iha3, iha4, iha5);
    }

    public final /* synthetic */ Object get() {
        return new C1636fN(this.f10911a.get(), this.f10912b.get(), this.f10913c.get(), this.f10914d.get(), this.f10915e.get());
    }
}
