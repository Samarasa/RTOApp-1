package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.m;
import com.google.android.gms.ads.internal.overlay.q;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Ss  reason: case insensitive filesystem */
public final class C1052Ss implements q {

    /* renamed from: a  reason: collision with root package name */
    private final C1080Tu f8702a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicBoolean f8703b = new AtomicBoolean(false);

    public C1052Ss(C1080Tu tu) {
        this.f8702a = tu;
    }

    public final void J() {
    }

    public final void Tb() {
        this.f8702a.Z();
    }

    public final void a(m mVar) {
        this.f8703b.set(true);
        this.f8702a.X();
    }

    public final boolean a() {
        return this.f8703b.get();
    }

    public final void onPause() {
    }

    public final void onResume() {
    }
}
