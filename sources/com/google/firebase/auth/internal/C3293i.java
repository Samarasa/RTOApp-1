package com.google.firebase.auth.internal;

/* renamed from: com.google.firebase.auth.internal.i  reason: case insensitive filesystem */
final class C3293i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ FederatedSignInActivity f14384a;

    C3293i(FederatedSignInActivity federatedSignInActivity) {
        this.f14384a = federatedSignInActivity;
    }

    public final void run() {
        this.f14384a.a();
        Runnable unused = FederatedSignInActivity.f14357d = null;
    }
}
