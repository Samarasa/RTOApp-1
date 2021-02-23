package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oO  reason: case insensitive filesystem */
final /* synthetic */ class C2275oO implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final List f11584a;

    C2275oO(List list) {
        this.f11584a = list;
    }

    public final Object call() {
        List<LY> list = this.f11584a;
        JSONArray jSONArray = new JSONArray();
        for (LY ly : list) {
            if (((JSONObject) ly.get()) != null) {
                jSONArray.put(ly.get());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return new C2062lO(jSONArray.toString());
    }
}
