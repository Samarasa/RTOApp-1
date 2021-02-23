package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zd  reason: case insensitive filesystem */
public final class C3073zd<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f13078a;

    /* renamed from: b  reason: collision with root package name */
    public final C3019yla f13079b;

    /* renamed from: c  reason: collision with root package name */
    public final C1143Wf f13080c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f13081d;

    private C3073zd(C1143Wf wf) {
        this.f13081d = false;
        this.f13078a = null;
        this.f13079b = null;
        this.f13080c = wf;
    }

    private C3073zd(T t, C3019yla yla) {
        this.f13081d = false;
        this.f13078a = t;
        this.f13079b = yla;
        this.f13080c = null;
    }

    public static <T> C3073zd<T> a(C1143Wf wf) {
        return new C3073zd<>(wf);
    }

    public static <T> C3073zd<T> a(T t, C3019yla yla) {
        return new C3073zd<>(t, yla);
    }

    public final boolean a() {
        return this.f13080c == null;
    }
}
