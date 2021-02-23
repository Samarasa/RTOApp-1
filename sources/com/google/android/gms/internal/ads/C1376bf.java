package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bf  reason: case insensitive filesystem */
public final class C1376bf {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f9932a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final C1447cf<JSONObject> f9933b = new C1518df();

    /* renamed from: c  reason: collision with root package name */
    public static final C1305af<InputStream> f9934c = C1588ef.f10286a;

    static final /* synthetic */ InputStream a(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f9932a));
    }
}
