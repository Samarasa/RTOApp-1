package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Ra  reason: case insensitive filesystem */
public final class C1008Ra {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<C1034Sa> f8477a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    static final AtomicBoolean f8478b = new AtomicBoolean();

    static C1034Sa a() {
        return f8477a.get();
    }

    public static void a(C1034Sa sa) {
        f8477a.set(sa);
    }
}
