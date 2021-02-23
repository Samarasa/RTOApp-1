package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

final class me implements Ib {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f13679a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C3176ke f13680b;

    me(C3176ke keVar, String str) {
        this.f13680b = keVar;
        this.f13679a = str;
    }

    public final void a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f13680b.a(i, th, bArr, this.f13679a);
    }
}
