package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vD  reason: case insensitive filesystem */
public final class C2760vD implements Xga<SD> {
    public static C2760vD a() {
        return C2689uD.f12299a;
    }

    public final /* synthetic */ Object get() {
        SD sd = new SD(Uoa.REQUEST_WILL_UPDATE_SIGNALS, Uoa.REQUEST_DID_UPDATE_SIGNALS, Uoa.REQUEST_FAILED_TO_UPDATE_SIGNALS);
        C1452cha.a(sd, "Cannot return null from a non-@Nullable @Provides method");
        return sd;
    }
}
