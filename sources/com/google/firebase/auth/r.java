package com.google.firebase.auth;

import java.util.Map;

public class r {

    /* renamed from: a  reason: collision with root package name */
    private String f14422a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Object> f14423b;

    public r(String str, Map<String, Object> map) {
        this.f14422a = str;
        this.f14423b = map;
    }

    public Map<String, Object> a() {
        return this.f14423b;
    }

    public String b() {
        Map map = (Map) this.f14423b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }
}
