package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.mG  reason: case insensitive filesystem */
final /* synthetic */ class C2125mG implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final LY f11281a;

    /* renamed from: b  reason: collision with root package name */
    private final LY f11282b;

    C2125mG(LY ly, LY ly2) {
        this.f11281a = ly;
        this.f11282b = ly2;
    }

    public final Object call() {
        LY ly = this.f11281a;
        LY ly2 = this.f11282b;
        return new AG((DG) ly.get(), ((C2905xG) ly2.get()).f12736b, ((C2905xG) ly2.get()).f12735a);
    }
}
