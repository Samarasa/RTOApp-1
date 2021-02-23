package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.ads.pi  reason: case insensitive filesystem */
final /* synthetic */ class C2374pi implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f11741a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f11742b;

    C2374pi(OutputStream outputStream, byte[] bArr) {
        this.f11741a = outputStream;
        this.f11742b = bArr;
    }

    public final void run() {
        C2161mi.a(this.f11741a, this.f11742b);
    }
}
