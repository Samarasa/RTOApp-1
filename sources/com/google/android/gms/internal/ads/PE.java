package com.google.android.gms.internal.ads;

final /* synthetic */ class PE implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final RE f8183a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8184b;

    PE(RE re, String str) {
        this.f8183a = re;
        this.f8184b = str;
    }

    public final void run() {
        RE re = this.f8183a;
        re.f8451a.a(this.f8184b);
    }
}
