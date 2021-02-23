package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Hi  reason: case insensitive filesystem */
public final class C0756Hi implements C2799vi {

    /* renamed from: a  reason: collision with root package name */
    private C1220Ze<JSONObject, JSONObject> f7175a;

    /* renamed from: b  reason: collision with root package name */
    private C1220Ze<JSONObject, JSONObject> f7176b;

    public C0756Hi(Context context) {
        C1730gf a2 = p.p().a(context, C1200Yk.g());
        C1447cf<JSONObject> cfVar = C1376bf.f9933b;
        this.f7175a = a2.a("google.afma.request.getAdDictionary", cfVar, cfVar);
        C1730gf a3 = p.p().a(context, C1200Yk.g());
        C1447cf<JSONObject> cfVar2 = C1376bf.f9933b;
        this.f7176b = a3.a("google.afma.sdkConstants.getSdkConstants", cfVar2, cfVar2);
    }

    public final C1220Ze<JSONObject, JSONObject> a() {
        return this.f7176b;
    }
}
