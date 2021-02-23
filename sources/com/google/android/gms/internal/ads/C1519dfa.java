package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dfa  reason: case insensitive filesystem */
final class C1519dfa {

    /* renamed from: a  reason: collision with root package name */
    private static final C1377bfa f10163a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final C1377bfa f10164b = new C1589efa();

    static C1377bfa a() {
        return f10163a;
    }

    static C1377bfa b() {
        return f10164b;
    }

    private static C1377bfa c() {
        try {
            return (C1377bfa) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
