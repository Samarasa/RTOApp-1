package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oea  reason: case insensitive filesystem */
final class C2296oea {

    /* renamed from: a  reason: collision with root package name */
    private static final C2154mea<?> f11600a = new C2083lea();

    /* renamed from: b  reason: collision with root package name */
    private static final C2154mea<?> f11601b = c();

    static C2154mea<?> a() {
        return f11600a;
    }

    static C2154mea<?> b() {
        C2154mea<?> mea = f11601b;
        if (mea != null) {
            return mea;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static C2154mea<?> c() {
        try {
            return (C2154mea) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
