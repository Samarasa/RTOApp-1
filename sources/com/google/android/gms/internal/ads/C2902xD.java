package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xD  reason: case insensitive filesystem */
public final class C2902xD implements Xga<SD> {
    public static C2902xD a() {
        return C2831wD.f12606a;
    }

    public final /* synthetic */ Object get() {
        SD sd = new SD(Uoa.REQUEST_WILL_RENDER, Uoa.REQUEST_DID_RENDER, Uoa.REQUEST_FAILED_TO_RENDER);
        C1452cha.a(sd, "Cannot return null from a non-@Nullable @Provides method");
        return sd;
    }
}
