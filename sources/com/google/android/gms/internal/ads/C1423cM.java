package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.cM  reason: case insensitive filesystem */
public final class C1423cM implements JO<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final LY<String> f10020a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f10021b;

    public C1423cM(LY<String> ly, Executor executor) {
        this.f10020a = ly;
        this.f10021b = executor;
    }

    public final LY<Object> a() {
        return DY.a(this.f10020a, C1635fM.f10386a, this.f10021b);
    }
}
