package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import d.a.b;
import f.a.a;

public final class m implements b<l> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f5279a;

    /* renamed from: b  reason: collision with root package name */
    private final a<j> f5280b;

    public m(a<Context> aVar, a<j> aVar2) {
        this.f5279a = aVar;
        this.f5280b = aVar2;
    }

    public static m a(a<Context> aVar, a<j> aVar2) {
        return new m(aVar, aVar2);
    }

    public l get() {
        return new l(this.f5279a.get(), this.f5280b.get());
    }
}
