package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pB  reason: case insensitive filesystem */
public final class C2333pB {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11675a;

    /* renamed from: b  reason: collision with root package name */
    private final _A f11676b;

    public C2333pB(Executor executor, _A _a) {
        this.f11675a = executor;
        this.f11676b = _a;
    }

    public final LY<List<C2404qB>> a(JSONObject jSONObject, String str) {
        LY<O> ly;
        String optString;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return DY.a(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (optString = optJSONObject.optString("name")) == null)) {
                String optString2 = optJSONObject.optString("type");
                char c2 = "string".equals(optString2) ? 1 : "image".equals(optString2) ? (char) 2 : 0;
                if (c2 == 1) {
                    ly = DY.a(new C2404qB(optString, optJSONObject.optString("string_value")));
                } else if (c2 == 2) {
                    ly = DY.a(this.f11676b.a(optJSONObject, "image_value"), new C2474rB(optString), this.f11675a);
                }
                arrayList.add(ly);
            }
            ly = DY.a(null);
            arrayList.add(ly);
        }
        return DY.a(DY.a(arrayList), C2262oB.f11559a, this.f11675a);
    }
}
