package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final /* synthetic */ class AF implements C2214nY {

    /* renamed from: a  reason: collision with root package name */
    static final C2214nY f6090a = new AF();

    private AF() {
    }

    public final LY a(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return DY.a((Throwable) new VE(C2351pT.NETWORK_ERROR));
    }
}
