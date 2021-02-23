package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

final class Ooa extends PushbackInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Noa f8151a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Ooa(Noa noa, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.f8151a = noa;
    }

    public final synchronized void close() {
        this.f8151a.f8026c.a();
        super.close();
    }
}
