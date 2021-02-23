package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fV  reason: case insensitive filesystem */
public final class C1644fV {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f10407a;

    /* renamed from: b  reason: collision with root package name */
    private final C1122Vk f10408b;

    public C1644fV(Executor executor, C1122Vk vk) {
        this.f10407a = executor;
        this.f10408b = vk;
    }

    public final void a(String str) {
        this.f10407a.execute(new C1927jV(this, str));
    }

    public final void a(List<String> list) {
        for (String a2 : list) {
            a(a2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str) {
        this.f10408b.a(str);
    }
}
