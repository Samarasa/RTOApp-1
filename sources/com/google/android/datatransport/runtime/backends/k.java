package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import d.a.b;
import f.a.a;

public final class k implements b<j> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f5271a;

    /* renamed from: b  reason: collision with root package name */
    private final a<c.b.b.a.a.e.a> f5272b;

    /* renamed from: c  reason: collision with root package name */
    private final a<c.b.b.a.a.e.a> f5273c;

    public k(a<Context> aVar, a<c.b.b.a.a.e.a> aVar2, a<c.b.b.a.a.e.a> aVar3) {
        this.f5271a = aVar;
        this.f5272b = aVar2;
        this.f5273c = aVar3;
    }

    public static k a(a<Context> aVar, a<c.b.b.a.a.e.a> aVar2, a<c.b.b.a.a.e.a> aVar3) {
        return new k(aVar, aVar2, aVar3);
    }

    public j get() {
        return new j(this.f5271a.get(), this.f5272b.get(), this.f5273c.get());
    }
}
