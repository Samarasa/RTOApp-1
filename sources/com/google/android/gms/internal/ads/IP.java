package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

public final class IP implements Xga<GP> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C2651tf> f7281a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<ScheduledExecutorService> f7282b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<Boolean> f7283c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<ApplicationInfo> f7284d;

    public IP(C1876iha<C2651tf> iha, C1876iha<ScheduledExecutorService> iha2, C1876iha<Boolean> iha3, C1876iha<ApplicationInfo> iha4) {
        this.f7281a = iha;
        this.f7282b = iha2;
        this.f7283c = iha3;
        this.f7284d = iha4;
    }

    public final /* synthetic */ Object get() {
        return new GP(this.f7281a.get(), this.f7282b.get(), this.f7283c.get().booleanValue(), this.f7284d.get());
    }
}
