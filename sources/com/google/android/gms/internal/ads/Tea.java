package com.google.android.gms.internal.ads;

import java.util.List;

abstract class Tea {

    /* renamed from: a  reason: collision with root package name */
    private static final Tea f8805a = new Vea();

    /* renamed from: b  reason: collision with root package name */
    private static final Tea f8806b = new Uea();

    private Tea() {
    }

    static Tea a() {
        return f8805a;
    }

    static Tea b() {
        return f8806b;
    }

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> a(Object obj, long j);

    /* access modifiers changed from: package-private */
    public abstract <L> void a(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    public abstract void b(Object obj, long j);
}
