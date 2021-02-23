package com.google.android.gms.internal.ads;

final class Ida {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f7307a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f7308b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a() {
        return f7307a != null && !f7308b;
    }

    static Class<?> b() {
        return f7307a;
    }
}
