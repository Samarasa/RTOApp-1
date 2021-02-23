package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pz  reason: case insensitive filesystem */
public final class C2401pz implements Xga<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final C2259nz f11807a;

    public C2401pz(C2259nz nzVar) {
        this.f11807a = nzVar;
    }

    public final /* synthetic */ Object get() {
        JSONObject a2 = this.f11807a.a();
        C1452cha.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
