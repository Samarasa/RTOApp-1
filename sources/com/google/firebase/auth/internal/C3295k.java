package com.google.firebase.auth.internal;

import c.b.b.b.b.a.a;
import c.b.b.b.d.d.B;
import com.google.firebase.auth.r;
import java.util.Map;

/* renamed from: com.google.firebase.auth.internal.k  reason: case insensitive filesystem */
public final class C3295k {

    /* renamed from: a  reason: collision with root package name */
    private static final a f14386a = new a("GetTokenResultFactory", new String[0]);

    public static r a(String str) {
        Map map;
        try {
            map = C3294j.a(str);
        } catch (com.google.firebase.auth.a.a e2) {
            f14386a.a("Error parsing token claims", e2, new Object[0]);
            map = B.a();
        }
        return new r(str, map);
    }
}
