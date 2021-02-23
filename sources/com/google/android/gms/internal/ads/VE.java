package com.google.android.gms.internal.ads;

public class VE extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final C2351pT f9012a;

    public VE(C2351pT pTVar) {
        this.f9012a = pTVar;
    }

    public VE(C2351pT pTVar, String str) {
        super(str);
        this.f9012a = pTVar;
    }

    public VE(C2351pT pTVar, String str, Throwable th) {
        super(str, th);
        this.f9012a = pTVar;
    }

    public final C2351pT a() {
        return this.f9012a;
    }
}
