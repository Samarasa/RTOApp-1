package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.xF  reason: case insensitive filesystem */
final /* synthetic */ class C2904xF implements C2214nY {

    /* renamed from: a  reason: collision with root package name */
    static final C2214nY f12734a = new C2904xF();

    private C2904xF() {
    }

    public final LY a(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return DY.a((Throwable) new VE(C2351pT.NETWORK_ERROR, "Timed out waiting for ad response."));
    }
}
