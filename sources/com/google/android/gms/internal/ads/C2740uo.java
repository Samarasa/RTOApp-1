package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.uo  reason: case insensitive filesystem */
final class C2740uo extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f12414a;

    C2740uo(HttpURLConnection httpURLConnection) {
        super(C1072Tm.b(httpURLConnection));
        this.f12414a = httpURLConnection;
    }

    public final void close() {
        super.close();
        this.f12414a.disconnect();
    }
}
