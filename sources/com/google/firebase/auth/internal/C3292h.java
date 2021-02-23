package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.firebase.auth.internal.h  reason: case insensitive filesystem */
public final class C3292h {

    /* renamed from: a  reason: collision with root package name */
    private static final C3292h f14381a = new C3292h();

    /* renamed from: b  reason: collision with root package name */
    private final C3298n f14382b;

    /* renamed from: c  reason: collision with root package name */
    private final C3290f f14383c;

    private C3292h() {
        this(C3298n.a(), C3290f.a());
    }

    private C3292h(C3298n nVar, C3290f fVar) {
        this.f14382b = nVar;
        this.f14383c = fVar;
    }

    public static C3292h a() {
        return f14381a;
    }

    public final void a(Context context) {
        this.f14382b.a(context);
    }

    public final void a(FirebaseAuth firebaseAuth) {
        this.f14382b.a(firebaseAuth);
    }
}
