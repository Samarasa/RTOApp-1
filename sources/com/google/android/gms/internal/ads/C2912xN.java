package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.xN  reason: case insensitive filesystem */
public final class C2912xN implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f12756a;

    public C2912xN(Boolean bool) {
        this.f12756a = bool;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.f12756a;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
