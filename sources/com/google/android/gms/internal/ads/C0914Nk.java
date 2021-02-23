package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Nk  reason: case insensitive filesystem */
final /* synthetic */ class C0914Nk implements C1044Sk {

    /* renamed from: a  reason: collision with root package name */
    private final String f7999a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8000b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f8001c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f8002d;

    C0914Nk(String str, String str2, Map map, byte[] bArr) {
        this.f7999a = str;
        this.f8000b = str2;
        this.f8001c = map;
        this.f8002d = bArr;
    }

    public final void a(JsonWriter jsonWriter) {
        C0836Kk.a(this.f7999a, this.f8000b, this.f8001c, this.f8002d, jsonWriter);
    }
}
