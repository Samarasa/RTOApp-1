package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rfa  reason: case insensitive filesystem */
final class C2510rfa {

    /* renamed from: a  reason: collision with root package name */
    private static final C2369pfa f12001a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final C2369pfa f12002b = new C2227nfa();

    static C2369pfa a() {
        return f12001a;
    }

    static C2369pfa b() {
        return f12002b;
    }

    private static C2369pfa c() {
        try {
            return (C2369pfa) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
