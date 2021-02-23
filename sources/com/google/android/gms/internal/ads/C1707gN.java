package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.gN  reason: case insensitive filesystem */
public final class C1707gN implements KO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Location f10536a;

    public C1707gN(Location location) {
        this.f10536a = location;
    }

    public final /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f10536a != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", this.f10536a.getAccuracy() * 1000.0f);
            bundle2.putLong("lat", (long) (this.f10536a.getLatitude() * 1.0E7d));
            bundle2.putLong("long", (long) (this.f10536a.getLongitude() * 1.0E7d));
            bundle2.putLong("time", this.f10536a.getTime() * 1000);
            bundle.putBundle("uule", bundle2);
        }
    }
}
