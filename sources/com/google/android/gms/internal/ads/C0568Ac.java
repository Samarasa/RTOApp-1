package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ac  reason: case insensitive filesystem */
public final class C0568Ac implements C1088Uc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final C3071zc f6140a;

    public C0568Ac(C3071zc zcVar) {
        this.f6140a = zcVar;
    }

    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            C1018Rk.d("App event with no name parameter.");
        } else {
            this.f6140a.a(str, map.get("info"));
        }
    }
}
